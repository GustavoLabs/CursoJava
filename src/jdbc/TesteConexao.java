package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException, IOException {

        Connection conexao = FabricaConexao.Connection();


        System.out.println("Conexão efetuada com sucesso!");

        conexao.close();

    }
}
