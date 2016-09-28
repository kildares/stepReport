
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
        
        
        /*list.add(new FuncionarioHoras("1","1","Joao das Couve","20160918","SEG","8","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("1","1","Joao das Couve","20160918","TER","8","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("1","1","Joao das Couve","20160918","QUAR","6","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("1","1","Joao das Couve","20160918","QUI","3","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("1","1","Joao das Couve","20160918","SEX","6","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("1","1","Joao das Couve","20160918","SAB","1","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("1","1","Joao das Couve","20160918","DOM","6","TASK","NAM","BSP","UNIDADE"));
        
        
        List<FuncionarioHorasSemana> listaSemana = new ArrayList<FuncionarioHorasSemana>();
        listaSemana.add(new FuncionarioHorasSemana("Joao das Couve","TECNICO","20160918",list));
        
        FuncionarioHorasSemana.orderList(listaSemana);
        
        Map<String,List<FuncionarioHorasSemana>> semanal = new HashMap<String,List<FuncionarioHorasSemana>>();
        semanal.put("1", listaSemana);
        
        list = new ArrayList<FuncionarioHoras>();
        list.add(new FuncionarioHoras("2","2","Maria das gracasMaria das gracas","20160925","SEG","8","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("2","2","Maria das gracasMaria das gracas","20160925","TER","2","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("2","2","Maria das gracasMaria das gracas","20160925","QUAR","6","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("2","2","Maria das gracasMaria das gracas","20160925","QUI","6","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("2","2","Maria das gracasMaria das gracas","20160925","SEX","6","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("2","2","Maria das gracasMaria das gracas","20160925","SAB","6","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("2","2","Maria das gracasMaria das gracas","20160925","DOM","2","TASK","NAM","BSP","UNIDADE"));
        
        listaSemana = new ArrayList<FuncionarioHorasSemana>();
        listaSemana.add(new FuncionarioHorasSemana("Maria das gracasMaria das gracas","ENGENHEIRA CIVIL","20160926",list));
        FuncionarioHorasSemana.orderList(listaSemana);
        semanal.put("2", listaSemana);
        
        
        list = new ArrayList<FuncionarioHoras>();
        list.add(new FuncionarioHoras("3","3","Ryu Hayabusa","20161002","SEG","8","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("3","3","Ryu Hayabusa","20161002","TER","8","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("3","3","Ryu Hayabusa","20161002","QUAR","6","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("3","3","Ryu Hayabusa","20161002","QUI","6","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("3","3","Ryu Hayabusa","20161002","SEX","6","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("3","3","Ryu Hayabusa","20161002","SAB","6","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("3","3","Ryu Hayabusa","20161002","DOM","10","TASK","NAM","BSP","UNIDADE"));
        
        listaSemana = new ArrayList<FuncionarioHorasSemana>();
        listaSemana.add(new FuncionarioHorasSemana("Ryu Hayabusa","Ninja","20161002",list));
        FuncionarioHorasSemana.orderList(listaSemana);
        semanal.put("3", listaSemana);
        
        list = new ArrayList<FuncionarioHoras>();
        list.add(new FuncionarioHoras("4","3","Ryu Hayabusa","20161009","SEG","8","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("4","3","Ryu Hayabusa","20161009","TER","8","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("4","3","Ryu Hayabusa","20161009","QUAR","2","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("4","3","Ryu Hayabusa","20161009","QUI","4","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("4","3","Ryu Hayabusa","20161009","SEX","6","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("4","3","Ryu Hayabusa","20161009","SAB","2","TASK","NAM","BSP","UNIDADE"));
        list.add(new FuncionarioHoras("4","3","Ryu Hayabusa","20161009","DOM","12","TASK","NAM","BSP","UNIDADE"));
        
        listaSemana = new ArrayList<FuncionarioHorasSemana>();
        listaSemana.add(new FuncionarioHorasSemana("Ryu Hayabusa","Ninja","20161009",list));
        FuncionarioHorasSemana.orderList(listaSemana);
        semanal.put("4", listaSemana);
        
        FuncionarioHorasSemana.orderMap(semanal);*/
        
        String matrizDados[][] = new String[4][7];
        matrizDados[0][0]="Nome";
        matrizDados[0][1]="Profissão";
        matrizDados[0][2]="25/09/2016";
        matrizDados[0][3]="02/10/2016";
        matrizDados[0][4]="09/10/2016";
        matrizDados[0][5]="16/10/2016";
        matrizDados[0][6]="Total";
        matrizDados[1][0]="Joao das Couve";
        matrizDados[1][1]="TECNICO";
        matrizDados[1][2]="40.0";
        matrizDados[1][3]="32.0";
        matrizDados[1][4]="";
        matrizDados[1][5]="20.0";
        matrizDados[1][6]="92.0";
        matrizDados[2][0]="Maria das gracasMaria das gracas";
        matrizDados[2][1]="ENGENHEIRA CIVIL";
        matrizDados[2][2]="";
        matrizDados[2][3]="";
        matrizDados[2][4]="22.0";
        matrizDados[2][5]="22.0";
        matrizDados[2][6]="44.0";
        matrizDados[3][0]="Ryu Hayabusa";
        matrizDados[3][1]="Ninja";
        matrizDados[3][2]="35.0";
        matrizDados[3][3]="35.0";
        matrizDados[3][4]="";
        matrizDados[3][5]="50.0";
        matrizDados[3][6]="120.0";
        
        savePDFModel pdf = new savePDFModel();
        
        File fp = new File("./ABC.pdf");
        
        pdf.savePDFSemanal(fp, matrizDados);
        
        
    }
}
