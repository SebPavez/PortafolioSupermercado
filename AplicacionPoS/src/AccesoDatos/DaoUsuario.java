package AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import negocio.Funcionario;
import negocio.Usuario;
import sql.ConexionOracle;

public class DaoUsuario {

    public static boolean agregarUsuario(Usuario dto) {
        boolean blnSalida = false;
        try {
            Connection conexion = ConexionOracle.getConexion();
            String query = "INSERT INTO usuario (id_usuario,contraseña) VALUES (ID_USUARIO_SEQ.nextval,?)";
            PreparedStatement registrar = conexion.prepareStatement(query);
            registrar.setString(1, dto.getContraseña());
            registrar.execute();
            blnSalida = true;
            registrar.close();
            conexion.close();
        } catch (SQLException sqlExc) {
            System.out.println("Error SQL al Registrar Usuario " + sqlExc.getMessage());
        } catch (Exception exc) {
            System.out.println("Error al Registrar Usuario " + exc.getMessage());
        }

        return blnSalida;
    }

    public static boolean validarUsuario(String rut, String contraseña) {
        boolean blnSalida = false;
        try {
            Connection conexion = ConexionOracle.getConexion();
            String query = "select rut_fun from funcionario,usuario where Usuario_id_usuario = id_usuario and rut_fun = ? and contraseña = ?";
            PreparedStatement validar = conexion.prepareStatement(query);
            validar.setString(1, rut);
            validar.setString(2, contraseña);
            ResultSet rs = validar.executeQuery();
            if (rs.next()) {
                blnSalida = true;
            }
            validar.close();
            conexion.close();
        } catch (SQLException sqlExc) {
            System.out.println("Error ORACLE al validar usuario " + sqlExc.getMessage());
        } catch (Exception exc) {
            System.out.println("Error al validar usuario " + exc.getMessage());
        }
        return blnSalida;
    }

    public static Funcionario buscarFuncionarioPorRutFuncionario(String rut) {
        Funcionario dto = new Funcionario();
        try {
            Connection conexion = ConexionOracle.getConexion();
            String query = "select nombre_fun from funcionario where rut_fun = ?";
            PreparedStatement validar = conexion.prepareStatement(query);
            validar.setString(1, rut);
            ResultSet rs = validar.executeQuery();
            if (rs.next()) {
                dto.setRut(rut);
                dto.setNombres(rs.getString("nombre_fun"));
            }
            validar.close();
            conexion.close();
        } catch (SQLException sqlExc) {
            System.out.println("Error ORACLE al buscar funcionario por rut " + sqlExc.getMessage());
        } catch (Exception exc) {
            System.out.println("Error al buscar funcionario por rut " + exc.getMessage());
        }
        return dto;
    }

    public static int obtenerUltimoId() {
        int ultimoId = 0;
        try {
            Connection conexion = ConexionOracle.getConexion();
            String id = "select id_usuario from usuario where id_usuario = (select max(id_usuario) from usuario)";
            PreparedStatement obtenerId = conexion.prepareStatement(id);
            ResultSet rs = obtenerId.executeQuery();
            while (rs.next()) {
                ultimoId = rs.getInt("id_usuario");
            }
            obtenerId.close();
            conexion.close();
        } catch (SQLException sqlExc) {
            System.out.println("Error SQL al Registrar Cliente " + sqlExc.getMessage());
        } catch (Exception exc) {
            System.out.println("Error al Registrar Cliente " + exc.getMessage());
        }
        return ultimoId;
    }
}
