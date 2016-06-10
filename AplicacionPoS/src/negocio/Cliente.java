package negocio;

public class Cliente extends Persona {

    private int totalCompras;
    private String correoElectronico;

    public int getTotalCompras() {
        return totalCompras;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setTotalCompras(int totalCompras) {
        this.totalCompras = totalCompras;
    }
}
