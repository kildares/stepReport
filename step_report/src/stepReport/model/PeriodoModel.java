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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.StringUtils;
import stepReport.DAO.CadastraHorasDAO;
import stepReport.DAO.RelatoriosDAO;
import stepReport.DAOJDBCImpl.CadastraHorasDAOJDBCImpl;
import stepReport.DAOJDBCImpl.RelatoriosDAOJDBCImpl;
import stepReport.Util.FuncionarioHoras;

/**
 *
 * @author Kildare
 */
public class PeriodoModel {

    public ArrayList<FuncionarioHoras> searchTarefa(String numeroFunc, String dataSemana) {
        CadastraHorasDAO conn = new CadastraHorasDAOJDBCImpl();
        
        return conn.findCadastro(numeroFunc, dataSemana);
    }
    
    public boolean updateCadastro(String idCadastro, String horas, String taskNum, String NAM, String BSP, String unidade){
        
        CadastraHorasDAO conn = new CadastraHorasDAOJDBCImpl();
        return conn.update(idCadastro,Integer.parseInt(horas),taskNum,NAM,BSP, unidade);
    
    }
    public boolean createCadastro(String dataSemana, String diaSemana, int horas, String taskNumber, String nam, String bsp, String unidade, String idFunc) {
        CadastraHorasDAO conn = new CadastraHorasDAOJDBCImpl();
        List<FuncionarioHoras> lista = conn.findCadastro(idFunc, dataSemana);
        if(lista!=null || lista.size()>0){
            conn.create(dataSemana,diaSemana,horas,taskNumber,nam,bsp,unidade,idFunc);
            return true;
        }
        return false;
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
            c.add(Calendar.DAY_OF_WEEK, 1);
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
    
    private String[] calcPeriodoMes(String Mes) {
        Calendar c = Calendar.getInstance();
        
        String ano = Mes.substring(6, 10);
        String mes = Mes.substring(3, 5);
        
        mes = Integer.toString(Integer.parseInt(mes) -1);
        
        c.set(Integer.parseInt(ano), Integer.parseInt(mes), 1);
        
        int day = c.get(Calendar.DAY_OF_WEEK);
        while(day != Calendar.SUNDAY){
            c.add(Calendar.DAY_OF_WEEK, 1);
            day = c.get(Calendar.DAY_OF_WEEK);
        }
        
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
        String dataIni = fmt.format(c.getTime());
        
        
        int maxDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        c = Calendar.getInstance();
        c.set(Integer.parseInt(ano), Integer.parseInt(mes), maxDay);
        day = c.get(Calendar.DAY_OF_MONTH);
        while(day != Calendar.SUNDAY){
            c.add(Calendar.DAY_OF_WEEK, 1);
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
        //List<FuncionarioHoras> horas = conn.hrsTrabByNacionalidade(Nacionalidade, periodo[0],periodo[1]);
        //return horas;
        return null;
    }


    public List<FuncionarioHoras> getHorasNationMes(String Nacionalidade, String Mes) {
        String periodo[] = this.calcPeriodoMes(Mes);
        
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        //List<FuncionarioHoras> horas = conn.hrsTrabByNacionalidade(Nacionalidade, periodo[0],periodo[1]);
        //return horas;
        return null;
    }

    public List<FuncionarioHoras> getNationCustom(String Nacionalidade, String dataIni, String dataFim) {
        String periodo1 = this.calcPeriodoCustom(dataIni);
        String periodo2 = this.calcPeriodoCustom(dataFim);
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        //List<FuncionarioHoras> horas = conn.hrsTrabByNacionalidade(Nacionalidade, periodo1,periodo2);
        //return horas;
        return null;
    }

    public List<FuncionarioHoras> getHorasBSPAno(String Bsp, String Ano) {
        String periodo[] = this.calcPeriodoAno(Ano);
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        //List<FuncionarioHoras> horas = conn.hrsTrabByBsp(Bsp, periodo[0],periodo[1]);
        //return horas;
        return null;
    }

    public List<FuncionarioHoras> getHorasBSPMes(String Bsp, String mes) {
        String periodo[] = this.calcPeriodoMes(mes);
        
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        //List<FuncionarioHoras> horas = conn.hrsTrabByBsp(Bsp, periodo[0],periodo[1]);
        //return horas;
        return null;
    }

    public List<FuncionarioHoras> getBSPCustom(String bsp, String dataIni, String dataFim) {
       String periodo1 = this.calcPeriodoCustom(dataIni);
        String periodo2 = this.calcPeriodoCustom(dataFim);
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        //List<FuncionarioHoras> horas = conn.hrsTrabByBsp(bsp, periodo1,periodo2);
        //return horas;
        return null;
    }

    public List<FuncionarioHoras> getHorasTaskAno(String task, String Ano) {
        String periodo[] = this.calcPeriodoAno(Ano);
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        //List<FuncionarioHoras> horas = conn.hrsTrabByTaskNumber(task, periodo[0],periodo[1]);
        //return horas;
        return null;
    }

    public List<FuncionarioHoras> getHorasTaskMes(String task, String mes) {
        String periodo[] = this.calcPeriodoMes(mes);
        
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        //List<FuncionarioHoras> horas = conn.hrsTrabByTaskNumber(task, periodo[0],periodo[1]);
        //return horas;
        return null;
    }

    public List<FuncionarioHoras> getTaskCustom(String task, String dataIni, String dataFim) {
        String periodo1 = this.calcPeriodoCustom(dataIni);
        String periodo2 = this.calcPeriodoCustom(dataFim);
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        //List<FuncionarioHoras> horas = conn.hrsTrabByTaskNumber(task, periodo1,periodo2);
        //return horas;
        return null;
    }

    public List<FuncionarioHoras> getHorasUnidadeAno(String Unidade, String Ano) {
        String periodo[] = this.calcPeriodoAno(Ano);
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        //List<FuncionarioHoras> horas = conn.hrsTrabByNavio(Unidade, periodo[0],periodo[1]);
        //return horas;
        return null;
    }

    public List<FuncionarioHoras> getHorasUnidadeMes(String Unidade, String mes) {   
        String periodo[] = this.calcPeriodoMes(mes);
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        //List<FuncionarioHoras> horas = conn.hrsTrabByNavio(Unidade, periodo[0],periodo[1]);
        //return horas;
        return null;
    }

    public List<FuncionarioHoras> getUnidadeCustom(String Unidade, String dataIni, String dataFim) {
        String periodo1 = this.calcPeriodoCustom(dataIni);
        String periodo2 = this.calcPeriodoCustom(dataFim);
        RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        //List<FuncionarioHoras> horas = conn.hrsTrabByNavio(Unidade, periodo1,periodo2);
        //return horas;
        return null;
    }

    public List<FuncionarioHoras> getHorasUnidadeMes(String mes) {
       String periodo[] = this.calcPeriodoMes(mes);
       String dataIni = mes.replace("/", "");
       
       String mesIni = dataIni.substring(2, 4);
       String anoIni = dataIni.substring(4, 8);
       dataIni = anoIni + mesIni + "01";
       String dataFim;
       
       RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
       List<FuncionarioHoras> horas = null;
       if(mesIni.equals("12")){
           dataFim = Integer.toString(Integer.parseInt(anoIni)+1) + "0106";
           //horas = conn.totalHorasMensal(dataIni,dataFim);
       }
       else{
           dataFim = anoIni + StringUtils.leftPad(Integer.toString(Integer.parseInt(mesIni)+1),2,"0")+"06";
           //horas = conn.totalHorasMensal(dataIni,dataFim);
       }
        
       
       return null;
        //return horas;
    }

    public List<String> getHorasTotaisSemanal(String dataIni, String dataFim) {
       String periodo1 = this.calcPeriodoCustom(dataIni);
       String periodo2 = this.calcPeriodoCustom(dataFim);
       RelatoriosDAO conn = new RelatoriosDAOJDBCImpl();
        //TODO obter consulta
        //List<FuncionarioHoras> horas = conn.hrsTrabSemana(periodo1,periodo2);
        return null;
    }
    
    
    
}
