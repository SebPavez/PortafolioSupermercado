using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Negocio
{
    public class Cliente : Persona
    {
        public String CorreoElectronico { get; set; }
        public int TotalGastado { get; set; }

        public Cliente()
            : base()
        {
            CorreoElectronico = string.Empty;
            TotalGastado = 0;
        }

        public Cliente(String parCorreo, int parTotalGastado, Usuario parUsuario, String parRut, String parNombres, String parApePaterno, String parApeMaterno, char parGenero, String parRegion, String parProvincia, String parComuna)
            : base(parRut, parNombres, parApePaterno, parApeMaterno, parGenero, parRegion, parProvincia, parComuna,parUsuario)
        {
            CorreoElectronico = parCorreo;
            TotalGastado = parTotalGastado;
        }
    }
}
