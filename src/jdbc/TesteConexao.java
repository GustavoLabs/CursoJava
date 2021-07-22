package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        //"jdbc:mariadb://localhost:3306/DB?user=root&password=root";
        final String url = "jdbc:mariadb://localhost";
        final String usuario = "root";
        final String password = "root";

        Connection conexao = DriverManager
                .getConnection(url,usuario,password);


        System.out.println("Conexão efetuada com sucesso!");

        conexao.close();

    }
}
