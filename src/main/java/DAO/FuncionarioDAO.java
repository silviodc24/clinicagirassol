/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.*;
import Entidades.Funcionario;
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
public class FuncionarioDAO {
    
       public void cadastrar(FuncionarioDTO f){
       String sql = "INSERT INTO funcionario (nome, cargo, salario, dataContratacao) VALUES (?,?,?,?)";
       
       try(Connection con = Conectar.conecta();
               PreparedStatement pstmt = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
               
           pstmt.setString(1,f.getNome());
           pstmt.setString(2,f.getCargo());
           pstmt.setDouble(3, f.getSalario());
           pstmt.setDate(4, java.sql.Date.valueOf(f.getDataContratacao()));
           
             // Executa a inserção
                int rowsAffected = pstmt.executeUpdate();

                // Se desejar obter o ID gerado pela inserção, você pode fazer o seguinte:
                if (rowsAffected > 0) {
                    try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            // Obtendo o ID gerado para o novo paciente
                           f.setCodigo(generatedKeys.getInt(1));
                        } else {
                            throw new SQLException("Falha ao obter o ID do Funcionario inserido.");
                        }
                    }
                }
        JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
       }catch(SQLException e){
       
        JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionário."+e.getMessage());
        e.printStackTrace();
        throw new RuntimeException(e.getMessage());
    
       
       }
   }
   
   public void atualizar(FuncionarioDTO f){
       String sql = "UPDATE funcionario SET nome = ?, cargo = ?, salario = ?, dataContratacao = ?";
       
       try(Connection con = Conectar.conecta();
               PreparedStatement pstmt = con.prepareStatement(sql)){
               pstmt.setString(1,f.getNome());
               pstmt.setString(2, f.getCargo());
               pstmt.setDouble(3, f.getSalario());
               pstmt.setDate(3, java.sql.Date.valueOf(f.getDataContratacao()));
                
               pstmt.executeUpdate();
               JOptionPane.showMessageDialog(null, "Funcionario atualizado com sucesso!");
               
       }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Erro ao atualizar dados do funcionário");
             e.printStackTrace();
       }
       
       
   }
   
   public void excluir(FuncionarioDTO f){
       String sql = "DELETE FROM funcionario WHERE codigo = ?";
      
       int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir o funcionário " + f.getNome() + "?", "Excluir", JOptionPane.YES_NO_OPTION);
       if(opcao == JOptionPane.YES_OPTION){
            try(Connection con = Conectar.conecta();
                    PreparedStatement pstmt = con.prepareStatement(sql)){
                    pstmt.setInt(1, f.getCodigo());

                    int rowsAffected = pstmt.executeUpdate();

                    if(rowsAffected > 0){
                        JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso");
                    }else{
                        JOptionPane.showMessageDialog(null, "Nenhum funcionário foi excluído");
                    }

            }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados do funcionário");
            e.printStackTrace();
            }
       }else {
        JOptionPane.showMessageDialog(null, "Exclusão cancelada pelo usuário.");
    }
       
       
 }
   
   public List<FuncionarioDTO> listar(){
    String sql = "SELECT * FROM funcionario ORDER BY nome";
    List<FuncionarioDTO> lista = new ArrayList<>();

    try (Connection con = Conectar.conecta();
         PreparedStatement pstmt = con.prepareStatement(sql)) {

        ResultSet resultado = pstmt.executeQuery();

        while (resultado.next()) {
            FuncionarioDTO f = new FuncionarioDTO();
           
            f.setCodigo(resultado.getInt("codigo"));
            f.setNome(resultado.getString("nome"));
            f.setCargo(resultado.getString("cargo"));
            f.setSalario(resultado.getDouble("salario"));
            f.setDataContratacao(resultado.getDate("dataNasc").toLocalDate());
            lista.add(f);
        }

    } catch (SQLException e) {
        System.err.println("Erro ao listar pacientes: " + e.getMessage());
        e.printStackTrace();
    }

    return lista;
 }
   
}
