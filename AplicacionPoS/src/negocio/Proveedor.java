
package negocio;

public class Proveedor {
    private int id_proveedor;
    private String nombre_proveedor;
    private String direccion;
    private int telefono;

    public Proveedor() {
        this.id_proveedor = 0;
        this.nombre_proveedor = new String();
        this.direccion = new String();
        this.telefono = 0;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "id_proveedor=" + id_proveedor + ", nombre_proveedor=" + nombre_proveedor + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    
}
