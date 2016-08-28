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
    public List<FuncionarioHoras> totalHorasMensal(String dataSemIni, String dataSemFim);
    public List<FuncionarioHoras> hrsTrabByNacionalidade(String nacionalidade, String dataSemIni, String dataSemFim);
    public List<FuncionarioHoras> hrsTrabByBsp(String bsp, String dataSemIni, String dataSemFim);
    public List<FuncionarioHoras> hrsTrabByTaskNumber(String taskNumber, String dataSemIni, String dataSemFim);
    public List<FuncionarioHoras> hrsTrabByNavio(String navio, String dataSemIni, String dataSemFim);
}
