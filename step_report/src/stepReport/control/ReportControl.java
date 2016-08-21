/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.control;

import java.util.HashMap;
import stepReport.reports.view.ReportBSPView;
import stepReport.reports.view.ReportNacionalidadeView;
import stepReport.view.mainScreen;

/**
 *
 * @author Kildare
 */
public final class ReportControl {
    
    private ReportNacionalidadeView reportNacionalidadeView;
    private ReportBSPView reportBSPView;
    private mainScreen screen;
    
    public ReportControl(mainScreen screen){
        this.setScreen(screen);
        this.setReportNacionalidadeView(new ReportNacionalidadeView(this));
        this.setReportBSPView(new ReportBSPView(this));
        this.getReportNacionalidadeView().setVisible(false);
        this.getReportBSPView().setVisible(false);
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

    public void initNationReport() {
        this.getReportNacionalidadeView().loadNationReport();
        mainScreen.setActive(this.getReportNacionalidadeView());
        this.getReportNacionalidadeView().setBounds(0, 0, 800, 500);
        this.getReportNacionalidadeView().setVisible(true);
    }

    public HashMap<String,String> getHorasNation(String text, String ano) {
        
        return new HashMap<String,String>();
        
    }

    
}
