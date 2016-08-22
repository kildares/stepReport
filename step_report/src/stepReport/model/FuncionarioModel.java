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
public class FuncionarioModel {

    private static FuncionarioModel instance = null;

    private FuncionarioControl Control;
    
    protected FuncionarioModel(){
        
    }
    
    public static FuncionarioModel getInstance(FuncionarioControl funcionarioControl){
        if(FuncionarioModel.instance == null){
            instance = new FuncionarioModel();
        }
        FuncionarioModel.instance.setControl(funcionarioControl);
        
        return FuncionarioModel.instance;
    }
    
    
    public static FuncionarioModel getInstance() {
        if(FuncionarioModel.instance == null){
            instance = new FuncionarioModel();
        }
        return FuncionarioModel.instance;
    }

    public FuncionarioControl getControl() {
        return Control;
    }

    public void setControl(FuncionarioControl funcionarioControl) {
        this.Control = funcionarioControl;
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
