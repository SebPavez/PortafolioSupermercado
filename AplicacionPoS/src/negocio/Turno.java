
package negocio;

import java.util.Date;

public class Turno {
    private int id_turno;
    private Date hora_inicio;
    private Date hora_termino;
    private Caja caja;

    public Turno() {
        this.id_turno = 0;
        this.hora_inicio = new Date();
        this.hora_termino = new Date();
        this.caja = null;
    }

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public Date getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Date hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Date getHora_termino() {
        return hora_termino;
    }

    public void setHora_termino(Date hora_termino) {
        this.hora_termino = hora_termino;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }
    
    
}
