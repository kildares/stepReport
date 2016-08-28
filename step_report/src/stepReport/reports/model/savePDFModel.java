/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.reports.model;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import stepReport.Util.FuncionarioData;
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
    
    
    public void savePDF(File file, List<FuncionarioData> list) 
    {
        
       if(list == null) 
           return;
        
       PDDocument document = new PDDocument();
       PDPage page = new PDPage();
       document.addPage(page);
       PDFont font = PDType1Font.HELVETICA;

        //
        try 
        {
            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.beginText();
            contentStream.setFont(font, 12);
            contentStream.setLeading(14.5f);
            contentStream.newLineAtOffset(50, 700);
            contentStream.showText("ID NOME TOTAL DE HORAS");
            contentStream.newLine();
//contentStream.newLine();
            for(FuncionarioData func : list){
                contentStream.showText(func.getNumero() +" "+func.getHoras()+" "+func.getPeriodo());
                contentStream.newLine();
            
            }
            
            
            contentStream.endText();
            
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
