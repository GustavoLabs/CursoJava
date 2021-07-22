package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DropTabela {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.Connection();

        String sql = "DROP TABLE IF EXISTS pessoas";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.execute();

        conexao.close();
    }
}
