using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Negocio
{
    public class Funcionario : Persona
    {
        public int SueldoBase { get; set; }
        public DateTime FechaContrato { get; set; }
        public Terminal Terminal { get; set; }

        public Funcionario()
            : base()
        {
            SueldoBase = 0;
            FechaContrato = new DateTime();
            Terminal = null;
        }

        public Funcionario(int parSueldo, DateTime parFecha, Terminal parTerminal, Usuario parUsuario, String parRut, String parNombres, String parApePaterno, String parApeMaterno, char parGenero, String parRegion, String parProvincia, String parComuna)
            : base(parRut, parNombres, parApePaterno, parApeMaterno, parGenero, parRegion, parProvincia,parComuna,parUsuario)
        {
            SueldoBase = parSueldo;
            FechaContrato = parFecha;
            Terminal = parTerminal;
        }
    }
}
