/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.Util;

/**
 *
 * @author gabriela
 */
public class InfoLog {
    private String id;
    private String usuario;
    private String nomeTabela;
    private String idTabela;
    private String dados;
    private String dataLog;
    
    public InfoLog(String id, String usuario, String nomeTabela, String idTabela, String dados, String dataLog){
        this.id = id;
        this.usuario = usuario;
        this.nomeTabela = nomeTabela;
        this.idTabela = idTabela;
        this.dados = dados;
        this.dataLog = dataLog;         
    }
    
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setNomeTabela(String nomeTabela){
        this.nomeTabela = nomeTabela;
    }
    public String getNomeTabela(){
        return nomeTabela;
    }
    public void setIdTabela(String idTabela){
        this.idTabela = idTabela;
    }
    public String getIdTabela(){
        return idTabela;
    }
    public void setDados(String dados){
        this.dados = dados;
    }
    public String getDados(){
        return dados;
    }
    public void setDataLog(String dataLog){
        this.dataLog = dataLog;
    }
    public String getDataLog(){
        return dataLog;
    }
}
