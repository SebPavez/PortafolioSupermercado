package AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import negocio.Cliente;
import sql.ConexionOracle;

public class DaoCliente {

    public static boolean validarRut(String rut) {
        boolean blnSalida = true;
        try {
            Connection conexion = ConexionOracle.getConexion();
            String query = "select * from cliente where rut_cliente = ?";
            PreparedStatement validar = conexion.prepareStatement(query);
            validar.setString(1, rut);
            ResultSet rs = validar.executeQuery();
            if (rs.next()) {
                blnSalida = false;
            }
            validar.close();
            conexion.close();
        } catch (SQLException sqlExc) {
            System.out.println("Error ORACLE al validar correo " + sqlExc.getMessage());
        } catch (Exception exc) {
            System.out.println("Error al validar correo " + exc.getMessage());
        }
        return blnSalida;
    }

    public static boolean validarCorreo(String correo) {
        boolean blnSalida = true;
        try {
            Connection conexion = ConexionOracle.getConexion();
            String query = "select * from cliente where correo = ?";
            PreparedStatement validar = conexion.prepareStatement(query);
            validar.setString(1, correo);
            ResultSet rs = validar.executeQuery();
            if (rs.next()) {
                blnSalida = false;
            }
            validar.close();
            conexion.close();
        } catch (SQLException sqlExc) {
            System.out.println("Error ORACLE al validar correo " + sqlExc.getMessage());
        } catch (Exception exc) {
            System.out.println("Error al validar correo " + exc.getMessage());
        }
        return blnSalida;
    }

    public static boolean agregarCliente(Cliente dto) {
        boolean blnSalida = false;
        try {
            Connection conexion = ConexionOracle.getConexion();
            String query = "INSERT INTO cliente(rut_cliente,nombre_cliente,apellido_paterno_cliente"
                    + ",apellido_materno_cliente,"
                    + "genero_cliente,region_cliente,comuna_cliente,correo"
                    + ",USUARIO_ID_USUARIO)"
                    + "values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement registrar = conexion.prepareStatement(query);
            registrar.setString(1, dto.getRut());
            registrar.setString(2, dto.getNombres());
            registrar.setString(3, dto.getApellidoPaterno());
            registrar.setString(4, dto.getApellidoMaterno());
            registrar.setString(5, dto.getGenero());
            registrar.setString(6, dto.getRegion());
            registrar.setString(7, dto.getComuna());
            registrar.setString(8, dto.getCorreoElectronico());
            registrar.setInt(9, DaoUsuario.obtenerUltimoId());
            registrar.execute();
            blnSalida = true;
            registrar.close();
            conexion.close();
        } catch (SQLException sqlExc) {
            sqlExc.printStackTrace();
            System.out.println("Error SQL al Registrar Cliente " + sqlExc.getMessage());
        } catch (Exception exc) {
            System.out.println("Error al Registrar Cliente " + exc.getMessage());
        }

        return blnSalida;
    }

}
