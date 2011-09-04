<%-- 
    Document   : AdministracionIngresos
    Created on : 17/08/2011, 01:01:14 AM
    Author     : jleon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrador de Ingresos</title>
        <link href="css/AdministracionIngresos.css" type="text/css" rel="stylesheet"></link>
    </head>
    <body>
        <div id="wrapper">
            <h1>ADMINISTRACIÓN DE EGRESOS</h1>
            <div id="div_izquierda">
                <label for="GestionDeFacturas"><a href="ingresosFacturados.jsp">Ingresos facturados</a></label>
            </div>
            <div id="div_centro">
                <label for="ResumenDeFacturas"><a href="ingresosRelacionDependencia.jsp">Ingresos por contrato</a></label>
            </div>
            <div id="div_derecha">
                <label for="ResumenDeFacturas">Resumen de ingresos</label>
                <ul id="GestionDeFacturas">
                    <li id="PorMes"><a href="EnConstruccion.jsp">Por mes</a></li>
                    <li id="Poranio"><a href="EnConstruccion.jsp">Por año</a></li>
                </ul>
            </div>
        </div>
    </body>
</html>
