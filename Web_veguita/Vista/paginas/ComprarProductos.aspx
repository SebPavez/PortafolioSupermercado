<%@ Page Title="" Language="C#" MasterPageFile="~/paginas/MaestraClientes.Master" AutoEventWireup="true" CodeBehind="ComprarProductos.aspx.cs" Inherits="Vista.paginas.ComprarProducto" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <p>
        El total a pagar de su compra son $
        <asp:TextBox ID="txtTotalPago" runat="server" ReadOnly="True"></asp:TextBox>
    </p>
    <p>
        &nbsp;</p>
    <p>
        Para confirmar su compra
        <asp:Button class="btn-group-sm" ID="btnConfirmarCompra" runat="server" 
            Text="Presiona Aqui" onclick="btnConfirmarCompra_Click" />
    </p>
</asp:Content>
