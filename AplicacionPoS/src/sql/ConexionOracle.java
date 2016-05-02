package sql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Clase conexión a base de datos Oracle
 * @author Sebastian Pavez
 */
public class ConexionOracle {
    public static Connection getConexion() {

        Connection connection = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.33:8080:XE", "1", "1");
        } catch (Exception e) {
            System.out.println("Error al conectar la base de datos " + e.getMessage());
        }
        return connection;
    }

}
