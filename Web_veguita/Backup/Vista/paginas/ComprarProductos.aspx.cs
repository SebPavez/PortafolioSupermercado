using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using Negocio;
using AccesoDatos;

namespace Vista.paginas
{
    public partial class ComprarProducto : System.Web.UI.Page
    {

        List<Detalle_Venta> pedidos = null;
        List<Producto> productos = null;

        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["Pedidos"] == null)
                ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('Selecciona al menos 1 producto para comprar')", true);
            else
                pedidos = (List<Detalle_Venta>)Session["Pedidos"];

            if (Session["Productos"] != null)
                productos = (List<Producto>)Session["Productos"];
            txtTotalPago.Text = AccesoVenta.CalcularTotal(pedidos, productos).ToString();

        }

        protected void btnConfirmarCompra_Click(object sender, EventArgs e)
        {
            try
            {
                Venta nuevaVenta = new Venta();
                nuevaVenta.Total = Convert.ToInt32(txtTotalPago.Text);
                nuevaVenta.FechaVenta = new DateTime().Date;
                nuevaVenta.Cliente = AccesoCliente.BuscarClientePorRut(((Cliente)Session["Cliente"]).Rut);
                nuevaVenta.Caja = AccesoCaja.BuscarCajaPorId(AccesoCaja.ObtenerPrimerId());
                nuevaVenta.Terminal = AcessoTerminal.BuscarTerminalPorId(AcessoTerminal.ObtenerPrimerId());

                AccesoVenta.AgregarVenta(nuevaVenta); 

                foreach (var item in pedidos)
                {
                    item.Venta = AccesoVenta.BuscarVentaPorId(AccesoVenta.ObtenerUltimoId());                    
                    AcessoDetalleVenta.AgregarPedido(item);
                    
                }
                ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('Comprado!!!')", true);
            }
            catch (Exception ex)
            {
                ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('No se pudo realizar la compra. Intenta mas tarde. "+ ex.Message +"')" , true);
            }
        }
    }
}