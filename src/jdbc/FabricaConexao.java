package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

    public static Connection Connection() throws IOException {
        Properties prop = getProperties();
        final String url = prop.getProperty("url");
        final String usuario = prop.getProperty("user");
        final String password = prop.getProperty("password");

        try {
            return DriverManager.getConnection(url, usuario, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() throws IOException {
        Properties prop = new Properties();
        prop.load(FabricaConexao.class.getResourceAsStream("/conexao.properties"));
        return prop;
    }


}
