/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import stepReport.DAO.LogDAO;
import stepReport.DAOJDBCImpl.LogDAOJDBCImpl;

/**
 *
 * @author Kildare
 */
public class logModel 
{
    String tableName;
    public logModel(String tableName){
        this.tableName=tableName;
    }

    public void logData(String data) {
        LogDAO log = new LogDAOJDBCImpl();
        Calendar c = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        
        log.create(AdminModel.getInstance().getUsuario(), this.tableName, "1",data, df.format(c.getTime())); 
    }
    
    
}
