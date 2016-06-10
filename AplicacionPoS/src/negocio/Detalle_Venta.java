package negocio;

public class Detalle_Venta {
    private Producto producto;
    private Venta venta;
    private int cantidad;
    private int sub_total;

    public Detalle_Venta() {
        this.producto = null;
        this.venta = null;
        this.cantidad = 0;
        this.sub_total = 0;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSub_total() {
        return sub_total;
    }

    public void setSub_total(int sub_total) {
        this.sub_total = sub_total;
    }
    
    
    
}
