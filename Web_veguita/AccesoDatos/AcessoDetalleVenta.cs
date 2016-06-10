using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Negocio;

namespace AccesoDatos
{
    public class AcessoDetalleVenta
    {


        public static Boolean AgregarPedido(Detalle_Venta parPedido)
        {
            Boolean blnSalida = false;
            try
            {
                using (Entities bd = new Entities())
                {
                    DETALLE_VENTA pedido = new DETALLE_VENTA();
                    pedido.PRODUCTO_ID_PRODUCTO = parPedido.Producto.IdProducto;
                    pedido.VENTA_ID_VENTA = parPedido.Venta.IdVenta;
                    pedido.CANTIDAD = parPedido.Cantidad;
                    pedido.SUB_TOTAL = parPedido.SubTotal;

                    bd.AddToDETALLE_VENTA(pedido);
                    bd.SaveChanges();
                    blnSalida = true;
                }
                return blnSalida;
            }
            catch (Exception)
            {
                return false;
            }
        }


    }
}
