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
public class ConsultaDAO {
  
    public void agendar(ConsultaDTO cons){
                String sql = "INSERT INTO consulta (id_paciente, id_medico, data_consulta, hora_consulta) VALUES (?, ?, ?, ?)";
         
                try(Connection con = Conectar.conecta();
                        PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
                        
                    pstmt.setInt(1,cons.getIdPaciente());
                    pstmt.setInt(2,cons.getIdMedico());
                    pstmt.setDate(3, java.sql.Date.valueOf(cons.getDataConsulta()));
                    pstmt.setTime(4, java.sql.Time.valueOf(cons.getHoraConsulta()));
                
                    int rowsAffected = pstmt.executeUpdate();
                    if (rowsAffected > 0) {
                        try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                                if (generatedKeys.next()) {
                                    // Obtendo o ID gerado para o novo paciente
                                    cons.setIdConsulta(generatedKeys.getInt(1));
                                } else {
                                    throw new SQLException("Falha ao obter o ID da consulta registada.");
                                }
                        }
                    }
                    
                
                }catch (SQLException ex){
                   Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, ex);
                 }
             
                
    }
    
    public boolean atualizar(ConsultaDTO consulta) {
        String sql = "UPDATE consulta SET id_paciente=?, id_medico=?, data_consulta=?, hora_consulta=? WHERE id_consulta=?";
        try (Connection conn = Conectar.conecta();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, consulta.getIdPaciente());
            stmt.setInt(2, consulta.getIdMedico());
            stmt.setDate(3, java.sql.Date.valueOf(consulta.getDataConsulta()));
            stmt.setTime(4, java.sql.Time.valueOf(consulta.getHoraConsulta()));
            stmt.setInt(5, consulta.getIdConsulta());
            
            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar consulta: " + e.getMessage());
            return false;
        }
    }

    public boolean excluirConsulta(ConsultaDTO consulta) {
        String sql = "DELETE FROM consulta WHERE id_consulta=?";
        
        try (Connection conn = Conectar.conecta();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, consulta.getIdConsulta());
            
            int rowsDeleted = stmt.executeUpdate();
             // Verifica se algum registro foi excluído
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Paciente excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum paciente foi excluído.");
            }
            return rowsDeleted > 0;
            
            
            
        } catch (SQLException e) {
            System.err.println("Erro ao excluir consulta: " + e.getMessage());
            return false;
        }
    }
    
    public List<ConsultaDTO> listarConsultas() {
        List<ConsultaDTO> listaConsultas = new ArrayList<>();
        String sql = "SELECT * FROM consulta";
        
        try (Connection conn = Conectar.conecta();
                PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                ConsultaDTO consulta = new ConsultaDTO();
                consulta.setIdConsulta(rs.getInt("id_consulta"));
                consulta.setIdPaciente(rs.getInt("id_paciente"));
                consulta.setIdMedico(rs.getInt("id_medico"));
                consulta.setDataConsulta(rs.getDate("data_consulta").toLocalDate());
                consulta.setHoraConsulta(rs.getTime("hora_consulta").toLocalTime());
                
                listaConsultas.add(consulta);
            }
            
        } catch (SQLException e) {
            System.err.println("Erro ao listar consultas: " + e.getMessage());
        }
        
        return listaConsultas;
    }
     
   
}
