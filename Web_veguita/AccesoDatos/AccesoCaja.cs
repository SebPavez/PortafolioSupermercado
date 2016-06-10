using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Negocio;

namespace AccesoDatos
{
    public class AccesoCaja
    {
        public static Boolean AbrirCaja(int parId)
        {
            bool blnSalida = false;
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = bd.CAJA.Where(s => s.ID_CAJA == parId).ToList();
                    foreach (var item in query)
                    {
                        item.ESTADO = "1";
                        bd.SaveChanges();
                        blnSalida = true;

                    }
                }
                return blnSalida;
            }
            catch (Exception)
            {
                return false;
            }
        }

        public static Boolean CerrarCaja(int parId)
        {
            bool blnSalida = false;
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = bd.CAJA.Where(s => s.ID_CAJA == parId).ToList();
                    foreach (var item in query)
                    {
                        item.ESTADO = "0";
                        bd.SaveChanges();
                        blnSalida = true;

                    }
                }
                return blnSalida;
            }
            catch (Exception)
            {
                return false;
            }
        }

        public static Caja BuscarCajaPorId(int parId)
        {
            Caja caja = new Caja();
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = bd.CAJA.Where(s => s.ID_CAJA == parId).Single();
                    if (query != null)
                    {
                        caja.IdCaja = Convert.ToInt32(query.ID_CAJA);
                        caja.Total_Vendido = Convert.ToInt32(query.TOTAL_VENDIDO);
                        caja.Fecha = Convert.ToDateTime(query.FECHA);
                        caja.Terminal = AcessoTerminal.BuscarTerminalPorId(Convert.ToInt32(AcessoTerminal.ObtenerPrimerId()));
                        if (query.ESTADO == "1")
                            caja.Estado = true;
                        else
                            caja.Estado = false;
                    }
                }
                return caja;
            }
            catch (Exception)
            {
                return null;
            }
        }

        public static int ObtenerPrimerId()
        {
            int intSalida = 0;
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = (from item in bd.CAJA
                                 select item.ID_CAJA).Min();
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
