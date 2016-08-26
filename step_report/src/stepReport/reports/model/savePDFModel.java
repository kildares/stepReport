/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.reports.model;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/**
 *
 * @author Kildare
 */
public class savePDFModel {

    public void savePDF(File file) 
    {
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
            contentStream.moveTextPositionByAmount(100, 700);
            contentStream.drawString("MY TEXT");            
            
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
