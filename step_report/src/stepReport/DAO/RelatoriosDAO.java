/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepReport.DAO;

/**
 *
 * @author gabriela
 */
public interface RelatoriosDAO {
    public void totalHorasMensal(String dataSemIni, String dataSemFim);
    public void hrsTrabByNacionalidade(String nacionalidade, String dataSemIni, String dataSemFim);
    public void hrsTrabByBsp(String bsp, String dataSemIni, String dataSemFim);
    public void hrsTrabByTaskNumber(String taskNumber, String dataSemIni, String dataSemFim);
    public void hrsTrabByNavio(String navio, String dataSemIni, String dataSemFim);
}
