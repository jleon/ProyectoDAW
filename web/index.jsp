<%-- 
    Document   : index
    Created on : 12/08/2011, 12:06:26 PM
    Author     : Ericka Castro, Juan León Mera, Pedro Lucas, Gustavo Totoy C.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" 
    "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es" lang="es">
    <head>
        <meta http-equiv="Content-Type" xml:lang="es" content="text/html; charset=utf-8" />
        <meta name="description" xml:lang="es" content="Fácil declarador de impuestos"/>
        <meta name="keywords" xml:lang="es" content="FDI, impuestos, fácil, declarar, SRI" />
        <meta name="tittle" content="Login FDI" />
        <meta name="author" content="Ericka Castro, Juan León Mera, Pedro Lucas, Gustavo Totoy C." />
        <title>Login FDI</title>
        
        <link rel="stylesheet" type="text/css" href="css/layouts.css" />
        <link rel="stylesheet" type="text/css" href="css/index.css" />
    </head>
    <body>
        <div id="container">         
            <jsp:include page="Components/header.jsp" />
            <jsp:include page="Components/generalMenu.jsp" />
            <div id="content-container">
                <div id="description">
                    <h2>Descripción</h2>
                    <p>Esta aplicación web tiene como objetivo llegar a cualquier usario permitiéndole: </p>
                    <ul>
                        <li><span>Llevar un control de los ingresos y gastos realizados.</span></li>
                        <li><span>Generar de forma automática los formularios electrónicos (XML) para el pago del impuesto al valor agregado IVA (semestral o mensual) y pago de impuesto a la renta anual, de las personas naturales no obligadas a llevar contabilidad.</span></li>
                        <li><span>Mostrar estadísticas de los gastos realizados dentro de un período de tiempo.</span></li>
                    </ul>
                    <p>El usuario se registrará con identificador único sea este su cédula de identidad o RUC, además de su contraseña respectiva.</p>
                </div>
                <div id="login">
                    <form id="form-login" method="post" action="/FDI_v1.0/Login.do">
                        <fieldset>
                            <legend>Ingrese a la aplicación</legend>
                            <br />
                            <label for="user">Usuario: </label>
                            <input type="text" id="user" name="user" />
                            <br />
                            <br />
                            <label for="password">Contraseña: </label>
                            <input type="password" id="password" name="password" />
                            <br />
                            <br />
                            <input type="submit" value="Ingresar" />
                            <br />
                        </fieldset>
                    </form>
                    <br />
                    <div id="register">
                        <h3>No tiene cuenta, ¿Desea Registrarse?</h3>
                        <input type="button" value="Crear Usuario" />
                    </div>
                    <img src="images/user.png" alt="Imagen que representa a un usuario" />
                </div>
            </div>
            <jsp:include page="Components/footer.jsp" />
        </div>
    </body>
</html>
        