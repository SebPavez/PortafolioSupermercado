using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Negocio
{
    public class Terminal
    {
        public int IdTerminal { get; set; }
        public DateTime FechaAdquisicion { get; set; }
        public DateTime FechaUltimaMantencion { get; set; }

        public Terminal()
        {
            IdTerminal = 0;
            FechaAdquisicion = new DateTime();
            FechaUltimaMantencion = new DateTime();
        }
    }
}
