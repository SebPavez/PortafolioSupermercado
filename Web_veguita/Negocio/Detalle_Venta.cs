using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Negocio
{
    public class Detalle_Venta
    {
        public int Cantidad { get; set; }
        public int SubTotal { get; set; }
        public Producto Producto { get; set; }
        public Venta Venta { get; set; }
    }
}
