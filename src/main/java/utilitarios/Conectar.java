package utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author silvi_5cnyxi8
 */
public class Conectar {
    private static final String url = "jdbc:mysql://localhost:3306/clinicagirassol";
    private static final String user = "root";
    private static final String senha = "Silviodc240702@";
    private static Connection con = null;
    
    public static Connection conecta() {
        try {
            // Certifique-se de que o driver JDBC está registrado
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, senha);
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Driver JDBC não encontrado: " + e.getMessage());
        }
        return con;
    }
}
