using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using AccesoDatos;

namespace Vista.paginas
{
    public partial class InicioSesion : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        private void LimpiarPantalla()
        {
            txtContraseña.Text = string.Empty;
            txtRut.Text = string.Empty;
        }

        protected void btnIngresar_Click(object sender, EventArgs e)
        {
            if (AccesoUsuario.ValidarCliente(txtRut.Text, txtContraseña.Text))
            {
                Session["Cliente"] = AccesoCliente.BuscarClientePorRut(txtRut.Text);
                Response.Redirect("Inicio.aspx");
            }
            else
            {
                ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('No se encontro ninguna cuenta con los datos ingresados.')", true);
            }

        }


    }
}