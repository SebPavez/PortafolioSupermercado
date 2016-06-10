using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Negocio;

namespace AccesoDatos
{
    public class AcessoTerminal
    {

        public static Terminal BuscarTerminalPorId(int parId)
        {
            Terminal salida = new Terminal();
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = bd.TERMINAL.Where(s => s.ID_TERMINAL == parId).ToList();
                    foreach (var item in query)
                    {
                        salida.IdTerminal = parId;
                        salida.FechaAdquisicion = item.FECHA_ADQUISICION;
                        salida.FechaUltimaMantencion = item.FECHA_ULTIMA_MANTENCION;
                    }
                }
                return salida;
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
                    var query = (from item in bd.TERMINAL
                                 select item.ID_TERMINAL).Min();
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
