/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.List;
import utilitarios.Conectar;
import javax.swing.JOptionPane;
/**
 *
 * @author silvi_5cnyxi8
 */
public class MedicoDAO {
    
    
    public void cadastrar(MedicoDTO m) {
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

        // 1. Cadastrar o funcionário
        funcionarioDAO.cadastrar(m);

        // 2. Após cadastrar o funcionário, obter o código gerado
        int codigoFuncionario = m.getCodigo();

        // 3. Cadastrar o médico com base no código do funcionário
        String sql = "INSERT INTO medico (numeroMed, codigoFuncionario, especialidadeId) VALUES (?,?,?)";

        try (Connection con = Conectar.conecta();
             PreparedStatement pstmt = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setInt(1, m.getNumeroMed());
            pstmt.setInt(2, codigoFuncionario);
            pstmt.setInt(3, m.getEspecialidade());

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Médico cadastrado com sucesso!");
            } else {
                throw new SQLException("Falha ao cadastrar médico.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar médico: " + e.getMessage());
        }
    }
    
    
    public void atualizar(MedicoDTO m) {
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

        // 1. Atualizar o funcionário
        funcionarioDAO.atualizar(m);

        // 2. Atualizar o médico
        String sql = "UPDATE medico SET numeroMed = ?, especialidadeId = ? WHERE codigoFuncionario = ?";

        try (Connection con = Conectar.conecta();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setInt(1, m.getNumeroMed());
            pstmt.setInt(2, m.getEspecialidade());
            pstmt.setInt(3, m.getCodigo());

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
    
 
    
    public List<MedicoDTO> listar() {
    List<MedicoDTO> lista = new ArrayList<>();
    String sql = "SELECT funcionario.nome, funcionario.cargo, funcionario.salario, funcionario.dataContratacao, funcionario.username, medico.especialidade FROM funcionario JOIN medico ON medico.codigoFuncionario = funcionario.codigo";
    
    try (Connection con = Conectar.conecta();
         PreparedStatement pstmt = con.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery()) {

        while (rs.next()) {
            MedicoDTO medico = new MedicoDTO();
            medico.setNome(rs.getString("nome"));
            medico.setCargo(rs.getString("cargo"));
            medico.setSalario(rs.getDouble("salario"));
            medico.setDataContratacao(rs.getDate("dataContratacao").toLocalDate());
            medico.setUsername(rs.getString("username"));
            medico.setEspecialidade(rs.getInt("especialidade"));
            lista.add(medico);
        }
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro ao listar médicos: " + erro.getMessage());
        erro.printStackTrace();
    }
    
    return lista;
    }
 
    
   public List<MedicoDTO> listarNome(int especialidadeId) {
        List<MedicoDTO> lista = new ArrayList<>();
        String sql = "SELECT funcionario.nome " +
                     "FROM funcionario " +
                     "JOIN medico ON medico.codigoFuncionario = funcionario.codigo " +
                     "WHERE medico.especialidadeId = ?";

        try (Connection con = Conectar.conecta();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setInt(1, especialidadeId);

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    MedicoDTO medico = new MedicoDTO();
                    medico.setNome(rs.getString("nome"));
                    lista.add(medico);
                }
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar nomes: " + erro.getMessage());
            erro.printStackTrace();
        }

        return lista;
    }

    
    
    
    //Fim da classe
}   
    
   
