package AccesoDatos;

import negocio.Producto;
import sql.ConexionOracle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoProducto {

    public static ArrayList<Producto> cargarProductos() {
        ArrayList<Producto> productos = null;
        try {
            Connection conexion = ConexionOracle.getConexion();
            String query = "SELECT * FROM PRODUCTO ";
            PreparedStatement buscar = conexion.prepareStatement(query);
            ResultSet rs = buscar.executeQuery();
            productos = new ArrayList<Producto>();
            while (rs.next()) {
                Producto dto = new Producto();
                dto.setId_producto(rs.getInt("id_producto"));
                dto.setNombre_producto(rs.getString("nombre_producto"));
                dto.setPrecio(rs.getInt("precio"));
                dto.setCategoria(rs.getString("categoria"));
                dto.setStock(rs.getInt("stock"));
                productos.add(dto);
            }
            buscar.close();
            conexion.close();
        } catch (SQLException sqlExc) {
            System.out.println("Error ORACLE al cargar los productos " + sqlExc.getMessage());
        } catch (Exception exc) {
            System.out.println("Error al cargar los productos " + exc.getMessage());
        }
        return productos;
    }
    
    public static ArrayList<Producto> cargarProductosPorCategoria(String categoria) {
        
        ArrayList<Producto> productos = null;
        try {
            Connection conexion = ConexionOracle.getConexion();
            String query = "SELECT * FROM PRODUCTO WHERE categoria = ?";
            PreparedStatement buscar = conexion.prepareStatement(query);
            buscar.setString(1, Character.toUpperCase(categoria.charAt(0)) + categoria.substring(1).toLowerCase());
            ResultSet rs = buscar.executeQuery();
            productos = new ArrayList<Producto>();
            while (rs.next()) {
                Producto dto = new Producto();
                dto.setId_producto(rs.getInt("id_producto"));
                dto.setNombre_producto(rs.getString("nombre_producto"));
                dto.setPrecio(rs.getInt("precio"));
                dto.setCategoria(rs.getString("categoria"));
                dto.setStock(rs.getInt("stock"));
                productos.add(dto);
            }
            buscar.close();
            conexion.close();
        } catch (SQLException sqlExc) {
            System.out.println("Error ORACLE al cargar los productos " + sqlExc.getMessage());
        } catch (Exception exc) {
            System.out.println("Error al cargar los productos " + exc.getMessage());
        }
        return productos;
    }
    
    public static ArrayList<Producto> cargarProductosPorId(int id) {
        ArrayList<Producto> productos = null;
        try {
            Connection conexion = ConexionOracle.getConexion();
            String query = "SELECT * FROM PRODUCTO WHERE id_producto = ?";
            PreparedStatement buscar = conexion.prepareStatement(query);
            buscar.setInt(1, id);
            ResultSet rs = buscar.executeQuery();
            productos = new ArrayList<Producto>();
            while (rs.next()) {
                Producto dto = new Producto();
                dto.setId_producto(rs.getInt("id_producto"));
                dto.setNombre_producto(rs.getString("nombre_producto"));
                dto.setPrecio(rs.getInt("precio"));
                dto.setCategoria(rs.getString("categoria"));
                dto.setStock(rs.getInt("stock"));
                productos.add(dto);
            }
            buscar.close();
            conexion.close();
        } catch (SQLException sqlExc) {
            System.out.println("Error ORACLE al cargar los productos " + sqlExc.getMessage());
        } catch (Exception exc) {
            System.out.println("Error al cargar los productos " + exc.getMessage());
        }
        return productos;
    }
    
    public static ArrayList<Producto> cargarProductosPorStockDisponible() {
        ArrayList<Producto> productos = null;
        try {
            Connection conexion = ConexionOracle.getConexion();
            String query = "SELECT * FROM PRODUCTO order by stock asc";
            PreparedStatement buscar = conexion.prepareStatement(query);
            ResultSet rs = buscar.executeQuery();
            productos = new ArrayList<Producto>();
            while (rs.next()) {
                Producto dto = new Producto();
                dto.setId_producto(rs.getInt("id_producto"));
                dto.setNombre_producto(rs.getString("nombre_producto"));
                dto.setPrecio(rs.getInt("precio"));
                dto.setCategoria(rs.getString("categoria"));
                dto.setStock(rs.getInt("stock"));
                productos.add(dto);
            }
            buscar.close();
            conexion.close();
        } catch (SQLException sqlExc) {
            System.out.println("Error ORACLE al cargar los productos " + sqlExc.getMessage());
        } catch (Exception exc) {
            System.out.println("Error al cargar los productos " + exc.getMessage());
        }
        return productos;
    }
}
