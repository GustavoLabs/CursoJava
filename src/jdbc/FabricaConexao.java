package jdbc;

import java.io.FileInputStream;
import java.io.FilePermission;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

    public static Connection Connection()  {
        try {
        Properties prop = getProperties();
        final String url = prop.getProperty("url");
        final String usuario = prop.getProperty("user");
        final String password = prop.getProperty("psw");


            return DriverManager.getConnection(url, usuario, password);
        } catch (SQLException |IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static  Properties getProperties() throws IOException {
        Properties prop = new Properties();
        String input = "/conexao.properties";
        prop.load(FabricaConexao.class.getResourceAsStream(input));

        return prop;
    }


}
