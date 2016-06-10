using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using AccesoDatos;
using Negocio;
using System.Globalization;

namespace Vista.paginas
{
    public partial class VerCatalogo : System.Web.UI.Page
    {
        List<Detalle_Venta> pedidos = null;
        List<Producto> productos = null;
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                CargarProductos(AccesoProducto.ListarProductos());
            }

            if (Session["Pedidos"] == null)
                pedidos = new List<Detalle_Venta>();
            else
                pedidos = (List<Detalle_Venta>)Session["Pedidos"];

            if (Session["Productos"] == null)
                productos = new List<Producto>();
            else
                productos = (List<Producto>)Session["Productos"];
        }

        protected void ddlFiltrar_SelectedIndexChanged(object sender, EventArgs e)
        {
            switch (ddlFiltrar.SelectedIndex)
            {
                case 0: // Todos
                    pnlFiltro.Visible = false;
                    CargarProductos(AccesoProducto.ListarProductos());
                    break;
                case 1: // Categoria
                    pnlFiltro.Visible = true;
                    break;
                case 2: // Proveedor
                    pnlFiltro.Visible = true;
                    break;
            }

        }

        private void CargarProductos(List<Producto> parProductos)
        {
            gdvProductos.DataSource = parProductos;
            gdvProductos.DataBind();
        }

        protected void gdvProductos_SelectedIndexChanged(object sender, EventArgs e)
        {
            GridViewRow row = gdvProductos.SelectedRow;
            lblProductoSeleccionado.Text = row.Cells[2].Text;
            //Detalle_Venta pedido = new Detalle_Venta();

        }

        protected void gdvProductosSeleccionados_SelectedIndexChanged(object sender, EventArgs e)
        {
        }

        private void CargarProductosSeleccionados()
        {

            for (int i = 0; i < productos.Count; i++)
            {
                productos[i].Stock = pedidos[i].Cantidad;
            }
            gdvProductosSeleccionados.DataSource = productos;
            gdvProductosSeleccionados.DataBind();
            gdvProductosSeleccionados.HeaderRow.Cells[4].Text = "Cantidad";
        }

        protected void btnAgregarPedido_Click(object sender, EventArgs e)
        {
            if (lblProductoSeleccionado.Text == string.Empty)
                ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('Selecciona un producto')", true);
            else
            {
                int salida;
                if (Int32.TryParse(txtCantidad.Text, out salida))
                {
                    GridViewRow row = gdvProductos.SelectedRow;
                    Producto nuevoProducto = AccesoProducto.BuscarProductoPorId(Convert.ToInt32(row.Cells[1].Text));
                    productos.Add(nuevoProducto);
                    Detalle_Venta pedido = new Detalle_Venta();
                    pedido.Producto = AccesoProducto.BuscarProductoPorId(Convert.ToInt32(row.Cells[1].Text));
                    pedido.Cantidad = Convert.ToInt32(txtCantidad.Text);
                    pedido.SubTotal = Convert.ToInt32(txtCantidad.Text) * (Convert.ToInt32(row.Cells[4].Text));
                    pedidos.Add(pedido);
                    txtCantidad.Text = string.Empty;
                    Session["Pedidos"] = pedidos;
                    Session["Productos"] = productos;
                    CargarProductosSeleccionados();
                    pnlCarritoDeCompras.Visible = true;
                }
                else
                    ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('Ingresa una cantidad numerica')", true);
            }

        }

        protected void btnIrMenuCompras_Click(object sender, EventArgs e)
        {
            if (pedidos == null)
                ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('Selecciona al menos 1 producto para comprar')", true);
            else
            {
                Session["Pedidos"] = pedidos;
                Session["Productos"] = productos;
                Response.Redirect("ComprarProductos.aspx");
            }
        }

        protected void gdvProductosSeleccionados_DataBound(object sender, EventArgs e)
        {
            txtTotalPago.Text = AccesoVenta.CalcularTotal(pedidos, productos).ToString();
        }

        protected void gdvProductosSeleccionados_RowDeleting(object sender, GridViewDeleteEventArgs e)
        {

        }

        protected void btnBuscar_Click(object sender, EventArgs e)
        {
            switch (ddlFiltrar.SelectedIndex)
            {
                case 1: // Categoria
                    pnlFiltro.Visible = true;
                    CargarProductos(AccesoProducto.ListarProductosPorCategoria(PrimeraLetraMayuscula(txtBuscar.Text)));
                    if (gdvProductos.DataSource == null)
                        ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('No hay productos que cumplan los requesitos ingresados')", true);
                    break;
                case 2: // Proveedor
                    CargarProductos(AccesoProducto.ListarProductosPorProveedor(PrimeraLetraMayuscula(txtBuscar.Text)));
                    if (gdvProductos.DataSource == null)
                        ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('No hay productos que cumplan los requesitos ingresados')", true);
                    break;
                default:
                    ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('Selecciona una opcion')", true);
                    break;
            }
        }


        private string PrimeraLetraMayuscula(string texto)
        {
            CultureInfo cultureInfo = System.Threading.Thread.CurrentThread.CurrentCulture;
            TextInfo textInfo = cultureInfo.TextInfo;
            return textInfo.ToTitleCase(texto);
        }

        protected void txtBuscar_TextChanged(object sender, EventArgs e)
        {

        }
    }


}