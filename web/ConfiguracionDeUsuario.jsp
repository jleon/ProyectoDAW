<%-- 
    Document   : ConfiguracionDeUsuario
    Created on : 16/08/2011, 06:41:39 PM
    Author     : jleon
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link href="css/jquery.ui.all.css" type="text/css" rel="stylesheet"></link>
        <script src="js/jquery-1.6.2.js"></script>
        <script src="js/jquery.ui.core.js"></script>
        <script src="js/jquery.ui.widget.js"></script>
        <script src="js/jquery.ui.tabs.js"></script>
        <link href="css/demos.css" type="text/css" rel="stylesheet"></link>
        <link href="css/ConfiguracionUsuario.css" type="text/css" rel="stylesheet"></link>
        <link rel="stylesheet" type="text/css" href="css/layouts.css" />


        <script type="text/javascript">
            $(function() {
                $( "#tabs" ).tabs();
            });
        </script>

    </head>
    <body>
        <div class="demo">
            <jsp:include page="Components/header.jsp" />
            <jsp:include page="Components/generalMenu.jsp" />
            <div id="tabs" class="tabs-bottom">
                <img src="css/images/icono-usuario-registrado.png" alt="Icono-Registro-Usuario" id="icono"></img>
                <ul id="lista-tabs">
                    <li id="borde1" class="elemento-lista-tabs"><a href="#tabs-1">Usuario</a></li>
                    <li class="elemento-lista-tabs"><a href="#tabs-2">Representante Legal</a></li>
                    <li class="elemento-lista-tabs"><a href="#tabs-3">Periodo de pago</a></li>
                    <li id="borde2" class="elemento-lista-tabs"><a href="#tabs-4">Alertas por email</a></li>
                </ul><br/>
                <div id="tabs-1">
                    <div id="contenido-tab1">
                        <h1>Datos del Usuario</h1>
                        <label>Tipo de identificación: </label>
                        <select id="TipoIdentificacion">
                            <option id="cedula">Cédula</option>
                            <option id="ruc">RUC</option>
                        </select><br/>
                        <label># de Identificación: </label>
                        <input id="Identificacion" class="entrada"></input><br/>
                        <label>Razon Social: </label>
                        <input id="RazonSocial" class="entrada"></input><br/>
                        <label>Provincia: </label>
                        <input id="Provincia" class="entrada"></input><br/>
                        <label>Mail: </label>
                        <input id="Mail" class="entrada"></input><br/>
                    </div>
                </div>
                <div id="tabs-2">
                    <div id="contenido-tab2">
                        <h1>Datos del Representante</h1>
                        <label>Tipo de identificación: </label>
                        <select id="TipoIdentificacionRepresentante">
                            <option id="cedulaRepresentante">Cédula</option>
                            <option id="rucRepresentante">RUC</option>
                        </select><br/>
                        <label># de Identificación: </label>
                        <input id="IdentificacionRepresentante"></input><br/>
                    </div>
                </div>
                <div id="tabs-3">
                    <div id="contenido-tab3">
                        <h1>Periodo de pago</h1>
                        <label>Periodo de declaracion del IVA: </label>
                        <select id="PeriodoIVA">
                            <option id="semestral">Semestral</option>
                            <option id="mensual">Mensual</option>
                        </select><br/>
                    </div>
                </div>
                <div id="tabs-4">
                    <div id="contenido-tab4">
                        <h1>Avisos para IVA</h1>
                        <label>Enviar un mail </label><input id="diasIVA"></input><label>dias antes de la fecha de pago</label><br/>
                        <h1>Avisos para IR</h1>
                        <label>Enviar un mail </label><input id="diasIR"></input><label>dias antes de la fecha de pago</label><br/>
                    </div>
                </div>
                 <button id="boton_guardar">GUARDAR</button>
            </div>
           
            <jsp:include page="Components/footer.jsp" />
        </div>


    </body>
</html>
