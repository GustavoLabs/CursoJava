package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o nome: ");
        String nome = scan.nextLine();

        Connection conexao = FabricaConexao.Connection();

        //String sql = "INSERT INTO pessoas (codigo, nome) VALUES (?, ?)";
        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        //int codigo  = 100000;
        //stmt.setInt(1, codigo);
        stmt.setString(1, nome);

        stmt.execute();

        System.out.println("Pessoa incluida com sucesso!");
        scan.close();
    }
}
