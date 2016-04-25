package AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import negocio.Funcionario;
import sql.ConexionOracle;

/**
 *
 * @author Sebastian Pavez
 */
public class DAOFuncionarioImplementado implements DAOFuncionario {

    @Override
    public boolean agregar(Funcionario dto) {
//        try {            
//            Connection conexion=ConexionOracle.getConexion();
//            String query= "insert into pelicula(nombre_pelicula, anno_pelicula, fecha_registro, id_genero) values (?,?,NOW(),?)";
//            PreparedStatement insertar= conexion.prepareStatement(query);
//            insertar.setString(1, dto.getNombres());            
//            insertar.setString(2, dto.getApellidoPaterno());
//            insertar.setString(3, dto.getApellidoMaterno());
//            insertar.setString(4, dto.);
//            insertar.execute();            
//            insertar.close();
//            conexion.close();
//            return true;
//        } catch (SQLException w) {
//            System.out.println("Error SQL al listar peliculas. " + w.getMessage());
//            return false;
//        } catch (Exception e) {
//            System.out.println("Error al listar peliculas " + e.getMessage());
//            return false;
//        }       
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Funcionario buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public boolean actualizar(Funcionario dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean autenticarFuncionario(String id, String contrasenja) {
        try {            
            Connection conexion=ConexionOracle.getConexion();
            String query= "select rut, contrasenja from Funcionario where rut=? and contrasenja=?";
            PreparedStatement autenticacion= conexion.prepareStatement(query);
            autenticacion.setString(0, id);
            autenticacion.setString(1, contrasenja);
            ResultSet resultado = autenticacion.executeQuery();
            if(resultado.next())           
            {
                autenticacion.close();
                conexion.close();
                return true;
            }
            else
            {
                autenticacion.close();
                conexion.close();
                return false;
            }
        } catch (SQLException w) {
            System.out.println("Error SQL al autenticar: " + w.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al autenticar: " + e.getMessage());
            return false;
        }       
    }

   
}
