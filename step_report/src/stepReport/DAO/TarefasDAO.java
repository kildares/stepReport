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
    
    public void update(int id_func, String bsp, String task_number, String navio);
    //achar linha na tabela com esse id_func e status=CURRENT, pegar infos, mudar status p/ OLD
    //criar nova tupla com status CURRENT

    public TarefasModel findByIdFunc(int id_func);
    
    public void remove(int id_func);
   
}
