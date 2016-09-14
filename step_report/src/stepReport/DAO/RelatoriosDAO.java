/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAO;
import java.util.List;
import stepReport.Util.FuncionarioHoras;

/**
 *
 * @author gabriela
 */
public interface RelatoriosDAO {
    public List<FuncionarioHoras> hrsPeriodo(String dataSemIni, String dataSemFim);
    public List<FuncionarioHoras> hrsPeriodoByFunc(String idFunc, String dataSemIni, String dataSemFim);
    public List<FuncionarioHoras> hrsPeriodoByTaskNumber(String taskNumber, String dataSemIni, String dataSemFim);
    public List<FuncionarioHoras> hrsPeriodoByNam(String nam, String dataSemIni, String dataSemFim);
    public List<FuncionarioHoras> hrsPeriodoByBsp(String bsp, String dataSemIni, String dataSemFim);
    public List<FuncionarioHoras> hrsPeriodoByUnidade(String unidade, String dataSemIni, String dataSemFim);
    public List<FuncionarioHoras> hrsPeriodoByNacionalidade(String nacionalidade, String dataSemIni, String dataSemFim);
}
