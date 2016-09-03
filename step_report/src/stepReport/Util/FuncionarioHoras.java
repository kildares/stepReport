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
    private String horasDomingo;
    private String horasSegunda;
    private String horasTerca;
    private String horasQuarta;
    private String horasQuinta;
    private String horasSexta;
    private String horasSabado;

    public FuncionarioHoras(String idFunc,String dataSemana, String horasDomingo,String horasSegunda,String horasTerca,String horasQuarta,String horasQuinta,
            String horasSexta,String horasSabado){
            this.idFunc=idFunc;
            this.dataSemana=dataSemana;
            this.horasDomingo=horasDomingo;
            this.horasSegunda=horasSegunda;
            this.horasTerca=horasTerca;
            this.horasQuarta=horasQuarta;
            this.horasQuinta=horasQuinta;
            this.horasSexta=horasSexta;
            this.horasSabado=horasSabado;
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

    public String getHorasDomingo() {
        return horasDomingo;
    }

    public void setHorasDomingo(String horasDomingo) {
        this.horasDomingo = horasDomingo;
    }

    public String getHorasSegunda() {
        return horasSegunda;
    }

    public void setHorasSegunda(String horasSegunda) {
        this.horasSegunda = horasSegunda;
    }

    public String getHorasTerca() {
        return horasTerca;
    }

    public void setHorasTerca(String horasTerca) {
        this.horasTerca = horasTerca;
    }

    public String getHorasQuarta() {
        return horasQuarta;
    }

    public void setHorasQuarta(String horasQuarta) {
        this.horasQuarta = horasQuarta;
    }

    public String getHorasQuinta() {
        return horasQuinta;
    }

    public void setHorasQuinta(String horasQuinta) {
        this.horasQuinta = horasQuinta;
    }

    public String getHorasSexta() {
        return horasSexta;
    }

    public void setHorasSexta(String horasSexta) {
        this.horasSexta = horasSexta;
    }

    public String getHorasSabado() {
        return horasSabado;
    }

    public void setHorasSabado(String horasSabado) {
        this.horasSabado = horasSabado;
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
