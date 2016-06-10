using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using Negocio;

namespace Vista.paginas
{
    public partial class Inicio : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["Cliente"] != null)
            {
                lblNombreCliente.Text = ((Cliente)Session["Cliente"]).Nombres;
            }
        }
    }
}