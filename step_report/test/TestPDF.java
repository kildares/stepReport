
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import stepReport.Util.FuncionarioHoras;
import stepReport.Util.FuncionarioHorasSemana;
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
        
        
        list.add(new FuncionarioHoras("1","1","Joao das Couve","20160918","SEG","8","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("1","1","Joao das Couve","20160918","TER","8","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("2","1","Joao das Couve","20160918","QUAR","6","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("2","1","Joao das Couve","20160918","QUI","6","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("2","1","Joao das Couve","20160918","SEX","6","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("2","1","Joao das Couve","20160918","SAB","6","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("2","1","Joao das Couve","20160918","DOM","6","TASK","NAM","BSP","UNIDADE"));
        
        
        List<FuncionarioHorasSemana> listaSemana = new ArrayList<FuncionarioHorasSemana>();
        listaSemana.add(new FuncionarioHorasSemana("Joao das Couve","TECNICO","20160918",list));
        
        FuncionarioHorasSemana.orderList(listaSemana);
        
        Map<String,List<FuncionarioHorasSemana>> semanal = new HashMap<String,List<FuncionarioHorasSemana>>();
        semanal.put("1", listaSemana);
        savePDFModel pdf = new savePDFModel();
        
        File fp = new File("./ABC.pdf");
        
        pdf.savePDFSemanal(fp, semanal);
        
        
    }
}
