using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using Negocio;
using AccesoDatos;

namespace Vista.paginas
{
    public partial class CrearCuenta : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                CargarDDL();
            }
        }



        protected void ddlRegiones_SelectedIndexChanged(object sender, EventArgs e)
        {
            switch (ddlRegiones.SelectedIndex)
            {
                case 0: // Metropolitana
                    ddlComunas.DataSource = Enum.GetValues(typeof(Negocio.Enumeradores.ComunasMetropolitana));
                    ddlComunas.DataBind();
                    break;
                case 1: // Tarapaca
                    ddlComunas.DataSource = Enum.GetValues(typeof(Negocio.Enumeradores.ComunasTarapaca));
                    ddlComunas.DataBind();
                    break;
                case 2: // Antofagasta
                    ddlComunas.DataSource = Enum.GetValues(typeof(Negocio.Enumeradores.ComunasAntofagasta));
                    ddlComunas.DataBind();
                    break;
                case 3: // Atacama
                    ddlComunas.DataSource = Enum.GetValues(typeof(Negocio.Enumeradores.ComunasAtacama));
                    ddlComunas.DataBind();
                    break;
                case 4: //Coquimbo
                    ddlComunas.DataSource = Enum.GetValues(typeof(Negocio.Enumeradores.ComunasCoquimbo));
                    ddlComunas.DataBind();
                    break;
                case 5: // Valparaiso
                    ddlComunas.DataSource = Enum.GetValues(typeof(Negocio.Enumeradores.ComunasValparaiso));
                    ddlComunas.DataBind();
                    break;
                case 6: // O'higgins
                    ddlComunas.DataSource = Enum.GetValues(typeof(Negocio.Enumeradores.ComunasOhiggins));
                    ddlComunas.DataBind();
                    break;
                case 7: // Maule
                    ddlComunas.DataSource = Enum.GetValues(typeof(Negocio.Enumeradores.ComunasMaule));
                    ddlComunas.DataBind();
                    break;
                case 8: // Bio-Bio
                    ddlComunas.DataSource = Enum.GetValues(typeof(Negocio.Enumeradores.ComunasBioBio));
                    ddlComunas.DataBind();
                    break;
                case 9: // Araucania
                    ddlComunas.DataSource = Enum.GetValues(typeof(Negocio.Enumeradores.ComunasAraucania));
                    ddlComunas.DataBind();
                    break;
                case 10: // Los Lagos
                    ddlComunas.DataSource = Enum.GetValues(typeof(Negocio.Enumeradores.ComunasLosLagos));
                    ddlComunas.DataBind();
                    break;
                case 11: // Aysen
                    ddlComunas.DataSource = Enum.GetValues(typeof(Negocio.Enumeradores.ComunasAysen));
                    ddlComunas.DataBind();
                    break;
                case 12: // Magallanes
                    ddlComunas.DataSource = Enum.GetValues(typeof(Negocio.Enumeradores.ComunasMagallanes));
                    ddlComunas.DataBind();
                    break;
                case 13: //Los Rios
                    ddlComunas.DataSource = Enum.GetValues(typeof(Negocio.Enumeradores.ComunasLosRios));
                    ddlComunas.DataBind();
                    break;
                case 14: // Arica
                    ddlComunas.DataSource = Enum.GetValues(typeof(Negocio.Enumeradores.ComunasArica));
                    ddlComunas.DataBind();
                    break;
            }
        }

        protected void btnRegistrar_Click(object sender, EventArgs e)
        {
            if (String.IsNullOrWhiteSpace(txtRut.Text))
                ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('Ingresa el rut')", true);
            else
            {
                if (String.IsNullOrWhiteSpace(txtNombres.Text))
                    ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('Ingresa el nombre')", true);
                else
                {
                    if (String.IsNullOrWhiteSpace(txtApellidoPaterno.Text) || String.IsNullOrWhiteSpace(txtApellidoMaterno.Text))
                        ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('Ingresa los dos apellidos')", true);
                    else
                    {
                        if (String.IsNullOrWhiteSpace(txtCorreo.Text))
                            ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('Ingresa el correo')", true);
                        else
                        {
                            if (txtContraseña1.Text != txtContraseña2.Text || String.IsNullOrWhiteSpace(txtContraseña1.Text) || String.IsNullOrWhiteSpace(txtContraseña2.Text))
                                ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('Las contraseñas no coinciden')", true);
                            else
                            {
                                if (AccesoCliente.ValidarCorreo(txtCorreo.Text))
                                    ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('Ya existe un cliente con el correo ingresado')", true);
                                else
                                {
                                    if (AccesoCliente.BuscarClientePorRut(txtRut.Text) != null)
                                        ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('Ya existe un cliente con el rut ingresado')", true);
                                    else
                                    {
                                        Usuario nuevoUsuario = new Usuario();
                                        nuevoUsuario.Contraseña = txtContraseña1.Text;

                                        Cliente nuevoCLiente = new Cliente();
                                        nuevoCLiente.Rut = txtRut.Text;
                                        nuevoCLiente.Nombres = txtNombres.Text;
                                        nuevoCLiente.ApellidoMaterno = txtApellidoMaterno.Text;
                                        nuevoCLiente.ApellidoPaterno = txtApellidoPaterno.Text;
                                        switch (ddlGenero.SelectedIndex)
                                        {
                                            case 0:
                                                nuevoCLiente.Genero = 'M';
                                                break;
                                            case 1:
                                                nuevoCLiente.Genero = 'F';
                                                break;
                                        }
                                        nuevoCLiente.Region = ddlRegiones.SelectedValue;
                                        nuevoCLiente.Comuna = ddlComunas.SelectedValue;
                                        nuevoCLiente.Provincia = ddlComunas.SelectedValue;
                                        nuevoCLiente.CorreoElectronico = txtCorreo.Text;
                                        nuevoCLiente.TotalGastado = 0;
                                        AccesoUsuario.AgregarUsuario(nuevoUsuario);
                                        AccesoCliente.AgregarCliente(nuevoCLiente);
                                        ScriptManager.RegisterStartupScript(this, GetType(), "", "alert('AGREGADO!!!')", true);
                                        LimpiarPantalla();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        private void CargarDDL()
        {
            ddlRegiones.DataSource = Enum.GetValues(typeof(Negocio.Enumeradores.Regiones));
            ddlRegiones.DataBind();
            ddlComunas.DataSource = Enum.GetValues(typeof(Negocio.Enumeradores.ComunasMetropolitana));
            ddlComunas.DataBind();
            ddlGenero.SelectedIndex = 0;
            ddlGenero.DataBind();
        }

        private void LimpiarPantalla()
        {
            txtRut.Text = string.Empty;
            txtNombres.Text = string.Empty;
            txtApellidoMaterno.Text = string.Empty;
            txtApellidoPaterno.Text = string.Empty;
            txtContraseña1.Text = string.Empty;
            txtContraseña2.Text = string.Empty;
            CargarDDL();
            txtCorreo.Text = string.Empty;
        }
    }
}