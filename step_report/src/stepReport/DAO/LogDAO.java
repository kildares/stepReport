/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAO;
import java.util.ArrayList;
import stepReport.Util.InfoLog;
/**
 *
 * @author gabriela
 */
public interface LogDAO {
    public boolean create(String usuario, String nomeTabela, String idTabela, String dados, String data);
    public ArrayList<InfoLog> findBtwData(String dataIni, String dataFim);

}
