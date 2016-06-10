<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="InicioSesion.aspx.cs" Inherits="Vista.paginas.InicioSesion" %>

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
					<li id="nav">
						<a href="Home.aspx">Home</a>
					</li>:
					<li>
						<a >Inicio Sesion</a>
					</li>
		</ul>
    </div>
        
    <style>
        #nav 
        {
            display:inline;
            list-style-type:none;
            padding-right:2px;
        }
    </style>
    
    <div id="login">
        <form id="Form1" runat="server">
        <fieldset class="clearfix">
            <p class="style1">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; INICIAR SESION
            </p>
            <p class="style1">
                &nbsp;</p>
            <p>
                <span class="fontawesome-user"></span>
                <asp:TextBox ID="txtRut" placeholder="RUT" runat="server" Height="50px" Width="205px"></asp:TextBox>
                &nbsp;</p>
            <p>
                <span class="fontawesome-lock"></span>
                <asp:TextBox ID="txtContraseña" runat="server" placeholder="CONTRASEÑA" TextMode="Password"
                    Height="49px" Width="206px"></asp:TextBox>
            </p>
            <p>
                <asp:Button ID="btnIngresar" runat="server" Text="Ingresar" Height="51px" 
                    Width="205px" onclick="btnIngresar_Click" />
            </p>
        </fieldset>
        </form>
        <p>
            No tienes una cuenta?
        </p>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="CrearCuenta.aspx" class="style1"><span class="fontawesome-arrow-right"></span>
            Registrate ya</a>
    </div>
    <!-- end login -->
</body>
</html>
