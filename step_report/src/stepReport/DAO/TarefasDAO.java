/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAO;
import stepReport.model.TarefasModel;
/**
 *
 * @author gabriela
 */
public interface TarefasDAO {
    public TarefasModel create(int id_func,String bsp, String task_number, String navio);
    // procura na tabela Funcionario pelo id do func,
    //procura na tabela nova se existe alguma outra tupla com mesmo id_func e status CURRENT. Se sim, muda pra OLD
    //cria tupla nova com id do func e status CURRENT
    
    public TarefasModel updateBsp(int id_func, String bsp);
    //achar linha na tabela com esse id_func e status=CURRENT, pegar infos, mudar status p/ OLD
    //criar nova tupla com as infos da antiga + bsp novo e status CURRENT
    public TarefasModel updateTaskNumber(int id_func, String task_number);
    //achar linha na tabela com esse id_func e status=CURRENT, pegar infos, mudar status p/ OLD
    //criar nova tupla com as infos da antiga + task_number novo e status CURRENT
    public TarefasModel updateNavio(int id_func, String navio);
    //achar linha na tabela com esse id_func e status=CURRENT, pegar infos, mudar status p/ OLD
    //criar nova tupla com as infos da antiga + navio novo e status CURRENT
    
    public TarefasModel findByIdFunc(int id_func);
    public TarefasModel updateStatus(int id_func);
    //Altera o status de uma tupla na tabela com id do funcionario = id_func e status=CURRENT p/ status=OLD
    //precisa retornar a tupla(TarefasModel)?
    
   
}
