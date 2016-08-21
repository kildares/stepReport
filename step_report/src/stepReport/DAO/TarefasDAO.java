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
    public void create(int id_func,String bsp, String task_number, String navio);
    // procura na tabela Funcionario pelo id do func,
    //procura na tabela nova se existe alguma outra tupla com mesmo id_func e status CURRENT. Se sim, muda pra OLD
    //cria tupla nova com id do func e status CURRENT
    
    public int findCurrentByIdFunc(int id_func);
    //retorna o id da tarefa com status=CURRENT relacionada ao funcionario com id=id_func
    
    public void changeStatusToOld(int id);
}
