package negocio;

/**
 *
 * @author Sebastian Pavez
 */
public class Cliente extends Persona {
    private int totalCompras;

    public int getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(int totalCompras) {
        this.totalCompras = totalCompras;
    }
}
