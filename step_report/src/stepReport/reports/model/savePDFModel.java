/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.reports.model;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.util.Matrix;
import stepReport.control.ReportControl;



/**
 *
 * @author Kildare
 */
public class savePDFModel {
    
    private ReportControl Control;

    private static final int REGISTROS_PAGINA = 25;
    public savePDFModel(ReportControl control){
        this.Control = control;
    }
    public savePDFModel(){
        
    }
    
    
    public void savePDFSemanal(File file,String[][] matrizDados) 
    {
        
       if(matrizDados == null) 
           return;
        
       //Cria o documento
       PDDocument document = new PDDocument();
       
       //Vou criando as paginas dinamicamente de acordo com o numero de registros a serem impressos.
       //Para cada 25 registros, crio uma nova pagina
       //O valor de k vai ser atualizado durante o loop de impressao de registros,
       //assim como o loop de impressao de registro comeca a partir do valor de k
       int k=1;
       int pagina=0;
       while(k<matrizDados.length)
       {
            //Variavel com o numero da pagina
            pagina++;
            //Adiciona uma pagina
            PDPage page = new PDPage();
            //Configura o padrao de tamanho da pagina
            page.setMediaBox(PDRectangle.A4);
            //Configura a orientacao
            page.setRotation(90);
            //Adiciona a pagina ao documento
            document.addPage(page);
            PDFont font;
            //Obtem a largura da pagina
            float pageWidth = page.getMediaBox().getWidth();
           
            try 
            {
                //abre o buffer pra edicao da pagina
                PDPageContentStream contentStream = new PDPageContentStream(document, page);
                //Gira a pagina em 90 graus
                contentStream.transform(new Matrix(0,1,-1,0,pageWidth,0));
                
                PDImageXObject pdImage = PDImageXObject.createFromFile("./step2.png", document);
                contentStream.drawImage(pdImage, 30, 520);
                
                
                //Define a cor da letra
                contentStream.setNonStrokingColor(Color.BLACK);
                //Abre pra edicao escrita
                contentStream.beginText();
                
                //Configura a fonte de titulo e o tamanho no buffer
                font = PDType1Font.COURIER_BOLD;
                contentStream.setFont(font, 18);
                contentStream.setLeading(14.5f);
                
                contentStream.newLineAtOffset(250, 530);
                contentStream.showText("Resumo de Horas semanais");
                
                //Imprime o numero da pagina
                font = PDType1Font.COURIER;
                contentStream.setFont(font, 12);
                
                contentStream.newLineAtOffset(490,0);
                contentStream.showText("Pag "+Integer.toString(pagina));
                
                //Define o ponto de partida em X e Y
                contentStream.newLineAtOffset(-700, -50);
                //Define a fonte do cabecalho
                font = PDType1Font.COURIER_BOLD;
                contentStream.setFont(font, 12);
                //carrega o cabecalho com nome, profissao, itera pra cada data da semana e depois o total
                String titulo = StringUtils.rightPad("Nome", 20) + StringUtils.rightPad("Profissao", 16);
                for(int i=2;i<matrizDados[0].length;i++)
                    titulo += matrizDados[0][i]+"  ";

                //Escreve o cabecalho
                contentStream.showText(titulo);
                //Troca a fonte pra normal
                font = PDType1Font.COURIER;
                contentStream.setFont(font, 12);
                //TODO criar loop duplo para criar pagina e depois imprimir o dado enquanto houver dados a serem impressos
                contentStream.newLine();
                
                //Para cada linha da matriz recebida, vou formatar os campos nome, profissao, cada data da semana e o total pra imprimir na linha
                //Tenho que comecar a partir de k porque pode nao ser a primeira pagina. 
                
                //Configuro o limite baseado se eu estou ou nao na ultima pagina
                int limite = (k+savePDFModel.REGISTROS_PAGINA<matrizDados.length-1) ? savePDFModel.REGISTROS_PAGINA : matrizDados.length - k;
                
                
                for(int i=0;i<limite;i++)
                {
                    String nome = this.formatName(matrizDados[i+k][0]);
                    String profissao = this.formatProfissao(matrizDados[i+k][1]);
                    String linha = nome + profissao;
                    for(int j=2;j<matrizDados[i].length;j++)
                        linha += StringUtils.rightPad(matrizDados[i+k][j],12);
                    
                    contentStream.showText(linha);
                    contentStream.newLine();
                }
                k+=limite;
                
                //Imprime o total em negrito quando chega no final
                System.out.println(k);
                if(k>=matrizDados.length)
                {
                    font = PDType1Font.COURIER_BOLD;
                    contentStream.setFont(font, 12);
                    Double[] totais = new Double[matrizDados[0].length-2];
                    for(int i=0;i<totais.length;i++)
                        totais[i]=0.0;
                    
                    for(int i=1;i<matrizDados.length;i++){
                        for(int j=2;j<matrizDados[i].length;j++){
                            if(!matrizDados[i][j].equals(""))
                                totais[j-2] += Double.parseDouble(matrizDados[i][j]);
                        }
                    }
                    String linhaTot = StringUtils.rightPad("Totais",36);
                    for(int i=0;i<totais.length;i++){
                        linhaTot +=StringUtils.rightPad(totais[i].toString(),12);
                    }
                    contentStream.showText(linhaTot);
                    //Imprime a linha de assinatura
                    this.signatureLine(contentStream);
                }
                contentStream.endText();
                contentStream.close();
                

            } 
            catch (IOException ex) 
            {
                Logger.getLogger(savePDFModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            //Esse save vai dentro do loop?
            document.save(file);
            document.close();        
        } catch (IOException ex) {
            Logger.getLogger(savePDFModel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
        
    }

    //Formata um nome para ser exibido no relatorio, caso seja maior que 25 caracteres.
    private String formatName(String nome) {
        if(nome.length()>20){
            String[] divNome = nome.split(" ");
            nome = "";
            if(divNome.length>1)
            {
                for(int i=0;i<divNome.length-1;i++)
                {
                    nome += divNome[i].substring(0, 1)+ " ";
                }
                nome+= divNome[divNome.length-1];
            }
            if(nome.length()>25)
                nome = nome.substring(0, 17) + "...";
        }
        nome = StringUtils.rightPad(nome, 20);
        int tam = nome.length();
        return nome;
    }

    private String formatProfissao(String profissao) {
        profissao = profissao.toLowerCase();
        if(profissao.length()>15)
            profissao = profissao.substring(0, 12) + "...";
        
        
        profissao = StringUtils.rightPad(profissao, 16);
        return profissao;
    }

    /**
     * Imprime a linha de assinatura
    */
    private void signatureLine(PDPageContentStream contentStream) throws IOException {
        PDType1Font font = PDType1Font.COURIER;
        contentStream.setFont(font, 12);
          
        contentStream.newLine();
        contentStream.newLine();
        contentStream.showText("Step Signature");
        contentStream.newLine();
        contentStream.newLine();
        contentStream.showText("____________________________");
        contentStream.newLineAtOffset(250,29);
        contentStream.showText("Client Signature");
        contentStream.newLine();
        contentStream.newLine();
        contentStream.showText("____________________________");
    }
    
}
