/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.model;

import Exceptions.notFoundException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import stepReport.DAO.FuncionarioDAO;
import stepReport.DAOJDBCImpl.FuncionarioDAOJDBCImpl;
import stepReport.control.FuncionarioControl;

/**
 * Classe que trata o Funcionário de funcionario, implementa o padrão Singleton
 * 
 * 
 * @author Kildare
 */
public final class FuncionarioModel {

    private String Nome, Nacionalidade, Profissao;
    private FuncionarioControl Control;
    
    public FuncionarioModel(){
        
    }

    public FuncionarioModel(String nome, String nacionalidade, String profissao) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setProfissao(profissao);
    }
    
    

    public FuncionarioControl getControl() {
        return Control;
    }

    public void setControl(FuncionarioControl funcionarioControl) {
        this.Control = funcionarioControl;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }

    public String getProfissao() {
        return Profissao;
    }

    public void setProfissao(String Profissao) {
        this.Profissao = Profissao;
    }
    
    
    
    
    /**
     * 
     * @param numero
     * @return ArrayList:
     *  id 0: Nome
     *  id 1: Nacionalidade
     *  id 3: Profissao
     *  id 4: BSP
     *  id 5: Task Number
     *  id 6: Navio
     */
    public ArrayList<String> searchFuncionario(String numero) throws notFoundException{
        ArrayList<String> func = new ArrayList<String>();
        FuncionarioDAO conn = new FuncionarioDAOJDBCImpl();
        return conn.findByID(numero);
    }

    /**
     *
     * Retorna verdadeiro se houve sucesso na atualizacao do funcionario
     * 
     * @param funcInfo:
     * id 0: Nome
     * id 1: Numero
     * id 2: Nacionalidade
     * id 3: Profissao
     * id 4: BSP
     * id 5: Task Number
     * id 6: Navio
     * @return true
     */
    public boolean updateFuncionario(ArrayList<String> funcInfo) {
        FuncionarioDAO conn = new FuncionarioDAOJDBCImpl();
        ArrayList<String> func = new ArrayList<String>();
        func = conn.findByID(funcInfo.get(0));
        if(func == null){
            JOptionPane.showMessageDialog(new JFrame(), "Funcionário não encontrado");
            return false;
        }
        else{
            boolean res = conn.update(funcInfo.get(0), funcInfo.get(1), funcInfo.get(2), funcInfo.get(3)); 
            if(res){
                logModel log = new logModel("funcionario");
                log.logData("Alt func: "+funcInfo.get(1));
            }
            return res;
        }
    }

    /**
     * Registra um novo funcionario com as informacoes listadas.
     * @param funcInfo
     * @return
     */
    public int registerFuncionaro(ArrayList<String> funcInfo) {
        FuncionarioDAO conn = new FuncionarioDAOJDBCImpl();
        int result = conn.create(funcInfo.get(1),funcInfo.get(2), funcInfo.get(3));
        if(result>=0)
        {
            logModel log = new logModel("funcionario");
            log.logData("Reg func: "+funcInfo.get(1));
        }
        return result;
    }

    public boolean removeUser(String idUser) 
    {
        FuncionarioDAO conn = new FuncionarioDAOJDBCImpl();   
        return conn.removeFuncionario(idUser);
    }

    
    
}
