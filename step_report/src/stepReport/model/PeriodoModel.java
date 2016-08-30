/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.model;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import stepReport.DAO.RelatoriosDAO;
import stepReport.DAOJDBCImpl.RelatoriosDAOJDBCImpl;
import stepReport.Util.FuncionarioHoras;

/**
 *
 * @author Kildare
 */
public class PeriodoModel {

    public ArrayList<String> searchTarefa(String numeroFunc, String replace) {
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        
        
        return list;
        
    }

    
    
    
    /**
     * Retorna a data da semana no periodo de 1 ano
     * @param Ano
     * @return 
     */
    public String[] calcPeriodoAno(String Ano) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, Integer.parseInt(Ano));
        c.set(Calendar.DAY_OF_YEAR, 1);
        int day = c.get(Calendar.DAY_OF_WEEK);
        while(day != Calendar.SUNDAY){
            c.add(Calendar.DAY_OF_WEEK, -1);
            day = c.get(Calendar.DAY_OF_WEEK);
        }
        
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
        String dataIni = fmt.format(c.getTime());
        
        c.set(Calendar.YEAR,Integer.parseInt(Ano));
        c.set(Integer.parseInt(Ano), Calendar.DECEMBER, 31);
        day = c.get(Calendar.DAY_OF_WEEK);
        while(day != Calendar.SUNDAY){
            c.add(Calendar.DAY_OF_WEEK, 1);
            day = c.get(Calendar.DAY_OF_WEEK);
        }
        
        String dataFim = fmt.format(c.getTime());
        
        String v[] = {dataIni,dataFim};
        return v;
    }

    public List<FuncionarioHoras> getHorasNation(String Nacionalidade,String Ano) {
        String periodo[] = this.calcPeriodoAno(Ano);
        
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        List<FuncionarioHoras> horas = conn.hrsTrabByNacionalidade(Nacionalidade, periodo[0],periodo[1]);
        return horas;
    }
    
}
