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
public class EspecialidadeDAO {
    
    public void cadastrar(Especialidade esp){
        String sql = "INSERT INTO especialidade (nome, descricao) VALUES (?,?)";

        try (Connection con = Conectar.conecta();
                 PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){

                pstmt.setString(1, esp.getNome());
                pstmt.setString(2, esp.getDescricao());

                int rowsAffected = pstmt.executeUpdate();

                // Se desejar obter o ID gerado pela inserção, você pode fazer o seguinte:
                if (rowsAffected > 0) {
                    try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            // Obtendo o ID gerado para o novo paciente
                            esp.setCodigo(generatedKeys.getInt(1));
                        } else {
                            throw new SQLException("Falha ao obter o ID da Especialidade inserida.");
                        }
                    }
                }
            JOptionPane.showMessageDialog(null, "Especialidade cadastrada com sucesso!");


        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar paciente. "+erro);
            erro.printStackTrace();
            throw new RuntimeException(erro.getMessage());

        }
    }
    
    public void atualizar(Especialidade esp){
    
            String sql = "UPDATE especialidade SET nome = ?, descricao = ? WHERE codigo = ?";
            
            try(Connection con = Conectar.conecta();
                    PreparedStatement pstmt = con.prepareStatement(sql)){
            
            pstmt.setString(1, esp.getNome());
            pstmt.setString(2, esp.getDescricao());
            pstmt.setInt(3, esp.getCodigo());
            
            
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Paciente atualizado com sucesso!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar dados do paciente.");
                e.printStackTrace();
            }
    }
   
    public void excluir(Especialidade esp){
        String sql = "DELETE FROM especialidade WHERE codigo = ?";
    
    // Exibe um diálogo de confirmação para o usuário
    int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir o paciente " + esp.getNome() + "?", "Excluir", JOptionPane.YES_NO_OPTION);
    
    // Se o usuário confirmar a exclusão
    if (opcao == JOptionPane.YES_OPTION) {
        try (Connection con = Conectar.conecta();
             PreparedStatement pstmt = con.prepareStatement(sql)) {
            
            pstmt.setInt(1, esp.getCodigo());
            int rowsAffected = pstmt.executeUpdate();

            // Verifica se algum registro foi excluído
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Especialidade excluída com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum especialidade foi excluída.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir especialidade");
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(null, "Exclusão cancelada pelo usuário.");
    }
 }
    
    public List<Especialidade> listarEspecialidade(){
    String sql = "SELECT * FROM especialidade ORDER BY nome";
        List<Especialidade> lista = new ArrayList<>();

    try (Connection con = Conectar.conecta();
         PreparedStatement pstmt = con.prepareStatement(sql)) {

        ResultSet resultado = pstmt.executeQuery();

        while (resultado.next()) {
            Especialidade esp = new Especialidade();
            
            esp.setCodigo(resultado.getInt("codigo"));
            esp.setNome(resultado.getString("nome"));
            esp.setDescricao(resultado.getString("descricao"));
            lista.add(esp);
        }

    } catch (SQLException e) {
        System.err.println("Erro ao listar pacientes: " + e.getMessage());
        e.printStackTrace();
    }

    return lista;
    }
    
}
