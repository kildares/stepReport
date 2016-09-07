/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.control;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.io.File;
import java.util.List;
import javax.swing.JPanel;
import stepReport.DAO.RelatoriosDAO;
import stepReport.DAOJDBCImpl.RelatoriosDAOJDBCImpl;
import stepReport.Util.FuncionarioHoras;
import stepReport.model.PeriodoModel;
import stepReport.reports.model.savePDFModel;
import stepReport.reports.view.ReportBSPView;
import stepReport.reports.view.ReportHorasSemanal;
import stepReport.reports.view.ReportNacionalidadeView;
import stepReport.reports.view.ReportTaskView;
import stepReport.reports.view.ReportUnidadeView;
import stepReport.view.mainScreen;

/**
 *
 * @author Kildare
 */
public final class ReportControl {
    
    private ReportNacionalidadeView reportNacionalidadeView;
    private ReportBSPView reportBSPView;
    private mainScreen screen;
    private ReportTaskView reportTaskView;
    private ReportUnidadeView reportUnidadeView;
    private ReportHorasSemanal reportHorasMensal;
    private savePDFModel saverPDF;
    private PeriodoModel periodoModel;
    
    
    public ReportControl(mainScreen screen)
    {
        this.setSaverPDF(new savePDFModel(this));
        this.setPeriodoModel(new PeriodoModel());
        this.setScreen(screen);
        this.setReportNacionalidadeView(new ReportNacionalidadeView(this));
        this.setReportBSPView(new ReportBSPView(this));
        this.setReportTaskView(new ReportTaskView(this));
        this.setReportUnidadeView(new ReportUnidadeView(this));
        this.setReportHorasMensal(new ReportHorasSemanal(this));
        this.getReportNacionalidadeView().setVisible(false);
        this.getReportBSPView().setVisible(false);
        this.getReportTaskView().setVisible(false);
        this.getReportUnidadeView().setVisible(false);
        this.getReportHorasMensal().setVisible(false);
    }
    
    
    public ReportNacionalidadeView getReportNacionalidadeView() {
        return reportNacionalidadeView;
    }

    public void setReportNacionalidadeView(ReportNacionalidadeView reportNacionalidadeView) {
        this.reportNacionalidadeView = reportNacionalidadeView;
    }

    public ReportBSPView getReportBSPView() {
        return reportBSPView;
    }

    public void setReportBSPView(ReportBSPView reportBSPView) {
        this.reportBSPView = reportBSPView;
    }

    public mainScreen getScreen() {
        return screen;
    }

    public void setScreen(mainScreen screen) {
        this.screen = screen;
    }
    
    public ReportTaskView getReportTaskView() {
        return reportTaskView;
    }

    public void setReportTaskView(ReportTaskView reportTaskView) {
        this.reportTaskView = reportTaskView;
    }
    
    public ReportUnidadeView getReportUnidadeView() {
        return reportUnidadeView;
    }

    public void setReportUnidadeView(ReportUnidadeView reportUnidadeView) {
        this.reportUnidadeView = reportUnidadeView;
    }

    
    public savePDFModel getSaverPDF() {
        return saverPDF;
    }

    public void setSaverPDF(savePDFModel saverPDF) {
        this.saverPDF = saverPDF;
    }
    
       public PeriodoModel getPeriodoModel() {
        return periodoModel;
    }

    public void setPeriodoModel(PeriodoModel periodoModel) {
        this.periodoModel = periodoModel;
    }
    
    
    public ReportHorasSemanal getReportHorasMensal() {
        return reportHorasMensal;
    }

    public void setReportHorasMensal(ReportHorasSemanal reportHorasMensal) {
        this.reportHorasMensal = reportHorasMensal;
    }
    
    
    public void initNationReport() {
        this.getReportNacionalidadeView().loadNationReport();
        mainScreen.setActive(this.getReportNacionalidadeView());
        this.getReportNacionalidadeView().setBounds(0, 0, 800, 500);
        this.getReportNacionalidadeView().setVisible(true);
    }

    public List<FuncionarioHoras> getHorasNationAno(String Nacionalidade, String Ano) {
        
        return this.getPeriodoModel().getHorasNationAno(Nacionalidade,Ano);
    }
    
    public List<FuncionarioHoras> getHorasNationMes(String nacionalidade, String mes) 
    {
        
        return this.getPeriodoModel().getHorasNationMes(nacionalidade,mes);
    }
    
    
    public List<FuncionarioHoras> getHorasNationCustom(String Nacionalidade,String dataIni,String dataFim) {
    
        
        return this.getPeriodoModel().getNationCustom(Nacionalidade,dataIni,dataFim);
        
    }
    
    
    public List<FuncionarioHoras> getHorasBSPAno(String Bsp, String Ano) {
        return this.getPeriodoModel().getHorasBSPAno(Bsp,Ano);
    }

    public List<FuncionarioHoras> getHorasBSPMes(String Bsp, String mes) {
        return this.getPeriodoModel().getHorasBSPMes(Bsp,mes);
    }

    
    public List<FuncionarioHoras> getHorasBSPCustom(String bsp, String dataIni, String dataFim) {
       return this.getPeriodoModel().getBSPCustom(bsp,dataIni,dataFim);
    }


    public List<FuncionarioHoras> getHorasTaskAno(String task, String Ano) {
         return this.getPeriodoModel().getHorasTaskAno(task,Ano);
    }

    public List<FuncionarioHoras> getHorasTaskMes(String task, String mes) {
        return this.getPeriodoModel().getHorasTaskMes(task,mes);
    }

    public List<FuncionarioHoras> getHorasTaskCustom(String task, String dataIni, String dataFim) {
       return this.getPeriodoModel().getTaskCustom(task,dataIni,dataFim);
    }



    public void initBSPReport() {
        
        this.getReportBSPView().loadBSPReport();
        mainScreen.setActive(this.getReportBSPView());
        this.getReportBSPView().setBounds(0, 0, 800, 500);
        this.getReportBSPView().setVisible(true);
    }

    public void initTaskReport() {
        this.getReportTaskView().loadTaskReport();
        mainScreen.setActive(this.getReportTaskView());
        this.getReportTaskView().setBounds(0, 0, 800, 500);
        this.getReportTaskView().setVisible(true);
    }

    public void initUnidadeReport() {
        this.getReportUnidadeView().loadUnidadeReport();
        mainScreen.setActive(this.getReportUnidadeView());
        this.getReportUnidadeView().setBounds(0, 0, 800, 500);
        this.getReportUnidadeView().setVisible(true);
    }
    
    
    public void initMensalReport() {
        this.getReportHorasMensal().loadMensalReport();
        mainScreen.setActive(this.getReportHorasMensal());
        this.getReportTaskView().setBounds(0, 0, 800, 500);
        this.getReportHorasMensal().setVisible(true);
    }

    public void savePDF(File file,JPanel active) 
    {
        List<FuncionarioHoras> list = null;
        if(active instanceof ReportBSPView){
            list = this.getReportBSPView().getListaPrint();
        }
        else if(active instanceof ReportNacionalidadeView){
            list = this.getReportNacionalidadeView().getPDFData();
        }
        else if(active instanceof ReportUnidadeView){
            list = this.getReportUnidadeView().getPDFData();
        }
        else if(active instanceof ReportTaskView){
            list = this.getReportTaskView().getPDFData();
        }
        else if(active instanceof ReportHorasSemanal){
            list = this.getReportHorasMensal().getPDFData();
        }
        
        this.getSaverPDF().savePDF(file,list);
    }

    public List<FuncionarioHoras> getHorasUnidadeAno(String Unidade, String Ano) {
         return this.getPeriodoModel().getHorasUnidadeAno(Unidade,Ano);
    }

    public List<FuncionarioHoras> getHorasUnidadeMes(String Unidade, String mes) {
         return this.getPeriodoModel().getHorasUnidadeMes(Unidade,mes);
    }

    public List<FuncionarioHoras> getHorasUnidadeCustom(String Unidade, String dataIni, String dataFim) {
        return this.getPeriodoModel().getUnidadeCustom(Unidade,dataIni,dataFim);
    }


    public void isPrintable(boolean option) {
        this.getScreen().isPrintable(option);
    }

    public List<String> getHorasTotaisSemanal(java.lang.String dataIni, java.lang.String dataFim) {
        return this.getPeriodoModel().getHorasTotaisSemanal(dataIni,dataFim);
    }


    
}
