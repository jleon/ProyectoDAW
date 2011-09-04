<%-- 
    Document   : systemConfigMenu
    Created on : 14/08/2011, 08:25:49 PM
    Author     : Gustavo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" 
    "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es" lang="es">
    <head>
        <meta http-equiv="Content-Type" xml:lang="es" content="text/html; charset=utf-8" />
        <meta name="description" xml:lang="es" content="Configuración del Sistema: Fácil declarador de impuestos"/>
        <meta name="keywords" xml:lang="es" content="FDI, Configuración, Sistema" />
        <meta name="tittle" content="Configuración del Sistema" />
        <meta name="author" content="Ericka Castro, Juan León Mera, Pedro Lucas, Gustavo Totoy C." />
        <title>Configuración del Sistema</title>
        
        <link rel="stylesheet" type="text/css" href="css/layouts.css" />
        <link rel="stylesheet" type="text/css" href="css/systemConfigMenu.css" />
    </head>
    <body>
        <div id="container">
            <div id="tittle">
                <h1>Configuración del Sistema</h1>
            </div>   
            <div id="content-container">
                <c:if test="${administrator != null}">
                    <div id="administrator">
                        <h2>Administrador: ${administrator}</h2>
                    </div>
                    <div id="menu">
                        <a href="${pageContext.servletContext.contextPath}/IvaConfig.do?action=show"><input type="button" value="IVA" /></a>
                        <a href="incomeTaxConfig.jsp"><input type="button" value="Impuesto a la Renta" /></a>
                        <a href="finesInterestsConfig.jsp"><input type="button" value="Multas e Intereses" /></a>
                    </div>
                </c:if>
                <c:if test="${administrator == null}">
                    <div id="no-login">
                        <h2>No hay una sesión activa</h2>
                    </div>
                </c:if>
            </div>
        </div>
    </body>
</html>
