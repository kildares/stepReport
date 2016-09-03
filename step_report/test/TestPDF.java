
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import stepReport.Util.FuncionarioHoras;
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
        
        List<FuncionarioHoras> list = new ArrayList<FuncionarioHoras>();
        list.add(new FuncionarioHoras("1","20"));
        list.add(new FuncionarioHoras("BBB","CCC","DDD"));
        list.add(new FuncionarioHoras("AAA","BBB","CCC"));
        savePDFModel pdf = new savePDFModel();
        
        File fp = new File("./ABC.pdf");
        
        pdf.savePDF(fp, list);
        
        
    }
}
