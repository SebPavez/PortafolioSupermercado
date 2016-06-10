using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Negocio
{
    public class Persona
    {
        public String Rut { get; set; }
        public String Nombres { get; set; }
        public String ApellidoPaterno { get; set; }
        public String ApellidoMaterno { get; set; }
        public char Genero { get; set; }
        public String Region { get; set; }
        public String Provincia { get; set; }
        public String Comuna { get; set; }
        public Usuario Usuario { get; set; }

        public Persona()
        {
            Rut = string.Empty;
            Nombres = string.Empty;
            ApellidoPaterno = string.Empty;
            ApellidoMaterno = string.Empty;
            Genero = ' ';
            Region = string.Empty;
            Provincia = string.Empty;
            Comuna = string.Empty;
            Usuario = null;
        }

        public Persona(String parRut, String parNombres, String parApePaterno, String parApeMaterno, char parGenero, String parRegion, String parProvincia,String parComuna , Usuario parUsuario)
        {
            Rut = parRut;
            Nombres = parNombres;
            ApellidoPaterno = parApePaterno;
            ApellidoMaterno = parApeMaterno;
            Genero = parGenero;
            Region = parRegion;
            Provincia = parProvincia;
            Comuna = parComuna;
            Usuario = parUsuario;
        }
    }
}
