    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.Util;

/**
 *
 * @author Kildare
 */
public class FuncionarioHoras {
    private String idHoras;
    private String idFunc;
    private String nomeFunc;
    private String dataSemana;
    private String diaSemana;
    private String horas;
    private String taskNumber;
    private String nam;
    private String bsp;
    private String unidade;



    public FuncionarioHoras(String idHoras, String idFunc, String dataSemana, String diaSemana, String horas,
        String taskNumber,String nam,String bsp, String unidade){
            this.idHoras = idHoras;
            this.idFunc=idFunc;
            this.nomeFunc=nomeFunc;
            this.dataSemana=dataSemana;
            this.diaSemana=diaSemana;
            this.horas=horas;
            this.taskNumber=taskNumber;
            this.nam=nam;
            this.bsp=bsp;
            this.unidade=unidade;
    }
    

    public FuncionarioHoras(String idHoras, String idFunc, String nomeFunc, String dataSemana, String diaSemana, 
                            String horas, String taskNumber,String nam,String bsp, String unidade){
            this.idHoras = idHoras;
            this.idFunc=idFunc;
            this.nomeFunc = nomeFunc;
            this.dataSemana=dataSemana;
            this.diaSemana=diaSemana;
            this.horas=horas;
            this.taskNumber=taskNumber;
            this.nam=nam;
            this.bsp=bsp;
            this.unidade=unidade;
    }

    public String getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(String idFunc) {
        this.idFunc = idFunc;
    }
    
    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDataSemana() {
        return dataSemana;
    }

    public void setDataSemana(String dataSemana) {
        this.dataSemana = dataSemana;
    }
    
     public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(String taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getBsp() {
        return bsp;
    }

    public void setBsp(String bsp) {
        this.bsp = bsp;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Object getFormattedDataSemana() {
        char[] c = this.getDataSemana().toCharArray();
        String str =  this.getDataSemana().substring(6, 8)+"/"+ this.getDataSemana().substring(4, 6)
                + "/" + this.getDataSemana().substring(0, 4);
        
        return str;
    }
    
    
}
