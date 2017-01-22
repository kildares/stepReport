/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAO;
import java.util.ArrayList;
import stepReport.Util.FuncionarioHoras;
import stepReport.model.PeriodoModel;

/**
 *
 * @author gabriela
 */
public interface CadastraHorasDAO {
    public boolean create(String dataSemana, String diaSemana, int horas, String taskNumber, String nam, String bsp, String unidade, String idFunc);
    //public boolean create(String dataSemana, int hrDom, int hrSeg, int hrTer, int hrQua, int hrQui, int hrSex, int hrSab,String idFunc, String idTarefa);
    public ArrayList<FuncionarioHoras> findCadastro (String idFunc, String dataSemana);
    public boolean updateCad(String dataSemana, String diaSemana, int horas, String taskNumber, String nam, String bsp, String unidade, String idFunc);
    public boolean update(String id, int horas, String taskNumber, String nam, String bsp, String unidade);
    
    public boolean removeHoras(String idUser);
    public boolean removeHorasSemanais(String idUser, String dataSemana);
}
