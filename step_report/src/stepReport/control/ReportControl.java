/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.control;

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
    
}
