using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Negocio
{
    public class Venta
    {
        public int IdVenta { get; set; }
        public DateTime FechaVenta { get; set; }
        public int Total { get; set; }
        public Cliente Cliente { get; set; }
        public Caja Caja { get; set; }
        public Terminal Terminal { get; set; }

        public Venta()
        {
            IdVenta = 0;
            FechaVenta = new DateTime();
            Total = 0;
            Cliente = null;
            Caja = null;
            Terminal = null;
        }
    }
}
