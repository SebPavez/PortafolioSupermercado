package negocio;

public class Usuario {
    private int id;
    private String contraseña;

    public Usuario() {
        this.id = 0;
        this.contraseña = new String();
    }
    
    public Usuario(int id, String contraseña) {
        this.id = id;
        this.contraseña = contraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
