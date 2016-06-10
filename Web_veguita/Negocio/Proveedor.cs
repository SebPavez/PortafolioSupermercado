using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Negocio
{
    public class Proveedor
    {
        public int IdProveedor { get; set; }
        public String Nombre { get; set; }
        public String Direccion { get; set; }
        public int Telefono { get; set; }

        public Proveedor()
        {
            IdProveedor = 0;
            Nombre = string.Empty;
            Direccion = string.Empty;
            Telefono = 0;
        }
    }
}
