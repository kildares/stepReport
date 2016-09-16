/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Kildare
 */
public final class FuncionarioHorasSemana implements Comparable{
    
    private String nome;
    private String profissao;
    private String dataSemana;
    private String numHoras;

    
    public FuncionarioHorasSemana(String nome,String profissao,String dataSemana,List<FuncionarioHoras> horas)
    {
        this.nome=nome;
        this.profissao=profissao;
        this.dataSemana=dataSemana;
        this.numHoras= this.getTotalHorasSemana(horas);
    }
    
    public String getTotalHorasSemana(List<FuncionarioHoras> horas) {
        double totHoras=0.0;
        for(FuncionarioHoras dia : horas){
            totHoras +=Double.parseDouble(dia.getHoras());
        }
        
        return Double.toString(totHoras);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getDataSemana() {
        return dataSemana;
    }

    public void setDataSemana(String dataSemana) {
        this.dataSemana = dataSemana;
    }

    public static String getTotalHorasSemanais(List<FuncionarioHorasSemana> list){
        Double cont = 0.0;
        for(FuncionarioHorasSemana func : list){
            cont+= Double.parseDouble(func.getNumHoras());
        }
        return Double.toString(cont);
    } 

    public static List<FuncionarioHorasSemana> orderList(List<FuncionarioHorasSemana> list){
        Collections.sort(list);
        return list;
    }
    
    public static Map<String,List<FuncionarioHorasSemana>> orderMap(Map<String,List<FuncionarioHorasSemana>> map){
        
        for(String i : map.keySet()){
            Collections.sort(map.get(i));
        }
        return map;
    }
    
    
    public static List<String> obtainDatasSemana(Map<String,List<FuncionarioHorasSemana>> func){
        List<String> lista = new ArrayList<String>();
        for(String i : func.keySet())
        {
            for(FuncionarioHorasSemana horaFunc : func.get(i))
            {
                if(!lista.contains(horaFunc.getDataSemana()))
                    lista.add(horaFunc.getDataSemana());
            }
        }
        return lista;
    }
    
    public static String getFormattedDataSemana(String dataSemana) {
            char[] c = dataSemana.toCharArray();
            String str =  dataSemana.substring(6, 8)+"/"+ dataSemana.substring(4, 6)
                + "/" + dataSemana.substring(2, 4);
        return str;
    }
    
    
    public String getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(String numHoras) {
        this.numHoras = numHoras;
    }

    @Override
    public int compareTo(Object outraSemana) {
        Integer iniOutraSemana = Integer.parseInt(((FuncionarioHorasSemana)outraSemana).getDataSemana());
        Integer iniMinhaSemana = Integer.parseInt(this.getDataSemana());
        
        if(iniMinhaSemana < iniOutraSemana)
            return -1;
        else if(iniMinhaSemana > iniOutraSemana)
           return 1;
        return 0;
    }
    
    
        public Object getFormattedDataSemana() {
            char[] c = this.getDataSemana().toCharArray();
            String str =  this.getDataSemana().substring(6, 8)+"/"+ this.getDataSemana().substring(4, 6)
                + "/" + this.getDataSemana().substring(2, 4);
        
        return str;
    }
    

}
