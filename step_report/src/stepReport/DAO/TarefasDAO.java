/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAO;
import java.util.ArrayList;
import stepReport.model.TarefasModel;
/**
 *
 * @author gabriela
 */
public interface TarefasDAO {
    public boolean create(int id_func,String bsp, String task_number, String navio);
    public int findCurrentByIdFunc(int id_func);
    public ArrayList<String> findById(int id);
    public boolean changeStatusToOld(int id);
}
