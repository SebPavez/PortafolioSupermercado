<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="CrearCuenta.aspx.cs" Inherits="Vista.paginas.CrearCuenta" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8">
    <title>Inicio de Sesion</title>
    <link href="../componentes home/css/EstiloInicioSesion.css" rel="stylesheet" type="text/css" />
    <style type="text/css">
        .style1
        {
            font-size: x-large;
        }
    </style>
</head>
<body>
    <div class="navbar-header">
        <ul class="breadcrumb">
            <li><a href="Home.aspx">Home</a> </li>
            <li><a href="CrearCuenta.aspx">Crear Cuenta</a> </li>
        </ul>
    </div>
    <div id="login">
        <form id="Form1" runat="server">
        <fieldset class="clearfix">
            <p class="style1">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; REGISTRAR CLIENTE
            </p>
            <p class="style1">
                &nbsp;</p>
            <p>
                <!-- rut !-->
                <span class="fontawesome-user"></span>
                <asp:TextBox ID="txtRut" placeholder="RUT" runat="server" Height="50px" Width="205px"></asp:TextBox>
                &nbsp;</p>
            <p>
                <!-- nombres !-->
                <span class="fontawesome-user"></span>
                <asp:TextBox ID="txtNombres" placeholder="NOMBRES" runat="server" Height="50px" Width="205px"></asp:TextBox>
                &nbsp;</p>
            <p>
                <!-- apellido paterno !-->
                <span class="fontawesome-user"></span>
                <asp:TextBox ID="txtApellidoPaterno" placeholder="APELLIDO PATERNO" runat="server"
                    Height="50px" Width="205px"></asp:TextBox>
                &nbsp;</p>
            <p>
                <!-- apellido materno !-->
                <span class="fontawesome-user"></span>
                <asp:TextBox ID="txtApellidoMaterno" placeholder="APELLIDO MATERNO" runat="server"
                    Height="50px" Width="205px"></asp:TextBox>
                &nbsp;</p>
            <p>
                <!-- genero !-->
                <span class="fontawesome-bookmark"></span>
                <asp:DropDownList ID="ddlGenero" runat="server" Height="43px" Width="204px" 
                    AutoPostBack="True">
                    <asp:ListItem>Masculino</asp:ListItem>
                    <asp:ListItem>Femenino</asp:ListItem>
                </asp:DropDownList></p>
            <p>
                <!-- regiones !-->
                &nbsp;</p>
            <p>
                &nbsp;</p>
            <p>
                <!-- comunas !-->
                <span class="fontawesome-user"></span>&nbsp;<asp:DropDownList ID="ddlRegiones" 
                    runat="server" Height="43px" Width="204px" AutoPostBack="True" 
                    onselectedindexchanged="ddlRegiones_SelectedIndexChanged">
                </asp:DropDownList>
                </p>
            <p>
                <!-- correo !-->
            </p>
            <p>
                &nbsp;</p>
            <p>
                <span class="fontawesome-user"></span>
                <asp:DropDownList ID="ddlComunas" runat="server" Height="43px" Width="204px">
                </asp:DropDownList>
                </p>
            <p>
                &nbsp;</p>
            <p>
                &nbsp;</p>
            <p>
                <span class="fontawesome-envelope"></span>
                <asp:TextBox ID="txtCorreo" placeholder="CORREO ELECTRONICO" runat="server" Height="50px"
                    Width="205px"></asp:TextBox>
                &nbsp;</p>
            <p>
                <!-- contraseña !-->
                <span class="fontawesome-lock"></span>
                <asp:TextBox ID="txtContraseña1" runat="server" placeholder="CONTRASEÑA" TextMode="Password"
                    Height="49px" Width="206px"></asp:TextBox>
            </p>
            <p>
                <!-- validar contraseña!-->
                <span class="fontawesome-lock"></span>
                <asp:TextBox ID="txtContraseña2" runat="server" placeholder="REINGRESE CONTRASEÑA"
                    TextMode="Password" Height="49px" Width="206px"></asp:TextBox>
            </p>
            <p>
                <asp:Button ID="btnRegistrar" runat="server" Text="Registrar" Height="51px" 
                    Width="205px" onclick="btnRegistrar_Click" />
            </p>
        </fieldset>
        </form>
        <p>
            Ya tienes una cuenta?
        </p>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="InicioSesion.aspx" class="style1"><span class="fontawesome-arrow-right"></span>
            Ingresa ahora</a>
    </div>
    <!-- end login -->
</body>
</html>
