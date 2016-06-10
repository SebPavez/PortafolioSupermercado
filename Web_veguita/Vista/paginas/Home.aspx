<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Home.aspx.cs" Inherits="Vista.paginas.Home" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <link rel="icon" type="image/png" href="../img/favicon.ico">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>Supermercado La Veguita</title>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0'
        name='viewport' />
    <meta name="viewport" content="width=device-width" />
    <link href="../componentes home/css/bootstrap.css" rel="stylesheet" />
    <link href="../componentes home/css/landing-page.css" rel="stylesheet" />
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
        rel="stylesheet">
</head>
<body class="landing-page">
    <form id="form1" runat="server">
    <div>
        <nav class="navbar navbar-transparent navbar-top" role="navigation">
    <div class="container">

    <div class="navbar-header">
      <button id="menu-toggle" type="button" class="navbar-toggle" data-toggle="collapse" data-target="#example">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar bar1"></span>
        <span class="icon-bar bar2"></span>
        <span class="icon-bar bar3"></span>
      </button>
      <a href="Home.aspx">
                   <div class="logo-container">
                        <div class="brand">
                         LA VEGUITA
                        </div>
                    </div>
              </a>
    </div>

    <div class="collapse navbar-collapse" id="example" >
      <ul class="nav navbar-nav navbar-right">

              <li>
                  <a href="Home.aspx">
                      Home
                  </a>
              </li>
              <li>
                  <a href="InicioSesion.aspx">
                      Iniciar Sesion
                  </a>
              </li>
              <li>
                  <a href="CrearCuenta.aspx">
                      Crear Cuenta
                  </a>
              </li>

            
       </ul>
    </div>
  </div>
</nav>
        <div class="parallax filter-gradient blue" data-color="blue">
            <div class="parallax-background">
                <img src="../componentes home/img/landing-page-1/bg.jpg">
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-sm-5 hidden-xs">
                        <div class="parallax-image">
                            <img src="../componentes home/img/landing-page-1/iphone.png" />
                        </div>
                    </div>
                    <div class="col-sm-6 col-xs-offset-1">
                        <div class="description">
                            <h2>
                                Bienvenido a 'La Veguita'</h2>
                            <br>
                            <h5>
                                En esta página podrás ver todos los productos disponibles en nuestro supermercado
                                para realizar compras de los productos que tenemos a disposición.

                                </h5>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="section section-presentation">
            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        <div class="description">
                            <h4 class="header-text">
                                La Veguita</h4>
                            <p>
                                La cadena de supermercados 'La Veguita' es una empresa dedicada y entregada a sus clientes,
                                en nuestras sucursales podrás encontrar todo tipo de productos, por ejemplo aparatos electrónicos,
                                frutas, verduras, carnes, lácteos, etc.

                                Para facilitar las compras de nuestros clientes, decidimos implementar una pagina web
                                que permita la compra de productos del supermercado. Pero esta no es la única forma de comprar
                                ya que también se podrá en todas las sucursales de 'La Veguita'.

                            </p>
                            <p>
                                No olvides preferir nuestro supermercado para que podamos seguir creciendo y tu obtengas los mejores
                                productos en relación a calidad/precio.
                            <p>
                        </div>
                    </div>
                    <div class="col-md-5 col-md-offset-1 hidden-xs">
                        <img src="../componentes home/img/landing-page-1/supermarket.jpg" />
                    </div>
                </div>
            </div>
        </div>
        <div class="section section-demo">
            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        <div id="description-carousel" class="carousel fade" data-ride="carousel">
                            <div class="carousel-inner">
                                <div class="item">
                                    <img src="../componentes home/img/productos/producto_3.png" />
                                </div>
                                <div class="item active">
                                    <img src="../componentes home/img/productos/producto_1.png" />
                                </div>
                                <div class="item">
                                    <img src="../componentes home/img/productos/producto_2.png" />
                                </div>
                            </div>
                            <ol class="carousel-indicators carousel-indicators-blue">
                                <li data-target="#description-carousel" data-slide-to="0" class=""></li>
                                <li data-target="#description-carousel" data-slide-to="1" class="active"></li>
                                <li data-target="#description-carousel" data-slide-to="2" class=""></li>
                            </ol>
                        </div>
                    </div>
                    <div class="col-md-5 col-md-offset-1">
                        <h4 class="header-text">
                            Calidad en nuestros productos</h4>
                        <p>
                            Como nuestra mayor preocupación son nuestro clientes, siempre estamos atentos al mercado 
                            para que nuestro supermercado tenga los mejores productos por un precio accesible para todos
                            los clientes.
                        </p>
                    </div>
                </div>
            </div>
        </div>
        <div class="section section-features section-no-padding">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-4 grayblock2">
                        <div class="card card-blue">
                            <div class="icon">
                                <i class="fa fa-usd"></i>
                            </div>
                            <div class="text">
                                <h4>
                                    Los mejores precios del mercado</h4>
                                <p>
                                    Nos preocupamos constantemente de conseguir los productos de mejor calidad pero esto no significa
                                    que nuestro cliente tendrá que pagar demasiado dinero.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 grayblock">
                        <div class="card card-blue">
                            <div class="icon">
                                <i class="fa fa-thumbs-o-up "></i>
                            </div>
                            <h4>
                                Buen trato al cliente</h4>
                            <p>
                                El principal objetivo que tenemos es que nuestros clientes vuelvan y para alcanzar esto debemos
                                tener un excelente trato con ellos.</p>
                        </div>
                    </div>
                    <div class="col-md-4 grayblock2">
                        <div class="card card-blue">
                            <div class="icon">
                                <i class="fa fa-bicycle"></i>
                            </div>
                            <h4>
                                Estacionamientos para bicicletas</h4>
                            <p>
                                Sabemos que no todos nuestros clientes cuentan con un vehiculo, por lo tanto decidimos integrar un
                                estacionamiento de bicicletas totalmente gratuito para nuestros clientes.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="section section-no-padding">
            <div class="full-background filter-gradient blue" style="background-image: url('../img/landing-page-1/bg1.jpg');">
                <div class="container">
                    <div class="info">
                        <h1>
                            Comienza ya!</h1>
                        <p>
                            Que estas esperando para ingresar a nuestro portal?.
                            Si no tienes una cuenta presiona el boton 'Registrarme'.</p>
                        <p>
                            <asp:Button ID="btnIniciarSesion" runat="server" Text="Iniciar Sesion" 
                                class="btn btn-neutral btn-lg" onclick="btnIniciarSesion_Click"/>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <asp:Button ID="btnRegistrarme" runat="server" Text="Registrarme" 
                                class="btn btn-neutral btn-lg" onclick="btnRegistrarme_Click"/></p>
                    </div>
                </div>
            </div>
        </div>
        <footer class="footer">
            <div class="container">
                <nav class="pull-left copyright">
                    &copy; Benjamín Meneses  <i class="fa fa-circle"></i>  Sebastián Pavez
                </nav>
                <div class="social-area pull-right">
                        <a href="https://plus.google.com/u/0/100741123569105474941" class="btn btn-social btn-simple"><i class="fa fa-google-plus fa-fw"></i> <span class="network-name"></span></a>
                </div>
            </div>
            
            <div class="fixed-plugin">
    <div class="dropdown close">
     <a href="#" data-toggle="dropdown" aria-expanded="false"> 
        <i class="fa fa-cog fa-2x"> </i>
      </a>
      <ul class="dropdown-menu">
        <h6 class="text-center">Elige un estilo</h6>
            <li>
                <a href="javascript:void(0)" class="selector" data-color="gray" data-button="default">
                    <div style="border-radius:50%; background: #777; width:50px; height: 50px; margin: 5px auto;;"></div>
                </a>
            </li>
            <li class="active">
                <a href="javascript:void(0)" class="selector" data-color="blue" data-button="info">
                    <div style="border-radius:50%; background: #2ca8ff; width:50px; height: 50px;margin: 5px  auto;"></div>
                 </a>
            </li>
            <li>
                <a href="javascript:void(0)" class="selector" data-color="green" data-button="success">
                    <div style="border-radius:50%; background: #3ABE41; width:50px; height: 50px;margin: 5px  auto;"></div>
                </a>
            </li>
             <li>
                <a href="javascript:void(0)" class="selector" data-color="orange" data-button="warning">
                    <div style="border-radius:50%; background: #FFA17F; width:50px; height: 50px;margin: 5px  auto;"></div>
                </a>
            </li>
              <li>
                <a href="javascript:void(0)" class="selector" data-color="red" data-button="danger">
                    <div style="border-radius:50%; background: #cc0000; width:50px; height: 50px;margin: 5px  auto;"></div>
                </a>
            </li>
      </ul>
    </div>
 </div>

        </footer>
</body>
<script src="../componentes home/js/jquery-1.10.2.js" type="text/javascript"></script>
<script src="../componentes home/js/jquery-ui-1.10.4.custom.min.js" type="text/javascript"></script>
<script src="../componentes home/js/bootstrap.js" type="text/javascript"></script>
<script type="text/javascript">
    var big_image;
    $().ready(function () {

        responsive = $(window).width();

        if (responsive >= 768) {
            big_image = $('.parallax-background').find('img');
            console.log(big_image);
            $(window).on('scroll', function () {
                parallax();
            });
        }

        $('.selector').click(function () {
            SelectColor(this);
        });
    });

    function SelectColor(btn) {
        oldColor = $('.filter-gradient').attr('data-color');
        newColor = $(btn).attr('data-color');

        oldButton = $('#Demo').attr('data-button');
        newButton = $(btn).attr('data-button');

        $('.filter-gradient').removeClass(oldColor).addClass(newColor).attr('data-color', newColor);

        $('#Demo').removeClass("btn-" + oldButton).addClass("btn-" + newButton).attr('data-button', newButton);

        $('.carousel-indicators').removeClass("carousel-indicators-" + oldColor).addClass("carousel-indicators-" + newColor);

        $('.card').removeClass("card-" + oldColor).addClass("card-" + newColor);

        $('.selector').parent().removeClass('active');
        $(btn).parent().addClass('active');
    }

    var parallax = function () {
        var current_scroll = $(this).scrollTop();

        oVal = ($(window).scrollTop() / 3);
        big_image.css('top', oVal);
    };
    </script>
<script src="../componentes home/js/SmoothScroll.js"></script>
<!--
Google Analitics
Demo Purpose Only
Change UA-XXXXXXX-X to be your site's ID
 -->
<script>
    (function (i, s, o, g, r, a, m) {
        i['GoogleAnalyticsObject'] = r; i[r] = i[r] || function () {
            (i[r].q = i[r].q || []).push(arguments)
        }, i[r].l = 1 * new Date(); a = s.createElement(o),
            m = s.getElementsByTagName(o)[0]; a.async = 1; a.src = g; m.parentNode.insertBefore(a, m)
    })(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');

    ga('create', 'UA-1057679-2', 'auto');
    ga('send', 'pageview');

</script>
</div> </form> </body>
</html>
