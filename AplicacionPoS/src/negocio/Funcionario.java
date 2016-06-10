
package negocio;
import java.util.Date;

public class Funcionario extends Persona{
    private int sueldo_base;
    private Date fecha_contrato;
    private Terminal terminal;

    public Funcionario() {
        this.sueldo_base = 0;
        this.fecha_contrato = new Date();
        this.terminal = null;
    }

    public int getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(int sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public Date getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(Date fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    public Terminal getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "sueldo_base=" + sueldo_base + ", fecha_contrato=" + fecha_contrato + ", terminal=" + terminal + '}';
    }
    
}
