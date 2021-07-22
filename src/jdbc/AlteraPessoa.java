package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlteraPessoa {

    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.Connection();
        Scanner scan = new Scanner(System.in);

        String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
        String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        System.out.print("Código da pessoa que deseja alterar:");
        int codigo = scan.nextInt();

        PreparedStatement stmt = conexao.prepareStatement(select);
        stmt.setInt(1, codigo);
        ResultSet result = stmt.executeQuery();

        if (result.next()){
            Pessoa p = new Pessoa(result.getInt("codigo"), result.getNString("nome"));

            System.out.println("O nome atual é " + p.getNome());
            scan.nextLine();

            System.out.print("Inform o novo nome: ");
            String novoNome = scan.nextLine();

            stmt.close();
            stmt = conexao.prepareStatement(update);
            stmt.setString(1, novoNome);
            stmt.setInt(2, codigo);
            stmt.execute();

            System.out.println("Pessoa alterada com sucesso");
        } else{
            System.out.println("Pessoa não encontrada!");
        }

        scan.close();
        stmt.close();
        conexao.close();
    }
}
