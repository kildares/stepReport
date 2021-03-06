/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.control;

import java.io.File;
import java.util.List;
import java.util.Map;
import javax.swing.JPanel;
import stepReport.Util.FuncionarioHoras;
import stepReport.Util.FuncionarioHorasSemana;
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
    private savePDFModel savePDF;
    private PeriodoModel periodoModel;
    
    
    public ReportControl(mainScreen screen)
    {
        this.setSavePDF(new savePDFModel(this));
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

    
    public savePDFModel getSavePDF() {
        return savePDF;
    }

    public void setSavePDF(savePDFModel saverPDF) {
        this.savePDF = saverPDF;
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

    public List<FuncionarioHoras> getHorasNation(String Nacionalidade,String dataIni,String dataFim) {
    
        
        return this.getPeriodoModel().getHorasNation(Nacionalidade,dataIni,dataFim);
        
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
        String[][] dadosMatriz = null;
        if(active instanceof ReportBSPView){
            dadosMatriz = this.getReportBSPView().getPDFData();
        }
        else if(active instanceof ReportNacionalidadeView){
            dadosMatriz = this.getReportNacionalidadeView().getPDFData();
        }
        else if(active instanceof ReportUnidadeView){
            dadosMatriz = this.getReportUnidadeView().getPDFData();
        }
        else if(active instanceof ReportTaskView){
            dadosMatriz = this.getReportTaskView().getPDFData();
        }
        else if(active instanceof ReportHorasSemanal){
            dadosMatriz = this.getReportHorasMensal().getPDFData();
        }
        
        this.getSavePDF().savePDFSemanal(file, dadosMatriz);
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

    public List<FuncionarioHoras> getHorasTotaisSemanal(String dataIni, String dataFim) {
        return this.getPeriodoModel().getHorasTotaisSemanal(dataIni,dataFim);
    }

    public List<FuncionarioHorasSemana> setHoras(List<FuncionarioHorasSemana> horasSemana) {
        return this.getPeriodoModel().setHoras(horasSemana);
    }

    public boolean isValidPeriod(JPanel active) 
    {
        int numWeeks=0;
        if(active instanceof ReportBSPView){
            numWeeks = this.getReportBSPView().getNumWeeks();
        }
        if(active instanceof ReportHorasSemanal){
            numWeeks = this.getReportHorasMensal().getNumWeeks();
        }
        if(active instanceof ReportTaskView){
            numWeeks = this.getReportTaskView().getNumWeeks();
        }
        if(active instanceof ReportUnidadeView){
            numWeeks = this.getReportUnidadeView().getNumWeeks();
        }
        if(active instanceof ReportNacionalidadeView){
            numWeeks = this.getReportNacionalidadeView().getNumWeeks();
        }
        
        
        return numWeeks < 5;
            
    }


    
}
