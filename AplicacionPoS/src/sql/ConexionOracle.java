package sql;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionOracle {
    public static Connection getConexion() {

        Connection connection = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "db_Veguita", "1");
        } catch (Exception e) {
            System.out.println("Error al conectar la base de datos" + e.getMessage());
        }
        return connection;
    }

}
