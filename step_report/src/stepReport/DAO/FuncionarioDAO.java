/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAO;
import stepReport.model.FuncionarioModel;
/**
 *
 * @author gabriela
 */
public interface FuncionarioDAO {
    public FuncionarioModel create(String nome, String nacionalidade, String profissao);    
    public FuncionarioModel update(int id, String nome, String nacionalidade, String profissao);
    //Atualiza a prof do funcionario cujo número é igual a id
    
    public FuncionarioModel remove(int id);
    public FuncionarioModel findByID(int id);
}
