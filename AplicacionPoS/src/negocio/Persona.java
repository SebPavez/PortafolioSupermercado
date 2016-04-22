package negocio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 * @author Sebastian Pavez
 */
public class Persona {
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String rut;
    private String direccion;
    private String region;
    private String provincia;
    private String comuna;
    private String genero;
    private String fechaNacimiento;
    private String correoElectronico;
    private String numeroTelefono;

    public String getNombres() {
        return nombres;
    }

    public boolean setNombres(String nombres) {
        if(!nombres.isEmpty())
        {
            this.nombres = nombres;
            return true;
        }
        return false;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public boolean setApellidoPaterno(String apellidoPaterno) {
        if(!apellidoPaterno.isEmpty())
        {
            this.apellidoPaterno = apellidoPaterno;
            return true;
        }
        return false;        
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public boolean setApellidoMaterno(String apellidoMaterno) {
        if(!apellidoMaterno.isEmpty())
        {
            this.apellidoMaterno = apellidoMaterno;
            return true;
        }
        return false;
    }

    public String getRut() {
        return rut;
    }

    public boolean setRut(String rut) {
        Pattern regex = Pattern.compile("^([0-9]+-[0-9K])$");
        //String dv = rut.substring(rut.length()-1, 1);
        Matcher valor = regex.matcher(rut.replace('.', ' ').toUpperCase());        
        if(valor.matches())
        {
            this.rut = rut;
            return true;
        }
        return false;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean setDireccion(String direccion) {
        if(!direccion.isEmpty())
        {
            this.direccion = direccion;
            return true;
        }
        return false;
    }

    public String getRegion() {
        return region;
    }

    public boolean setRegion(String region) {
        if(!region.isEmpty())
        {
            this.region = region;
            return true;
        }
        return false;
    }
        
    
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getGenero() {
        return genero;
    }

    public boolean setGenero(String genero) {
        if(!genero.isEmpty())
        {
            this.genero = genero;
            return true;
        }
        return false;        
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public boolean setFechaNacimiento(String fechaNacimiento) {
        if(!fechaNacimiento.isEmpty())
        {
            this.fechaNacimiento = fechaNacimiento;
            return true;
        }
        return false;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", rut=" + rut + ", direccion=" + direccion + ", region=" + region + ", provincia=" + provincia + ", comuna=" + comuna + ", genero=" + genero + ", fechaNacimiento=" + fechaNacimiento + ", correoElectr\u00f3nico=" + correoElectronico + ", numeroTelefono=" + numeroTelefono + '}';
    }
    
}
