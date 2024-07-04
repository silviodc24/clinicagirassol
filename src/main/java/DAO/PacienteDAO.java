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
public class PacienteDAO {
    
    public void cadastrar(PacienteDTO p){
    
      String sql = "INSERT INTO paciente (nome, numDocIdent, dataNasc, endereco, telefone) VALUES (?,?,?,?,?)";

        // Usando try para garantir que os recursos serão fechados automaticamente
        try (Connection con = Conectar.conecta();
             PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            // Define os parâmetros do PreparedStatement com os valores dos atributos da classe Paciente
            pstmt.setString(1, p.getNome());
            pstmt.setString(2, p.getNumBi());
            pstmt.setDate(3, java.sql.Date.valueOf(p.getDataNasc()));
            pstmt.setString(4, p.getEndereco());
            pstmt.setString(5, p.getTelefone());

            // Executa a inserção
            int rowsAffected = pstmt.executeUpdate();

            
            if (rowsAffected > 0) {
                try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        // Obtendo o ID gerado para o novo paciente
                        p.setId_paciente(generatedKeys.getInt(1));
                    } else {
                        throw new SQLException("Falha ao obter o ID do paciente inserido.");
                    }
                }
            }
        JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!");

    } catch (SQLException e) {
       
        JOptionPane.showMessageDialog(null, "Erro ao cadastrar paciente.");
        e.printStackTrace();
        throw new RuntimeException(e.getMessage());
    
    } 
  }
    
    public void atualizar(PacienteDTO p){
        
    String sql = "UPDATE paciente SET nome = ?, numDocIdent = ?, dataNasc = ?, endereco = ?, telefone = ? WHERE id = ?";

    try (Connection con = Conectar.conecta();
         PreparedStatement pstmt = con.prepareStatement(sql)) {

        pstmt.setString(1, p.getNome());
        pstmt.setString(2, p.getNumBi());
        pstmt.setDate(3, java.sql.Date.valueOf(p.getDataNasc()));
        pstmt.setString(4, p.getEndereco());
        pstmt.setString(5, p.getTelefone());
        pstmt.setInt(6, p.getId_paciente());

        pstmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Paciente atualizado com sucesso!");

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar dados do paciente.");
        e.printStackTrace();
    }

    
  }
    
    public void excluir(PacienteDTO p){
        String sql = "DELETE FROM paciente WHERE id = ?";
    
    // Exibe um diálogo de confirmação para o usuário
    int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir o paciente " + p.getNome() + "?", "Excluir", JOptionPane.YES_NO_OPTION);
    
    // Se o usuário confirmar a exclusão
    if (opcao == JOptionPane.YES_OPTION) {
        try (Connection con = Conectar.conecta();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            
            pstmt.setInt(1, p.getId_paciente());
            int rowsAffected = pstmt.executeUpdate();

            // Verifica se algum registro foi excluído
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Paciente excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum paciente foi excluído.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir paciente");
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(null, "Exclusão cancelada pelo usuário.");
    }
 }
    
    
    public List<PacienteDTO> listar(){
        String sql = "SELECT * FROM paciente ORDER BY nome";
        List<PacienteDTO> lista = new ArrayList<>();

    try (Connection con = Conectar.conecta();
         PreparedStatement pstmt = con.prepareStatement(sql)) {

        ResultSet resultado = pstmt.executeQuery();

        while (resultado.next()) {
            PacienteDTO p = new PacienteDTO();
            
            p.setId_paciente(resultado.getInt("id"));
            p.setNome(resultado.getString("nome"));
            p.setNumBi(resultado.getString("numDocIdent"));
            p.setDataNasc(resultado.getDate("dataNasc").toLocalDate());
            p.setEndereco(resultado.getString("endereco"));
            p.setTelefone(resultado.getString("telefone"));
            lista.add(p);
        }

    } catch (SQLException e) {
        System.err.println("Erro ao listar pacientes: " + e.getMessage());
        e.printStackTrace();
    }

    return lista;
    } 
    
    
    public PacienteDTO buscarPorId(int id) {
    PacienteDTO paciente = null;
    String sql = "SELECT * FROM paciente WHERE id = ?";

    try (Connection con = Conectar.conecta();
         PreparedStatement pstmt = con.prepareStatement(sql)) {

        pstmt.setInt(1, id);
        ResultSet resultado = pstmt.executeQuery();

        if (resultado.next()) {
            paciente = new PacienteDTO();
            paciente.setId_paciente(resultado.getInt("id"));
            paciente.setNome(resultado.getString("nome"));
            paciente.setNumBi(resultado.getString("numDocIdent"));
            paciente.setDataNasc(resultado.getDate("dataNasc").toLocalDate());
            paciente.setEndereco(resultado.getString("endereco"));
            paciente.setTelefone(resultado.getString("telefone"));
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao buscar paciente por ID.");
        e.printStackTrace();
    }

    return paciente;
}
    
    
    
}
