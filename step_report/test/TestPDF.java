
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
        
        
        list.add(new FuncionarioHoras("1","1","20160911","Joao das Couve","8","8","8","8","8","8","8"));
        list.add(new FuncionarioHoras("2","1","20160918","Joao das Couve","6","8","8","8","8","8","8"));
        list.add(new FuncionarioHoras("3","1","20160925","Joao das Couve","6","8","8","4","4","4","8"));
        list.add(new FuncionarioHoras("4","2","20160912","Maria das Gracas","6","6","6","6","6","6","6"));
        list.add(new FuncionarioHoras("5","1","20160912","Maria das Gracas","8","8","8","8","8","8","8"));
        list.add(new FuncionarioHoras("6","1","20160912","Joao das Couve","8","8","8","8","8","8","8"));
        savePDFModel pdf = new savePDFModel();
        
        File fp = new File("./ABC.pdf");
        
        pdf.savePDF(fp, list);
        
        
    }
}
