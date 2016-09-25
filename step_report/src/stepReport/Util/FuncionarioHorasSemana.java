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
import java.util.Vector;

/**
 *
 * @author Kildare
 */
public final class FuncionarioHorasSemana implements Comparable{

   

    private String idFunc;

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
    
    public FuncionarioHorasSemana(String idFunc,String dataSemana)
    {
        this.idFunc = idFunc;
        this.dataSemana=dataSemana;
        this.numHoras= "0";
    }
    
    
    
    public String getTotalHorasSemana(List<FuncionarioHoras> horas) {
        double totHoras=0.0;
        for(FuncionarioHoras dia : horas){
            totHoras +=Double.parseDouble(dia.getHoras());
        }
        
        return Double.toString(totHoras);
    }
    
    public void addNumHoras(String numHoras)
    {
        int horasSemana = Integer.parseInt(this.getNumHoras());
        this.setNumHoras(Integer.toString(horasSemana + Integer.parseInt(numHoras)));
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
    
    
    public String getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(String idFunc) {
        this.idFunc = idFunc;
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
    
    
    public static List<String> obtainDatasSemana(List<FuncionarioHorasSemana> semanas){
        List<String> lista = new ArrayList<String>();
        
        for(FuncionarioHorasSemana horaFunc : semanas)
        {
            if(!lista.contains(horaFunc.getDataSemana()))
                lista.add(horaFunc.getDataSemana());
        }
        return lista;
    }
    public static List<String> obtainIdFuncionarios(List<FuncionarioHorasSemana> semanas){
        List<String> lista = new ArrayList<String>();
        
        for(FuncionarioHorasSemana horaFunc : semanas)
        {
            if(!lista.contains(horaFunc.getIdFunc()))
                lista.add(horaFunc.getIdFunc());
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
        
    public static List<FuncionarioHorasSemana> parseFuncionarioHorasSemana(List<FuncionarioHoras> horas) {
        
        List<FuncionarioHorasSemana> list = new ArrayList<FuncionarioHorasSemana>();
        FuncionarioHorasSemana actual = null;
        
        for(FuncionarioHoras hora : horas){
            boolean isFound = false;
            for(FuncionarioHorasSemana func : list)
            {
                if(hora.getIdFunc().equals(func.getIdFunc())&&hora.getDataSemana().equals(func.getDataSemana()))
                {
                    func.addNumHoras(hora.getHoras());
                    isFound=true;
                    break;
                }
                
            }
            if(!isFound){
                actual = new FuncionarioHorasSemana(hora.getIdFunc(),hora.getDataSemana());
                actual.addNumHoras(hora.getHoras());
                list.add(actual);
            }
        }
        return list;
    }
    
     public static Vector getSemanas(List<FuncionarioHorasSemana> horasSemana) {
         Vector<String> datas = new Vector<String>();
         
         for(FuncionarioHorasSemana func : horasSemana){
             if(!datas.contains(FuncionarioHorasSemana.getFormattedDataSemana(func.getDataSemana())))
                 datas.add(FuncionarioHorasSemana.getFormattedDataSemana(func.getDataSemana()));
         }
             
         return datas;
    }


}
