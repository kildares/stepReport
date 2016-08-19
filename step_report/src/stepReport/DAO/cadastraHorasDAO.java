/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAO;
import stepReport.model.PeriodoModel;

/**
 *
 * @author gabriela
 */
public interface cadastraHorasDAO {
    public PeriodoModel create(String dataSemana, int hrDom, int hrSeg, int hrTer, int hrQua, int hrQui, int hrSex, int hrSab,int idFunc, int idTarefa);
    
}
