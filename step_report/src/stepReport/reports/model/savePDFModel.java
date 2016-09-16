/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.reports.model;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.util.Matrix;
import stepReport.Util.FuncionarioHoras;
import stepReport.Util.FuncionarioHorasSemana;
import stepReport.control.ReportControl;

/**
 *
 * @author Kildare
 */
public class savePDFModel {
    
    private ReportControl Control;

    public savePDFModel(ReportControl control){
        this.Control = control;
    }
    public savePDFModel(){
        
    }
    
    
    public void savePDFSemanal(File file, Map<String,List<FuncionarioHorasSemana>> semanal) 
    {
        
       if(semanal == null) 
           return;
        
       PDDocument document = new PDDocument();
       PDPage page = new PDPage();
       document.addPage(page);
       PDFont font = PDType1Font.HELVETICA;
       float pageWidth = page.getMediaBox().getWidth();
        //
        try 
        {
             
            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.transform(new Matrix(0,1,-1,0,pageWidth,0));
            
            //contentStream.setStrokingColor(Color.BLACK);
            //contentStream.setNonStrokingColor(Color.WHITE);
            //contentStream.addRect(100,100,300,300);
            //contentStream.addRect(40,540,100,30);
            //contentStream.addRect(140,540,100,30);
            //contentStream.addRect(240,540,100,30);
            //contentStream.fillAndStroke();
            contentStream.setNonStrokingColor(Color.BLACK);
            
            contentStream.beginText();
            contentStream.setFont(font, 12);
            contentStream.setLeading(14.5f);
            contentStream.newLineAtOffset(50, 550);
            contentStream.showText("Nome");
            contentStream.newLineAtOffset(140, 0);
            contentStream.showText("Profissão");
            
            contentStream.newLineAtOffset(90, 0);
            int cont2=0;
            for(String dataSemana : FuncionarioHorasSemana.obtainDatasSemana(semanal))
            {
                contentStream.showText(FuncionarioHorasSemana.getFormattedDataSemana(dataSemana));
                contentStream.newLineAtOffset(90, 0);
                cont2++;
            }
            contentStream.newLineAtOffset((6-cont2)*60, 0);
            contentStream.showText("Total de Horas");
            
            
            //TODO criar loop duplo para criar pagina e depois imprimir o dado enquanto houver dados a serem impressos
            contentStream.newLineAtOffset(-620, -30);
            
            for(String numero : semanal.keySet())
            {    
                if(semanal.get(numero)==null || semanal.get(numero).isEmpty())
                    continue;
                
                String nomeAtual = semanal.get(numero).get(0).getNome();
                String profissao = semanal.get(numero).get(0).getProfissao();
                
                contentStream.showText(StringUtils.rightPad(nomeAtual, 140, " "));
                contentStream.newLineAtOffset(140, 0);
                contentStream.showText(StringUtils.rightPad(profissao, 70, " "));
                contentStream.newLineAtOffset(70, 0);
                
                int cont=0;
                
                for(FuncionarioHorasSemana data : semanal.get(numero)){
                    contentStream.showText(StringUtils.rightPad(data.getNumHoras(), 60, " "));
                    contentStream.newLineAtOffset(0, 30);
                    cont++;
                }
                
                contentStream.newLineAtOffset((7-cont)*60, 0);
                contentStream.showText(FuncionarioHorasSemana.getTotalHorasSemanais(semanal.get(numero)));
                contentStream.newLineAtOffset(-630, -60);
            }
            
            contentStream.newLineAtOffset(-400, -50);
            contentStream.showText("Step Signature");
            contentStream.newLine();
            contentStream.newLine();
            contentStream.showText("____________________________");
            contentStream.newLineAtOffset(250,29);
            contentStream.showText("Client Signature");
            contentStream.newLine();
            contentStream.newLine();
            contentStream.showText("____________________________");
            
            contentStream.endText();
            
            
         //   stream.setLineWidth(3);
            //contentStream.moveTo(100, 100);
           // stream.lineTo(400, 400);
           // stream.lineTo(100, 400);
          //  stream.lineTo(100, 100);
           // stream.lineTo(400, 100);
          //  stream.lineTo(400, 400);
          //  stream.lineTo(250, 550);
          ///  stream.lineTo(100, 400);
          //  stream.lineTo(400, 100); 
          //  stream.stroke();
            contentStream.close();
            document.save(file);
            document.close();
            
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(savePDFModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
