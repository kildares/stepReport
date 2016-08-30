
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import stepReport.Util.FuncionarioData;
import stepReport.reports.model.savePDFModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kildare
 */
public class TestPDF {
    public static void main(String args[]){
        
        List<FuncionarioData> list = new ArrayList<FuncionarioData>();
        list.add(new FuncionarioData("AAA","BBB","CCC"));
        list.add(new FuncionarioData("BBB","CCC","DDD"));
        list.add(new FuncionarioData("AAA","BBB","CCC"));
        savePDFModel pdf = new savePDFModel();
        
        File fp = new File("./ABC.pdf");
        
        pdf.savePDF(fp, list);
        
        
    }
}
