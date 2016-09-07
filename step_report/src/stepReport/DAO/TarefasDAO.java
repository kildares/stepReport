/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAO;
import java.util.ArrayList;
/**
 *
 * @author gabriela
 */
public interface TarefasDAO {
    public boolean create(String id_func,String bsp, String task_number, String navio);
    public String findCurrentByIdFunc(String id_func);
    public ArrayList<String> findById(String id);
    public boolean changeStatusToOld(String id);
}
