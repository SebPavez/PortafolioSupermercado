package aplicacionpos;

import AccesoDatos.DaoCliente;
import AccesoDatos.DaoUsuario;
import negocio.Cliente;
import negocio.Producto;
import negocio.Usuario;
import vista.*;

public class AplicacionPoS {

    public static void main(String[] args) {
        VentanaLogin nuevaInstancia = new VentanaLogin();        
        nuevaInstancia.setVisible(true);

    }

}
