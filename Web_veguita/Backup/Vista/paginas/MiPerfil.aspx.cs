using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using Negocio;

namespace Vista.paginas
{
    public partial class MiPerfil : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["Cliente"] != null)
            {
                Cliente cliente = (Cliente)Session["Cliente"];
                txtNombre.Text = cliente.Nombres;
                txtApellidos.Text = cliente.ApellidoPaterno + " " + cliente.ApellidoMaterno;
                if (cliente.Genero.ToString().ToUpper().Equals("F"))
                    txtGenero.Text = "Femenino";
                else
                    txtGenero.Text = "Masculino";
                txtComuna.Text = cliente.Comuna;
                txtCorreo.Text = cliente.CorreoElectronico;
                txtRegion.Text = cliente.Region;

            }
        }
    }
}