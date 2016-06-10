using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Negocio;

namespace AccesoDatos
{
    public class AccesoCliente
    {
        public static Cliente BuscarClientePorRut(String parRut)
        {
            Cliente cliente = new Cliente();
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = bd.CLIENTE.Where(s => s.RUT_CL == parRut).Single();
                    if (query != null)
                    {
                        cliente.Rut = query.RUT_CL;
                        cliente.Nombres = query.NOMBRE_CL;
                        cliente.ApellidoPaterno = query.APE_PATERNO_CL;
                        cliente.ApellidoMaterno = query.APE_MATERNO_CL;
                        cliente.Genero = Convert.ToChar(query.GENERO_CL);
                        cliente.Region = query.REGION_CL;
                        cliente.Provincia = query.PROVINCIA_CL;
                        cliente.Comuna = query.COMUNA_CL;
                        cliente.TotalGastado = Convert.ToInt32(query.TOTAL_GASTADO);
                        cliente.CorreoElectronico = query.CORREO_ELECTRONICO;
                        cliente.Usuario = AccesoUsuario.BuscarUsuarioClPorRut(parRut);
                    }
                }
                return cliente;
            }
            catch (Exception)
            {
                return null;
            }
        }

        public static Boolean ValidarCorreo(String parCorreo)
        {
            Boolean blnSalida = false;
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = bd.CLIENTE.Where(s => s.CORREO_ELECTRONICO == parCorreo).Single();
                    if (query != null)
                    {
                        blnSalida = true;
                    }
                }
                return blnSalida;
            }
            catch (Exception)
            {
                return blnSalida;
            }
        }

        public static Boolean AgregarCliente(Cliente parCliente)
        {
            Boolean blnSalida = false;
            try
            {
                using (Entities bd = new Entities())
                {
                    CLIENTE cliente = new CLIENTE();
                    cliente.RUT_CL = parCliente.Rut;
                    cliente.NOMBRE_CL = parCliente.Nombres;
                    cliente.APE_PATERNO_CL = parCliente.ApellidoPaterno;
                    cliente.APE_MATERNO_CL = parCliente.ApellidoMaterno;
                    cliente.GENERO_CL = parCliente.Genero.ToString();
                    cliente.REGION_CL = parCliente.Region;
                    cliente.PROVINCIA_CL = parCliente.Provincia;
                    cliente.COMUNA_CL = parCliente.Comuna;
                    cliente.CORREO_ELECTRONICO = parCliente.CorreoElectronico;
                    cliente.TOTAL_GASTADO = parCliente.TotalGastado;
                    cliente.USUARIO_ID_USUARIO = AccesoUsuario.ObtenerUltimoId();
                    bd.AddToCLIENTE(cliente);
                    bd.SaveChanges();
                    blnSalida = true;
                }
                return blnSalida;
            }
            catch (Exception)
            {
                return blnSalida;
            }
        }
    }
}
