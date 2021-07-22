package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.Connection();
        Scanner scan = new Scanner(System.in);

        System.out.print("ID da pessoa que será excluida: ");
        int codigo = scan.nextInt();

        String delete = "DELETE FROM pessoas WHERE codigo = ?";
        PreparedStatement stmt = conexao.prepareStatement(delete);
        stmt.setInt(1, codigo);

        int contador = stmt.executeUpdate();

        if(contador > 0){
            System.out.println("Registro excluido!");
        } else {
            System.out.println("Nada foi feito.");
        }

        System.out.println("Linhas afetadas: " + contador);

        scan.close();
        stmt.close();
        conexao.close();

    }
}
