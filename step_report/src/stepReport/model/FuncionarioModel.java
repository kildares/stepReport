/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.model;

import java.util.ArrayList;
import stepReport.control.FuncionarioControl;
import stepReport.control.TarefasControl;

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
    public ArrayList<String> searchFuncionario(String numero){
        ArrayList<String> func = new ArrayList<String>();
        return func;
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
        return true;
    }

    /**
     * Registra um novo funcionario com as informacoes listadas.
     * @param funcInfo
     * @return
     */
    public boolean registerFuncionaro(ArrayList<String> funcInfo) {
        return true;
    }

    
    
}
