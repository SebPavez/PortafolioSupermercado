
package negocio;

import java.util.Date;

public class Producto {
    private int id_producto;
    private String nombre_producto;
    private int stock;
    private int precio;
    private Date fecha_vencimiento;
    private String categoria;
    private Proveedor proveedor;

    public Producto() {
        this.id_producto = 0;
        this.nombre_producto = new String();
        this.stock = 0;
        this.precio = 0;
        this.fecha_vencimiento = new Date();
        this.categoria = new String();
        this.proveedor = null;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
    
    
    
}
