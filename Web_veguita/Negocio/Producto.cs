using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Negocio
{
    public class Producto
    {
        public int IdProducto { get; set; }
        public String Nombre { get; set; }
        public int Stock { get; set; }
        public int Precio { get; set; }
        public String Categoria { get; set; }
        public Proveedor Proveedor { get; set; }

        public Producto()
        {
            IdProducto = 0;
            Nombre = string.Empty;
            Stock = 0;
            Precio = 0;
            Categoria = string.Empty;
            Proveedor = null;
        }
    }
}
