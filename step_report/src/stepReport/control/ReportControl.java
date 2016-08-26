/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.control;

import java.util.HashMap;
import stepReport.reports.view.ReportBSPView;
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
    
    public ReportControl(mainScreen screen){
        this.setScreen(screen);
        this.setReportNacionalidadeView(new ReportNacionalidadeView(this));
        this.setReportBSPView(new ReportBSPView(this));
        this.setReportTaskView(new ReportTaskView(this));
        this.setReportUnidadeView(new ReportUnidadeView(this));
        
        this.getReportNacionalidadeView().setVisible(false);
        this.getReportBSPView().setVisible(false);
        this.getReportTaskView().setVisible(false);
        this.getReportUnidadeView().setVisible(false);
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

    public void initNationReport() {
        this.getReportNacionalidadeView().loadNationReport();
        mainScreen.setActive(this.getReportNacionalidadeView());
        this.getReportNacionalidadeView().setBounds(0, 0, 800, 500);
        this.getReportNacionalidadeView().setVisible(true);
    }

    public HashMap<String,String> getHorasNation(String text, String ano) {
        boolean isFound=true;
        
        //TODO codigo pra impressao do relatorio
        
        if(isFound){
            this.getScreen().isPrintable(true);
        }
        
        return new HashMap<String,String>();
        
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
        this.getReportTaskView().loadTaskReport();
        mainScreen.setActive(this.getReportTaskView());
        this.getReportTaskView().setBounds(0, 0, 800, 500);
        this.getReportTaskView().setVisible(true);
    }

    
}
