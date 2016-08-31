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
            c.add(Calendar.DAY_OF_WEEK, -1);
            day = c.get(Calendar.DAY_OF_WEEK);
        }
        
        String dataFim = fmt.format(c.getTime());
        
        String v[] = {dataIni,dataFim};
        return v;
    }
    
    private String[] calcPeriodoMes(String Mes) {
        Calendar c = Calendar.getInstance();
        
        String ano = Mes.substring(6, 10);
        String mes = Mes.substring(3, 5);
        
        mes = Integer.toString(Integer.parseInt(mes) -1);
        
        c.set(Integer.parseInt(ano), Integer.parseInt(mes), 1);
        
        int day = c.get(Calendar.DAY_OF_WEEK);
        while(day != Calendar.SUNDAY){
            c.add(Calendar.DAY_OF_WEEK, -1);
            day = c.get(Calendar.DAY_OF_WEEK);
        }
        
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
        String dataIni = fmt.format(c.getTime());
        
        
        int maxDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        c = Calendar.getInstance();
        c.set(Integer.parseInt(ano), Integer.parseInt(mes), maxDay);
        day = c.get(Calendar.DAY_OF_MONTH);
        while(day != Calendar.SUNDAY){
            c.add(Calendar.DAY_OF_WEEK, -1);
            day = c.get(Calendar.DAY_OF_WEEK);
        }
        String dataFim = fmt.format(c.getTime());
        
        String[] v = {dataIni,dataFim};
        return v;
    }
    
    
    private String calcPeriodoCustom(String data) {
        Calendar c = Calendar.getInstance();
        String dia = data.substring(0, 2);
        String mes = data.substring(3, 5);
        String ano = data.substring(6, 10);
        
        mes = Integer.toString(Integer.parseInt(mes) -1);
        
        c.set(Integer.parseInt(ano), Integer.parseInt(mes), Integer.parseInt(dia));
        int day = c.get(Calendar.DAY_OF_WEEK);
        while(day != Calendar.SUNDAY){
            c.add(Calendar.DAY_OF_WEEK, -1);
            day = c.get(Calendar.DAY_OF_WEEK);
        }
        
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
        String fmtData = fmt.format(c.getTime());
        
        return fmtData;
    }

    public List<FuncionarioHoras> getHorasNationAno(String Nacionalidade,String Ano) {
        String periodo[] = this.calcPeriodoAno(Ano);
        
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        List<FuncionarioHoras> horas = conn.hrsTrabByNacionalidade(Nacionalidade, periodo[0],periodo[1]);
        return horas;
    }

    public List<FuncionarioHoras> getHorasNationMes(String Nacionalidade, String Mes) {
        String periodo[] = this.calcPeriodoMes(Mes);
        
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        List<FuncionarioHoras> horas = conn.hrsTrabByNacionalidade(Nacionalidade, periodo[0],periodo[1]);
        return horas;
    }

    public List<FuncionarioHoras> getNationCustom(String Nacionalidade, String dataIni, String dataFim) {
        String periodo1 = this.calcPeriodoCustom(dataIni);
        String periodo2 = this.calcPeriodoCustom(dataFim);
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        List<FuncionarioHoras> horas = conn.hrsTrabByNacionalidade(Nacionalidade, periodo1,periodo2);
        return horas;
    }

    public List<FuncionarioHoras> getHorasBSPAno(String Bsp, String Ano) {
        String periodo[] = this.calcPeriodoAno(Ano);
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        List<FuncionarioHoras> horas = conn.hrsTrabByBsp(Bsp, periodo[0],periodo[1]);
        return horas;
    }

    public List<FuncionarioHoras> getHorasBSPMes(String Bsp, String mes) {
         String periodo[] = this.calcPeriodoMes(mes);
        
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        List<FuncionarioHoras> horas = conn.hrsTrabByBsp(Bsp, periodo[0],periodo[1]);
        return horas;
    }

    public List<FuncionarioHoras> getBSPCustom(String bsp, String dataIni, String dataFim) {
       String periodo1 = this.calcPeriodoCustom(dataIni);
        String periodo2 = this.calcPeriodoCustom(dataFim);
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        List<FuncionarioHoras> horas = conn.hrsTrabByBsp(bsp, periodo1,periodo2);
        return horas;
    }

    
}
