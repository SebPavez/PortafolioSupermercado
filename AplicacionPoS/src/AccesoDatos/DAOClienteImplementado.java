package AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import negocio.Cliente;
import sql.ConexionOracle;

/**
 *
 * @author Sebastian Pavez
 */
public class DAOClienteImplementado implements DAOCliente{

    @Override
    public boolean agregar(Cliente dto) {
        try{
            Connection conexion=ConexionOracle.getConexion();
            String query= "INSERT INTO cliente values ?,?,?,?,?,?,?,?";
            PreparedStatement insercion= conexion.prepareStatement(query);
            insercion.setString(0, dto.getRut());
            insercion.setString(1, dto.getNombres());
            insercion.setString(2, dto.getApellidoPaterno());
            insercion.setString(3, dto.getApellidoMaterno());
            insercion.setInt(4, 22);//dato no contemplado
            insercion.setString(5, dto.getGenero());
            insercion.setString(6, dto.getFechaNacimiento());
            insercion.setInt(7, 0);
            insercion.execute();
            insercion.close();
            conexion.close();
            return true;            
        }
        catch (SQLException w){
            System.out.println("Falla SQL al agregar cliente en BD");
            return false;
        }
        catch (Exception r){
            System.out.println("Falla al agregar cliente en BD");
            return false;
        }
        
    }

    @Override
    public Cliente buscar(int rut) {
        Cliente resultado = new Cliente();
        try {            
            Connection conexion=ConexionOracle.getConexion();
            String query= "SELECT * FROM cliente where rut=?";
            PreparedStatement busqueda= conexion.prepareStatement(query);
            busqueda.setInt(0, rut);
            ResultSet rs = busqueda.executeQuery();
            while(rs.next())
            {
                resultado.setNombres(rs.getString("nombre"));
                resultado.setApellidoPaterno(rs.getString("apellido_paterno"));
                resultado.setApellidoMaterno(rs.getString("apellido_materno"));
                resultado.setComuna("Santiago");
                resultado.setProvincia("Santiago");
                resultado.setComuna("Santiago");
                resultado.setDireccion("nowhere");
                resultado.setCorreoElectronico("hola@noEstoyEnLaBD.cl");
                resultado.setNumeroTelefono("yonotoy");
                resultado.setGenero(rs.getString("genero"));
                resultado.setFechaNacimiento(rs.getString("fecha_nacimiento"));
                resultado.setTotalCompras(rs.getInt("total_gastado"));
            }
            busqueda.close();
            conexion.close();
        } catch (SQLException w) {
            System.out.println("Error SQL al buscar cliente: " + w.getMessage());                        
        } catch (Exception e) {
            System.out.println("Error al buscar cliente: " + e.getMessage());            
        }    
        return resultado;
    }

    @Override
    public boolean actualizar(Cliente dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
