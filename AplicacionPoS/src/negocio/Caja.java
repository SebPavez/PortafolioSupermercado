package negocio;
import java.sql.Time;
import java.util.Date;

public class Caja {
    private int id_caja;
    private int total_vendido;
    private Date fecha;
    private Time horaApertura;
    private Time horaCierre;
    private Funcionario responsable;
    private int idTerminal;

    public int getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(int idTerminal) {
        this.idTerminal = idTerminal;
    }


    public Time getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(Time horaApertura) {
        this.horaApertura = horaApertura;
    }

    public Time getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(Time horaCierre) {
        this.horaCierre = horaCierre;
    }

    public Funcionario getResponsable() {
        return responsable;
    }

    public void setResponsable(Funcionario responsable) {
        this.responsable = responsable;
    }

    
    public Caja() {
        this.id_caja = 0;
        this.total_vendido = 0;
        this.fecha = new Date();
    }
    
    public int getId_caja() {
        return id_caja;
    }

    public void setId_caja(int id_caja) {
        this.id_caja = id_caja;
    }

    public int getTotal_vendido() {
        return total_vendido;
    }

    public void setTotal_vendido(int total_vendido) {
        this.total_vendido = total_vendido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Caja{" + "id_caja=" + id_caja + ", total_vendido=" + total_vendido + ", fecha=" + fecha + '}';
    }
    
    
}
