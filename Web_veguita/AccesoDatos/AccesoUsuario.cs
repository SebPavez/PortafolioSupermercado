using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Negocio;

namespace AccesoDatos
{
    public class AccesoUsuario
    {
        public static bool ValidarFuncionario(String parUsuario, String parContraseña)
        {
            bool blnSalida = false;
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = bd.FUNCIONARIO.Where(s => s.RUT_FUN == parUsuario).ToList();
                    foreach (var item in query)
                    {
                        if (item.USUARIO.CONTRASEÑA.Equals(parContraseña))
                        {
                            blnSalida = true;
                        }
                    }
                }
                return blnSalida;
            }
            catch (Exception)
            {
                return false;
            }
        }

        public static bool ValidarCliente(String parUsuario, String parContraseña)
        {
            bool blnSalida = false;
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = bd.CLIENTE.Where(s => s.RUT_CL == parUsuario).ToList();
                    foreach (var item in query)
                    {
                        if (item.USUARIO.CONTRASEÑA.Equals(parContraseña))
                        {
                            blnSalida = true;
                        }
                    }
                }
                return blnSalida;
            }
            catch (Exception)
            {
                return false;
            }
        }

        public static Usuario BuscarUsuarioFunPorRut(string parRut)
        {
            Usuario salida = null;
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = bd.FUNCIONARIO.Where(s => s.RUT_FUN == parRut).ToList();
                    foreach (var item in query)
                    {
                        salida.IdUsuario = Convert.ToInt32(item.USUARIO_ID_USUARIO);
                        salida.Contraseña = item.USUARIO.CONTRASEÑA;
                    }
                }
                return salida;
            }
            catch (Exception)
            {
                return null;
            }
        }

        public static Usuario BuscarUsuarioClPorRut(string parRut)
        {
            Usuario salida = null;
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = bd.CLIENTE.Where(s => s.RUT_CL == parRut).Single();
                    if (query != null)
                    {
                        salida.IdUsuario = Convert.ToInt32(query.USUARIO.ID_USUARIO);
                        salida.Contraseña = query.USUARIO.CONTRASEÑA;
                    }
                }
                return salida;
            }
            catch (Exception)
            {
                return null;
            }
        }

        public static Boolean AgregarUsuario(Usuario parUsuario)
        {
            Boolean blnSalida = false;
            try
            {
                using (Entities bd = new Entities())
                {
                    USUARIO usuario = new USUARIO();
                    usuario.CONTRASEÑA = parUsuario.Contraseña;
                    usuario.ID_USUARIO = ObtenerUltimoId() + 1;
                    bd.AddToUSUARIO(usuario);
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

        public static int ObtenerUltimoId()
        {
            int intSalida = 0;
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = (from item in bd.USUARIO
                                 select item.ID_USUARIO).Max();
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
