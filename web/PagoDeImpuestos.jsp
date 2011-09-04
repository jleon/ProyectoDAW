<%-- 
    Document   : PagoDeImpuestos
    Created on : 17/08/2011, 05:34:18 AM
    Author     : jleon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/jquery.ui.all.css" rel="stylesheet" type="text/css"></link>
        <link href="css/demos.css"></link>
        <script src="js/jquery-1.6.2.js"></script>
        <script src="js/jquery.ui.core.js"></script>
        <script src="js/jquery.ui.widget.js"></script>
        <script src="js/jquery.ui.accordion.js"></script>
        <script> 
            $(function() {
                $( "#accordion" ).accordion();
            });
        </script> 
    </head>
    <body>
        <div id="accordion">
            <h3><a href="#">Formulario 104A</a></h3>
            <div>
                <button id="boton_nuevo">Nuevo</button>
                <button id="boton_modificar">Modificar</button>
                <button id="boton_buscar">Buscar</button>
                <button id="boton_eliminar">Eliminar</button>
            </div>
            <h3><a href="#">Formulario 102A</a></h3>
            <div>
                <button id="boton_nuevo">Nuevo</button>
                <button id="boton_modificar">Modificar</button>
                <button id="boton_buscar">Buscar</button>
                <button id="boton_eliminar">Eliminar</button>
            </div>
        </div>
    </body>
</html>
