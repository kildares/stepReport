/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.Util;

import java.util.List;

/**
 *
 * @author Kildare
 */
public class FuncionarioHorasSemana {
    
    private String nome;
    private String profissao;
    private String dataSemana;
    private List<FuncionarioHoras> horas;
    
    public FuncionarioHorasSemana(String nome,String profissao,String dataSemana,List<FuncionarioHoras> horas)
    {
        this.nome=nome;
        this.profissao=profissao;
        this.dataSemana=dataSemana;
        this.horas=horas;
    }
    
    public String getTotalHoras() {
        double totHoras=0.0;
        for(FuncionarioHoras dia : this.horas){
            totHoras +=Double.parseDouble(dia.getHoras());
        }
        
        return Double.toString(totHoras);
    }
}
