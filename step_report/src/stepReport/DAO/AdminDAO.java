/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAO;
import stepReport.model.AdminModel;
/**
 *
 * @author gabriela
 */
public interface AdminDAO {
    public AdminModel create(String user, String password);
    public AdminModel update(String user, String password);
    public AdminModel findByUser(String user);
    
}
