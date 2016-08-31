/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAO;
import java.util.ArrayList;
import stepReport.model.PeriodoModel;

/**
 *
 * @author gabriela
 */
public interface CadastraHorasDAO {
    public void create(String dataSemana, int hrDom, int hrSeg, int hrTer, int hrQua, int hrQui, int hrSex, int hrSab,int idFunc, int idTarefa);
    public ArrayList<String> findCadastro (int idFunc, String dataSemana);
    public boolean update(int id, int hrDom, int hrSeg, int hrTer, int hrQua, int hrQui, int hrSex, int hrSab);
}
