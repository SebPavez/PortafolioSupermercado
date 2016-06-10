using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Negocio;

namespace AccesoDatos
{
    public class AccesoProveedor
    {
        public static Proveedor BuscarProveedorPorId(int parId)
        {
            Proveedor provee = new Proveedor();
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = bd.PROVEEDOR.Where(s => s.ID_PROVEEDOR == parId).Single();
                    if (query != null)
                    {
                        provee.IdProveedor = Convert.ToInt32(query.ID_PROVEEDOR);
                        provee.Nombre = query.NOMBRE_PROVEEDOR;
                        provee.Direccion = query.DIRECCION;
                        provee.Telefono = Convert.ToInt32(query.TELEFONO_PROVEEDOR);
                    }
                }
                return provee;
            }
            catch (Exception)
            {
                return null;
            }
        }
    }
}
