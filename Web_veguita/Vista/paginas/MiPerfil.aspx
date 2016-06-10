<%@ Page Title="" Language="C#" MasterPageFile="~/paginas/MaestraClientes.Master"
    AutoEventWireup="true" CodeBehind="MiPerfil.aspx.cs" Inherits="Vista.paginas.MiPerfil" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <div id="profile" class="tab-pane">
        <section class="panel">
            <div class="panel-body bio-graph-info">
                 <h1>Información Personal</h1>
                 <div class="row">
                    <div class="bio-row">
                        <p><span>Nombres </span><asp:TextBox class="form-control" ID="txtNombre" 
                                runat="server" ReadOnly="True"></asp:TextBox></p>
                    </div>
                    <div class="bio-row">
                        <p><span>Apellidos </span><asp:TextBox class="form-control" ID="txtApellidos" 
                        runat="server" ReadOnly="True"></asp:TextBox></p>
                    </div>                   
                    <div class="bio-row">
                        <p><span>Genero </span><asp:TextBox class="form-control" ID="txtGenero" 
                        runat="server" ReadOnly="True"></asp:TextBox></p>
                    </div>
                    <div class="bio-row">
                        <p><span>Región </span><asp:TextBox class="form-control" ID="txtRegion" 
                        runat="server" ReadOnly="True"></asp:TextBox></p>
                    </div>
                    <div class="bio-row">
                        <p><span>Comuna </span><asp:TextBox class="form-control" ID="txtComuna" 
                        runat="server" ReadOnly="True"></asp:TextBox></p>
                    </div>
                    <div class="bio-row">
                        <p><span>Correo </span><asp:TextBox class="form-control" ID="txtCorreo" 
                        runat="server" ReadOnly="True"></asp:TextBox></p>
                    </div>
                </div>
            </div>
        </section>
    </div>
</asp:Content>
