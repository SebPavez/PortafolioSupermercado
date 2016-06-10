using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Negocio;

namespace AccesoDatos
{
    public class AccesoFuncionario
    {
        public static Funcionario BuscarClientePorRut(String parRut)
        {
            Funcionario fun = new Funcionario();
            try
            {
                using (Entities bd = new Entities())
                {
                    var query = bd.FUNCIONARIO.Where(s => s.RUT_FUN == parRut).Single();
                    if (query != null)
                    {
                        fun.Rut = query.RUT_FUN;
                        fun.Nombres = query.NOMBRE_FUN;
                        fun.ApellidoPaterno = query.APELLIDO_PATERNO_FUN;
                        fun.ApellidoMaterno = query.APELLIDO_MATERNO_FUN;
                        fun.Genero = Convert.ToChar(query.GENERO_FUN);
                        fun.Region = query.REGION_FUN;
                        fun.Provincia = query.PROVINCIA_FUN;
                        fun.Comuna = query.COMUNA_FUN;
                        fun.SueldoBase = Convert.ToInt32(query.SUELDO_BASE_FUN);
                        fun.Terminal = AcessoTerminal.BuscarTerminalPorId(Convert.ToInt32(query.TERMINAL_ID_TERMINAL));
                        fun.FechaContrato = Convert.ToDateTime(query.FECHA_CONTRATO_FUN);
                        fun.Usuario = AccesoUsuario.BuscarUsuarioFunPorRut(parRut);
                    }
                }
                return fun;
            }
            catch (Exception)
            {
                return null;
            }
        }
    }
}
