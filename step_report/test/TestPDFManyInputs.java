
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
public class TestPDFManyInputs {
    public static void main(String args[])
    {
        int numRegistros = 1001;
        String matrizDados[][] = new String[numRegistros][5];
        matrizDados[0][0]="Nome";
        matrizDados[0][1]="Profissão";
        matrizDados[0][2]="18/09/2016";
        matrizDados[0][3]="25/09/2016";
        matrizDados[0][4]="Total";
        for(int i=1;i<numRegistros;i++){
            matrizDados[i][0]="Dummy"+Integer.toString(i);
            matrizDados[i][1]="TECNICO";
            matrizDados[i][2]="25.0";
            matrizDados[i][3]="37.0";
            matrizDados[i][4]="62.0";
        }
        
        savePDFModel pdf = new savePDFModel();
        
        File fp = new File("./ABC.pdf");
        
        pdf.savePDFSemanal(fp, matrizDados);
        
        
    }
}
