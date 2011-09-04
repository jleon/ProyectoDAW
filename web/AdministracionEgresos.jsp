<%-- 
    Document   : AdministracionEgresos
    Created on : 16/08/2011, 11:33:31 PM
    Author     : jleon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/AdministracionEgresos.css" type="text/css" rel="stylesheet"
              <title>Administrador Egresos</title>
    </head>
    <body>
        <div id="wrapper">
            <h1>ADMINISTRACIÓN DE EGRESOS</h1>
            <div id="div_izquierda">
                <label for="GestionDeFacturas">Gestion de facturas</label>
                <ul id="GestionDeFacturas">
                    <li id="NuevaFactura"><a href="agregarFacturaEgreso.jsp">Nueva Factura</a></li>
                    <li id="ModificarFactura"><a href="agregarFacturaEgreso.jsp">Modificar Factura</a></li>
                    <li id="EliminarFactura"><a href="EnConstruccion.jsp">Eliminar Factura</a></li>
                </ul>
            </div>
            <div id="div_derecha">
                <label for="ResumenDeFacturas">Resumen de facturas</label>
                <ul id="GestionDeFacturas">
                    <li id="PorMes"><a href="EnConstruccion.jsp">Por mes</a></li>
                    <li id="Poranio"><a href="EnConstruccion.jsp">Por año</a></li>
                </ul>
            </div>
        </div>
    </body>
</html>
