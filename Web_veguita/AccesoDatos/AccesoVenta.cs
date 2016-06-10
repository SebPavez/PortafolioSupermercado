using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Negocio;

namespace AccesoDatos
{
    public class AccesoVenta
    {
        public static Venta BuscarVentaPorId(int parId)
        {
            Venta venta = new Venta();
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = bd.VENTA.Where(s => s.ID_VENTA == parId).Single();
                    if (query != null)
                    {
                        venta.IdVenta = Convert.ToInt32(query.ID_VENTA);
                        venta.Total = Convert.ToInt32(query.TOTAL_VENTA);
                        venta.FechaVenta = Convert.ToDateTime(query.FECHA_VENTA);
                        venta.Cliente = AccesoCliente.BuscarClientePorRut(query.CLIENTE_RUT);
                        venta.Caja = AccesoCaja.BuscarCajaPorId(Convert.ToInt32(query.CAJA_ID_CAJA));
                        venta.Terminal = AcessoTerminal.BuscarTerminalPorId(Convert.ToInt32(query.TERMINAL_ID_TERMINAL));
                    }
                }
                return venta;
            }
            catch (Exception)
            {
                return null;
            }
        }

        public static int CalcularTotal(List<Detalle_Venta> lstPedidos, List<Producto> lstProductos)
        {
            int total = 0;
            try
            {
                foreach (var pedidoDto in lstPedidos)
                {
                    foreach (var productoDto in lstProductos)
                    {
                        if (pedidoDto.Producto.IdProducto == productoDto.IdProducto)
                        {
                            total = total + (pedidoDto.Cantidad * productoDto.Precio);
                            break;
                        }
                    }
                }
                return total;
            }

            catch (Exception)
            {
                return total;
            }

        }

        public static Boolean AgregarVenta(Venta parVenta)
        {
            Boolean blnSalida = false;
            try
            {
                using (Entities bd = new Entities())
                {
                    VENTA venta = new VENTA();
                    venta.ID_VENTA = ObtenerUltimoId() + 1;
                    venta.FECHA_VENTA = parVenta.FechaVenta;
                    venta.TOTAL_VENTA = parVenta.Total;
                    venta.CLIENTE_RUT = parVenta.Cliente.Rut;
                    venta.CAJA_ID_CAJA = parVenta.Caja.IdCaja;
                    venta.TERMINAL_ID_TERMINAL = parVenta.Terminal.IdTerminal;
                    bd.AddToVENTA(venta);
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

        public static int ObtenerUltimoId()
        {
            int intSalida = 0;
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = (from item in bd.VENTA
                                 select item.ID_VENTA).Max();
                    intSalida = Convert.ToInt32(query);
                }
                return intSalida;
            }
            catch (Exception)
            {
                return intSalida;
            }
        }
    }
}
