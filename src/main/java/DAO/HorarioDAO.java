/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utilitarios.Conectar;
/**
 *
 * @author silvi_5cnyxi8
 */
public class HorarioDAO {
    
   public List<HorarioDTO> listarHorarioMedico(int idMedico) {
        List<HorarioDTO> listaHorarios = new ArrayList<>();
        String sql = "SELECT * FROM horarios WHERE id_medico = ?";
        try (Connection con = Conectar.conecta();
            PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, idMedico);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id_horario = rs.getInt("id_horario");
                String diaSemana = rs.getString("dia_semana");
                LocalTime hora = rs.getTime("hora").toLocalTime();

                HorarioDTO horario = new HorarioDTO(id_horario, idMedico, diaSemana, hora);
                listaHorarios.add(horario);
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao listar horários do médico: " + ex.getMessage());
        }
        return listaHorarios;
    }
    
    public void cadastrar(HorarioDTO horario){
        String sql = "INSERT INTO horario (id_medico, dia_semana, hora) VALUES (?,?,?)";
        
        try(Connection con = Conectar.conecta();
                PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
                pstmt.setInt(1, horario.getId_medico());
                pstmt.setString(2, horario.getDiaSemana());
                pstmt.setTime(3, java.sql.Time.valueOf(horario.getHora()));
                
                 int rowsAffected = pstmt.executeUpdate();
                // Se desejar obter o ID gerado pela inserção, você pode fazer o seguinte:
            if (rowsAffected > 0) {
                try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        // Obtendo o ID gerado para o novo paciente
                        horario.setId_horario(generatedKeys.getInt(1));
                    } else {
                        throw new SQLException("Falha ao obter o ID do horario inserido.");
                    }
                }
            }
        JOptionPane.showMessageDialog(null, "Horario cadastrado com sucesso!");
        
        }   catch (SQLException ex) {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null,"Erro: "+ex.getMessage());
        }
    }
    
    public void atualizar(HorarioDTO horario){
        String sql = "UPDATE horario SET id_medico = ?, dia_semana = ?, hora = ? WHERE id_horario = ?";
        try(Connection con = Conectar.conecta();
                PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
                pstmt.setInt(1, horario.getId_medico());
                pstmt.setString(2, horario.getDiaSemana());
                pstmt.setTime(3, java.sql.Time.valueOf(horario.getHora()));
                
                 int rowsAffected = pstmt.executeUpdate();
                // Se desejar obter o ID gerado pela inserção, você pode fazer o seguinte:
            if (rowsAffected == 0) {
               throw new SQLException("Falha ao atualizar horário. Nenhum registo encontrado");
            }
        JOptionPane.showMessageDialog(null, "Horario atualizado com sucesso!");
        
        }   catch (SQLException ex) {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null,"Erro: "+ex.getMessage());
        }
    
    
    }
    
    public void excluir(HorarioDTO horario){
        String sql = "DELETE FROM horario WHERE id_horario = ?";
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir o horario ?", "Excluir", JOptionPane.YES_NO_OPTION);
        if(opcao == JOptionPane.YES_OPTION){
        try(Connection con = Conectar.conecta();
                PreparedStatement pstmt = con.prepareStatement(sql)){
                pstmt.setInt(1, horario.getId_horario());
                
                int rowsAffected = pstmt.executeUpdate();
                if(rowsAffected == 0){
                    throw new SQLException("Falha ao excluir horário");
                }
        
        }catch(SQLException erro){
               erro.printStackTrace();
            }
        }else {
        JOptionPane.showMessageDialog(null, "Exclusão cancelada pelo usuário.");
        }
    }
    
    public List<HorarioDTO> listarHorarioMedicoPorDia(int idMedico, String diaSemana) {
    List<HorarioDTO> listaHorarios = new ArrayList<>();
    String sql = "SELECT h.id_horario, h.id_medico, h.dia_semana, h.hora FROM horario as h WHERE id_medico = ? AND dia_semana = ?";
    try (Connection con = Conectar.conecta();
         PreparedStatement stmt = con.prepareStatement(sql)) {

        stmt.setInt(1, idMedico);
        stmt.setString(2, diaSemana);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            int id_horario = rs.getInt("id_horario");
            LocalTime hora = rs.getTime("hora").toLocalTime();

            HorarioDTO horario = new HorarioDTO(id_horario, idMedico, diaSemana, hora);
            listaHorarios.add(horario);
        }
    } catch (SQLException ex) {
        System.err.println("Erro ao listar horários do médico para o dia " + diaSemana + ": " + ex.getMessage());
    }
    return listaHorarios;
}
    
    
    
   
   
}
