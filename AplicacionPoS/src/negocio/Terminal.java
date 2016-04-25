package negocio;
import java.util.Date;

class Terminal {
    private int id_terminal;
    private Date fecha_adquisicion;
    private Date fecha_ultima_mantencion;

    public Terminal() {
        this.id_terminal = 0;
        this.fecha_adquisicion = new Date();
        this.fecha_ultima_mantencion = new Date();
    }

    public int getId_terminal() {
        return id_terminal;
    }

    public void setId_terminal(int id_terminal) {
        this.id_terminal = id_terminal;
    }

    public Date getFecha_adquisicion() {
        return fecha_adquisicion;
    }

    public void setFecha_adquisicion(Date fecha_adquisicion) {
        this.fecha_adquisicion = fecha_adquisicion;
    }

    public Date getFecha_ultima_mantencion() {
        return fecha_ultima_mantencion;
    }

    public void setFecha_ultima_mantencion(Date fecha_ultima_mantencion) {
        this.fecha_ultima_mantencion = fecha_ultima_mantencion;
    }

    @Override
    public String toString() {
        return "Terminal{" + "id_terminal=" + id_terminal + ", fecha_adquisicion=" + fecha_adquisicion + ", fecha_ultima_mantencion=" + fecha_ultima_mantencion + '}';
    }
    
    
    
    
}
