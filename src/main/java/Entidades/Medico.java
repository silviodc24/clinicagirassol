/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utilitarios.Conectar;

/**
 *
 * @author silvi_5cnyxi8
 *
public class Medico extends Funcionario {
    
    
    
    
    
    public void atualizar(){
        String sql = "UPDATE medico SET numeroMed = ?, especialidadeId = ? WHERE idMedico = ?";

        try (Connection con = Conectar.conecta();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            
            pstmt.setInt(1, numeroMed);
            pstmt.setInt(2, especialidade.getCodigo());
            pstmt.setInt(3, idMedico);
            
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Médico atualizado com sucesso!");
            } else {
                throw new SQLException("Falha ao atualizar médico.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar médico: " + e.getMessage());
    }
  }
    /**
     *
     * @return
     *
    public int getIdMedico(){
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public int getNumeroMed() {
        return numeroMed;
    }

    public void setNumeroMed(int numeroMed) {
        this.numeroMed = numeroMed;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
   


    
    
}
    */