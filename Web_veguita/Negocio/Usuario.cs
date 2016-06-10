using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Negocio
{
    public class Usuario
    {
        public int IdUsuario { get; set; }
        public String Contraseña { get; set; }

        public Usuario()
        {
            IdUsuario = 0;
            Contraseña = string.Empty;
        }

        public Usuario(int parId, String parContraseña)
        {
            IdUsuario = parId;
            Contraseña = parContraseña;
        }
    }
}
