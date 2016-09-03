/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAO;
import java.util.ArrayList;
import stepReport.model.AdminModel;
/**
 *
 * @author gabriela
 */
public interface AdminDAO {
    public boolean create(String user, String password);
    public boolean updatePassword(String user, String password);
    public ArrayList<String> findByUser(String user);
    public boolean remove(String user);
}
