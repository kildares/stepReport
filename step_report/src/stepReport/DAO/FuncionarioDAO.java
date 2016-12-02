/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import stepReport.model.FuncionarioModel;
/**
 *
 * @author gabriela
 */
public interface FuncionarioDAO {
    public int create(String nome, String nacionalidade, String profissao);    
    public boolean update(String id, String nome, String nacionalidade, String profissao);
    //Atualiza a prof do funcionario cujo número é igual a id
    
    public void remove(int id);
    public ArrayList<String> findByID(String id);
    public String findNomeByID(String id);
    public String findProfissaoByID(String id);
    public List<FuncionarioModel> findAll();
    
    public Map<String,String> getAllNomeID();
}
