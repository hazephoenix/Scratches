package helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

    public static void main(String[] args) {
        Connection conn;
        String url = "jdbc:postgresql://localhost/test";
        Properties props = new Properties();
        props.setProperty("user","fred");
        props.setProperty("password","secret");
        props.setProperty("ssl","true");

        try {
            conn = DriverManager.getConnection(url, props);
            Statement statement = conn.createStatement();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
