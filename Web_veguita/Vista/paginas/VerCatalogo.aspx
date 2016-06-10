<%@ Page Title="" Language="C#" MasterPageFile="~/paginas/MaestraClientes.Master"
    AutoEventWireup="true" CodeBehind="VerCatalogo.aspx.cs" Inherits="Vista.paginas.VerCatalogo" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <p>
        <h3 class="text-center">
            Revisar Productos Disponible</h3>
    </p>
    <h4>
        Recuerda que al presionar seleccionar agregaras el producto a tu carrito de compras</h4>
    <p>
        <h4>
            Filtrar por&nbsp;&nbsp;&nbsp;
            <asp:DropDownList ID="ddlFiltrar" runat="server" Height="25px" Width="125px" AutoPostBack="True"
                OnSelectedIndexChanged="ddlFiltrar_SelectedIndexChanged">
                <asp:ListItem>Todos</asp:ListItem>
                <asp:ListItem>Categoria</asp:ListItem>
                <asp:ListItem>Proveedor</asp:ListItem>
            </asp:DropDownList>
        </h4>
        <br />
        <div>
            <asp:Panel ID="pnlFiltro" runat="server" Visible="False">
                Ingrese el filtro para poder buscar
                <asp:TextBox ID="txtBuscar" runat="server" ValidationGroup="GrupoBuscar" 
                    ontextchanged="txtBuscar_TextChanged"></asp:TextBox>
                &nbsp;
                <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" ControlToValidate="txtBuscar"
                    ErrorMessage="Campo obligatorio" Font-Bold="True" ForeColor="Red" ValidationGroup="GrupoBuscar"></asp:RequiredFieldValidator>
                <br />
                <br />
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;
                <asp:Button ID="btnBuscar" runat="server" Text="Buscar" 
                    ValidationGroup="GrupoBuscar" onclick="btnBuscar_Click" />
                <br />
            </asp:Panel>
        </div>
        <p>
            <asp:GridView ID="gdvProductos" runat="server" AutoGenerateSelectButton="True" OnSelectedIndexChanged="gdvProductos_SelectedIndexChanged">
            </asp:GridView>
        </p>
    <asp:Panel ID="pnlCantidad" runat="server">
        Ingresa la cantidad que deseas para el producto
        <asp:Label ID="lblProductoSeleccionado" runat="server"></asp:Label>
        &nbsp;
        <asp:TextBox ID="txtCantidad" runat="server" ValidationGroup="grupoCantidad"></asp:TextBox>
        &nbsp;<asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ControlToValidate="txtCantidad"
            ErrorMessage="Campo obligatorio" Font-Bold="True" ForeColor="Red" ValidationGroup="grupoCantidad"></asp:RequiredFieldValidator>
        <br />
        <br />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:Button class="btn-primary" ID="btnAgregarPedido" runat="server" Text="Agregar al Carrito"
            OnClick="btnAgregarPedido_Click" ValidationGroup="grupoCantidad" />
        <br />
    </asp:Panel>
    <p>
    </p>
    <asp:Panel ID="pnlCarritoDeCompras" runat="server" Visible="False">
        -- Productos Seleccionados --
        <br />
        <asp:GridView ID="gdvProductosSeleccionados" runat="server" OnDataBound="gdvProductosSeleccionados_DataBound"
            OnRowDeleting="gdvProductosSeleccionados_RowDeleting">
        </asp:GridView>
        <br />
        <p>
            Total A Pagar $&nbsp;
            <asp:TextBox class="btn-send" ID="txtTotalPago" runat="server" ReadOnly="True"></asp:TextBox>
            &nbsp;
            <asp:Button class="btn-send" ID="btnIrMenuCompras" runat="server" Text="Ir a menu de compras"
                OnClick="btnIrMenuCompras_Click" />
        </p>
    </asp:Panel>
    &nbsp;
</asp:Content>
