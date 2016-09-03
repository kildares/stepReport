/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.model;

import java.util.ArrayList;
import stepReport.DAO.TarefasDAO;
import stepReport.DAOJDBCImpl.TarefasDAOJDBCImpl;
import stepReport.control.TarefasControl;

/**
 *
 * @author Kildare
 */
public class TarefasModel {

    private TarefasControl control;

    
    private static TarefasModel instance = null;
    
    protected TarefasModel(){
        
    }
    
    
    public static TarefasModel getInstance(TarefasControl control){
        if(TarefasModel.instance == null){
            instance = new TarefasModel();
        }
        TarefasModel.instance.setControl(control);
        
        return TarefasModel.instance;
    }
    
    //Busca os dados de uma tarefa baseado no numero do funcionário
    public ArrayList<String> searchTarefas(String idFunc) {
        TarefasDAO conn = new TarefasDAOJDBCImpl();     
        String idTarefa = conn.findCurrentByIdFunc(idFunc);  //Busca o id da tarefa baseado no numero do funcionario
        
        if(idTarefa != null){
            return conn.findById(idTarefa);     //Busca infos da tarefa e retorna para view
        }
        else{
            return null;
        }
    }
    
    //Edita os dados do funcionário (tarefa) ou cria uma tarefa nova para o funcionário, caso não exista nenhuma tarefa para
    //esta usuário
    public boolean editTarefa(String idFunc, String bsp, String navio, String task) {
        TarefasDAO conn = new TarefasDAOJDBCImpl();
        String tarefaAtual = conn.findCurrentByIdFunc(idFunc);
        if(tarefaAtual != null){
            if(conn.changeStatusToOld(tarefaAtual)){    //Caso encontre uma tarefa CURRENT para o func, muda esta para OLD e cria uma nova  
                return conn.create(idFunc, bsp, task, navio);
            }
            else{
                return false;
            }
        }
        else{   //Caso não encontre nenhuma tarefa CURRENT para o func, apenas cria uma nova  
            return conn.create(idFunc, bsp, task, navio);
        }
    }
   
    public TarefasControl getControl() {
        return control;
    }

    public void setControl(TarefasControl control) {
        this.control = control;
    }
    
    
}
