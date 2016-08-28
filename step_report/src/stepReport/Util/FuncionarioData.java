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
public class FuncionarioData {
    private String Numero;
    private String Horas;
    private String Periodo;

    public FuncionarioData(String numero,String horas,String periodo){
        this.Numero = numero;
        this.Horas = horas;
        this.Periodo = periodo;
    }
    
    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getHoras() {
        return Horas;
    }

    public void setHoras(String Horas) {
        this.Horas = Horas;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }
    
    
    
}
