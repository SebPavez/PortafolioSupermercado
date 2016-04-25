package AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import negocio.Caja;
import sql.ConexionOracle;

/**
 *
 * @author Sebastian Pavez
 */
public class DAOCajaImplementado implements DAOCaja{

    @Override
    public boolean abrirCaja(Caja dao) {  
//        
//        String sql_insert = "INSERT INTO mytable(content) VALUES (?)";
//        String sql_currval = "SELECT seq_mytable.CURRVAL FROM dual";
//
//        Connection connection = null;
//        PreparedStatement statement = null;
//        Statement currvalStatement = null;
//        ResultSet currvalResultSet = null;
//
//        try {
//            connection = database.getConnection();
//            connection.setAutoCommit(false);
//            statement = connection.prepareStatement(sql_insert);
//            statement.setString(1, "test");
//            statement.executeUpdate();
//            currvalStatement = connection.createStatement();
//            currvalResultSet = currvalStatement.executeQuery(sql_currval);
//            if (currvalResultSet.next()) {
//                int id = currvalResultSet.getInt(1);
//            }
//            connection.commit();
//        // ...
        
        
        try {            
            Connection conexion=ConexionOracle.getConexion();
            String query= "insert into caja(id_caja, fecha, hora_apertura, id_responsable, id_terminal) values seq_mytable.NEXTVAL(),?,?,?";
            PreparedStatement apertura= conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            apertura.setDate(0, new java.sql.Date(dao.getFecha().getTime()));
            apertura.setTime(1, new java.sql.Time(dao.getHoraApertura().getTime()));
            apertura.setString(2, dao.getResponsable().getRut());
            apertura.setInt(3, dao.getIdTerminal());
            int filasAfectadas = apertura.executeUpdate();
            if(filasAfectadas == 0)
            {
                throw new SQLException("Falla SQL en la creación de caja");                
            }
            try(ResultSet idGeneradas = apertura.getGeneratedKeys()){
                if(idGeneradas.next())
                {
                    dao.setId_caja(idGeneradas.getInt(1));
                    return true;
                }
                else
                    throw new SQLException("Falla en la creación de caja, id no generada");
            }
            
        } catch (SQLException w) {
            System.out.println("Error SQL al autenticar: " + w.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al autenticar: " + e.getMessage());
            return false;
        }    
    }

    @Override
    public boolean cerrarCaja(int idCaja) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregar(Caja dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Caja buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(Caja dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
