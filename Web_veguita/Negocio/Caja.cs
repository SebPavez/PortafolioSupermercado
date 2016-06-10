using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Negocio
{
    public class Caja
    {
        public int IdCaja { get; set; }
        public int Total_Vendido { get; set; }
        public DateTime Fecha { get; set; }
        public Boolean Estado { get; set; }
        public Terminal Terminal { get; set; }

        public Caja()
        {

        }
    }
}
