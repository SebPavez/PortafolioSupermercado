using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Vista.paginas
{
    public partial class Home : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnIniciarSesion_Click(object sender, EventArgs e)
        {
            Response.Redirect("../paginas/InicioSesion.aspx");
        }

        protected void btnRegistrarme_Click(object sender, EventArgs e)
        {
            Response.Redirect("../paginas/CrearCuenta.aspx");
        }
    }
}