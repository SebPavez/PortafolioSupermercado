package negocio;

import java.util.Date;

/**
 *
 * @author Sebastian Pavez
 */
public class Venta {
    private Date fechaVenta;    
    private Cliente comprador;
    private int subTotal;
    private int montoTotalVenta;
    //private Terminal terminalVenta;

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public int getMontoTotalVenta() {
        return montoTotalVenta;
    }

    public void setMontoTotalVenta(int montoTotalVenta) {
        this.montoTotalVenta = montoTotalVenta;
    }
    
}
