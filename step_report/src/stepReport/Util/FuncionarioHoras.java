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


    public FuncionarioHoras(String idHoras, String idFunc,String dataSemana, String diaSemana,String horas,
                            String taskNumber,String nam,String bsp, String unidade){
            this.idHoras = idHoras;
            this.idFunc=idFunc;
            this.dataSemana=dataSemana;
            this.diaSemana=diaSemana;
            this.horas=horas;
            this.taskNumber=taskNumber;
            this.nam=nam;
            this.bsp=bsp;
            this.unidade=unidade;
    }
    
    public FuncionarioHoras(String idHoras, String idFunc, String nomeFunc, String dataSemana,String horasDomingo,String horasSegunda,String horasTerca,String horasQuarta,String horasQuinta,
            String horasSexta,String horasSabado){
        this.idHoras=idHoras;
        this.idFunc=idFunc;
        this.nomeFunc=nomeFunc;
        this.dataSemana=dataSemana;
        this.horasDomingo=horasDomingo;
        this.horasSegunda=horasSegunda;
        this.horasTerca=horasTerca;
        this.horasQuarta=horasQuarta;
        this.horasQuinta=horasQuinta;
        this.horasSexta=horasSexta;
        this.horasSabado=horasSabado;
    }
    
    public String getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(String idFunc) {
        this.idFunc = idFunc;
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

    public String getTotalHoras(String data) {
        
        int tot =0;
        if(!data.isEmpty()){    
            String dataAno = data.substring(0, 4);
            String dataMes = data.substring(4, 6);
            if(this.dataSemana.substring(0, 4).equals(dataAno)&&this.dataSemana.substring(4, 6).equals(dataMes)){
                int dia = Integer.parseInt(this.dataSemana.substring(6, 8));
                if(dia==1){
                    tot = Integer.parseInt(this.getHorasDomingo());
                    return Integer.toString(tot);
                }
                else if(dia==2){
                    tot = Integer.parseInt(this.getHorasDomingo()) + Integer.parseInt(this.getHorasSabado());
                    return Integer.toString(tot);
                }
                else if(dia==3){
                    tot = Integer.parseInt(this.getHorasDomingo()) + Integer.parseInt(this.getHorasSabado()) + Integer.parseInt(this.getHorasSexta());
                    return Integer.toString(tot);
                }
                else if(dia==4){
                    tot = Integer.parseInt(this.getHorasDomingo()) + Integer.parseInt(this.getHorasSabado()) + Integer.parseInt(this.getHorasSexta())
                            +Integer.parseInt(this.getHorasQuinta());
                    return Integer.toString(tot);
                }
                else if(dia==5){
                    tot = Integer.parseInt(this.getHorasDomingo()) + Integer.parseInt(this.getHorasSabado()) + Integer.parseInt(this.getHorasSexta())
                            +Integer.parseInt(this.getHorasQuinta()) + Integer.parseInt(this.getHorasQuarta());
                    return Integer.toString(tot);
                }
                else if(dia==6){
                    tot = Integer.parseInt(this.getHorasDomingo()) + Integer.parseInt(this.getHorasSabado()) + Integer.parseInt(this.getHorasSexta())
                            +Integer.parseInt(this.getHorasQuinta()) + Integer.parseInt(this.getHorasQuarta()) + Integer.parseInt(this.getHorasTerca());
                    return Integer.toString(tot);
                }
                else{
                    tot = 
                    Integer.parseInt(this.getHorasSegunda()) +
                    Integer.parseInt(this.getHorasTerca()) +
                    Integer.parseInt(this.getHorasQuarta()) +
                    Integer.parseInt(this.getHorasQuinta()) +
                    Integer.parseInt(this.getHorasSexta()) +
                    Integer.parseInt(this.getHorasSabado()) +
                    Integer.parseInt(this.getHorasDomingo());
                    return Integer.toString(tot);
                }
            }
            //TODO TRATAR MELHOR CASO ANUAL ||!dataAno.equals(this.dataSemana.substring(0, 4))
            else if(!dataMes.equals(this.dataSemana.substring(4, 6))){
                int dia = Integer.parseInt(this.dataSemana.substring(6, 8));
                if(dia==1){
                    tot = Integer.parseInt(this.getHorasSegunda()) +
                            Integer.parseInt(this.getHorasTerca()) +
                            Integer.parseInt(this.getHorasQuarta()) +
                            Integer.parseInt(this.getHorasQuinta()) +
                            Integer.parseInt(this.getHorasSexta()) +
                            Integer.parseInt(this.getHorasSabado()) ;
                    return Integer.toString(tot);
                }
                else if(dia==2){
                    tot = Integer.parseInt(this.getHorasSegunda()) +
                    Integer.parseInt(this.getHorasTerca()) +
                    Integer.parseInt(this.getHorasQuarta()) +
                    Integer.parseInt(this.getHorasQuinta()) +
                    Integer.parseInt(this.getHorasSexta()); 
                    return Integer.toString(tot);
                }
                else if(dia==3){
                    tot = Integer.parseInt(this.getHorasSegunda()) +
                    Integer.parseInt(this.getHorasTerca()) +
                    Integer.parseInt(this.getHorasQuarta()) +
                    Integer.parseInt(this.getHorasQuinta());
                    return Integer.toString(tot);
                }
                else if(dia==4){
                    tot = Integer.parseInt(this.getHorasSegunda()) +
                    Integer.parseInt(this.getHorasTerca()) +
                    Integer.parseInt(this.getHorasQuarta());
                    return Integer.toString(tot);
                }
                else if(dia==5){
                    tot = Integer.parseInt(this.getHorasSegunda()) +
                    Integer.parseInt(this.getHorasTerca());
                    return Integer.toString(tot);
                }
                else if(dia==6){
                    tot = Integer.parseInt(this.getHorasSegunda());
                    return Integer.toString(tot);
                }
                else{
                    tot = 
                    Integer.parseInt(this.getHorasSegunda()) +
                    Integer.parseInt(this.getHorasTerca()) +
                    Integer.parseInt(this.getHorasQuarta()) +
                    Integer.parseInt(this.getHorasQuinta()) +
                    Integer.parseInt(this.getHorasSexta()) +
                    Integer.parseInt(this.getHorasSabado()) +
                    Integer.parseInt(this.getHorasDomingo());
                    return Integer.toString(tot);
                }
            }
        }
        else{    
            tot = 
                Integer.parseInt(this.getHorasSegunda()) +
                Integer.parseInt(this.getHorasTerca()) +
                Integer.parseInt(this.getHorasQuarta()) +
                Integer.parseInt(this.getHorasQuinta()) +
                Integer.parseInt(this.getHorasSexta()) +
                Integer.parseInt(this.getHorasSabado()) +
                Integer.parseInt(this.getHorasDomingo());
            return Integer.toString(tot);
        }
        
        return null;
    }

    public Object getFormattedDataSemana() {
        char[] c = this.getDataSemana().toCharArray();
        String str =  this.getDataSemana().substring(6, 8)+"/"+ this.getDataSemana().substring(4, 6)
                + "/" + this.getDataSemana().substring(0, 4);
        
        return str;
    }
    
    
}
