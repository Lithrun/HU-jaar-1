package P3.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {

    private static final String DB_DRIV = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/xe";
    private static final String DB_USER = "PERSIST3";
    private static final String DB_PASS = "PERSIST3";
    private static Connection connection;

    public Connection getConnection() {

        try {
            Class.forName(DB_DRIV).newInstance();
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        }
        catch (InstantiationException | IllegalAccessException | ClassNotFoundException |SQLException e1) {
            e1.printStackTrace();
        }

        // Leg de connectie met de database


        return connection;
    }

}
