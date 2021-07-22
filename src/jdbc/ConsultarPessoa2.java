package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa2 {

    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.Connection();
        Scanner scan = new Scanner(System.in);

        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

        System.out.print("Informe o valor para pesquisa: ");
        String valor = scan.nextLine();


        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + valor + "%");
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getNString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + " -> " + p.getNome());

            stmt.close();
            scan.close();
            conexao.close();
        }
    }
}
