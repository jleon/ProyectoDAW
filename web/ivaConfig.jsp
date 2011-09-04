<%-- 
    Document   : ivaConfig
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
        <meta name="description" xml:lang="es" content="Configuración del Sistema: Fácil declarador de impuestos, parte IVA"/>
        <meta name="keywords" xml:lang="es" content="FDI, Configuración, Sistema, IVA" />
        <meta name="tittle" content="IVA, Configuración del Sistema" />
        <meta name="author" content="Ericka Castro, Juan León Mera, Pedro Lucas, Gustavo Totoy C." />
        <title>IVA, Configuración del Sistema</title>
        
        <link rel="stylesheet" type="text/css" href="css/layouts.css" />
        <link rel="stylesheet" type="text/css" href="css/ivaConfig.css" />
        
        <script type="text/javascript">
            function saveSubmit(){
                var form= document.getElementById("form-iva-config");
                form.setAttribute("action", form.getAttribute("action")+"?action=save");
                var submit= document.getElementById("submit-form-iva-config");
                submit.click();
            }
            
            function searchSubmit(){
                var form= document.getElementById("form-iva-config");
                form.setAttribute("action", form.getAttribute("action")+"?action=search");
                var submit= document.getElementById("submit-form-iva-config");
                submit.click();
            }
        </script>
    </head>
    <body>
        <div id="container">
            <div id="tittle">
                <h1>IVA</h1>
            </div>   
            <div id="content-container">
                <div id="description">
                    <h2>Plazos de declaración de impuestos</h2>
                </div>
                <div id="iva-config">
                    <form id="form-iva-config" method="post" action="${pageContext.servletContext.contextPath}/IvaConfig.do">
                        <fieldset>
                            <legend>Fecha de publicación:</legend>
                            <br />
                            <label for="day">Día: </label>
                            <input type="text" id="day" name="day" />
                            <label for="month">Mes: </label>
                            <select id="month" name="month">
                                <option value="Enero" selected="selected">Enero</option>
                                <option value="Febrero">Febrero</option>
                                <option value="Marzo">Marzo</option>
                                <option value="Abril">Abril</option>
                                <option value="Mayo">Mayo</option>
                                <option value="Junio">Junio</option>
                                <option value="Julio">Julio</option>
                                <option value="Agosto">Agosto</option>
                                <option value="Septiembre">Septiembre</option>
                                <option value="Octubre">Octubre</option>
                                <option value="Noviembre">Noviembre</option>
                                <option value="Diciembre">Diciembre</option>
                            </select>
                            <label for="year">Año: </label>
                            <input type="text" id="year" name="year" />
                            <input type="button" value="Buscar" onclick="searchSubmit();" />
                            <br />
                        </fieldset>
                        <br />
                        ${searchError}
                        <br />
                        <div id="iva-table">
                            <table border="1" cellpadding="5">
                                <tr>
                                  <th rowspan="2">Noveno dígito del RUC</th>
                                  <th rowspan="2">Mensual</th>
                                  <th colspan="2">Semestral</th>
                                </tr>
                                <tr>
                                    <th>Primer Semestre</th>
                                    <th>Segundo Semestre</th>
                                </tr>
                                <c:forEach var="counter" begin="1" end="9" step="1">
                                    <c:forEach var="pi" items="${listaPlazosIva}">
                                        <c:if test="${pi.novenoDigitoRuc == counter}">
                                            <tr>
                                              <td><input type="text" name="noveno-dig-${counter}" value="${counter}" /></td>
                                              <td><input type="text" name="mensual-${counter}" value="${pi.mensual}" /> del siguiente mes</td>
                                              <td><input type="text" name="semestre1-${counter}" value="${pi.semestre1}" /> de Julio</td>
                                              <td><input type="text" name="semestre2-${counter}" value="${pi.semestre2}" /> de Enero</td>
                                            </tr>
                                        </c:if>
                                    </c:forEach>
                                </c:forEach>
                                <c:forEach var="pi" items="${listaPlazosIva}">
                                    <c:if test="${pi.novenoDigitoRuc == 0}">
                                        <tr>
                                          <td><input type="text" name="noveno-dig-0" value="0" /></td>
                                          <td><input type="text" name="mensual-0" value="${pi.mensual}" /> del siguiente mes</td>
                                          <td><input type="text" name="semestre1-0" value="${pi.semestre1}" /> de Julio</td>
                                          <td><input type="text" name="semestre2-0" value="${pi.semestre2}" /> de Enero</td>
                                        </tr>
                                    </c:if>
                                </c:forEach>
                            </table>
                            <br />
                            <br />
                        </div>
                        <div id="option-buttons">
                            <a href="${pageContext.servletContext.contextPath}/IvaConfig.do?action=new"><input type="button" value="Nuevo" /></a>
                            <input type="button" value="Guardar" onclick="saveSubmit();" />
                            <a href="${pageContext.servletContext.contextPath}/IvaConfig.do?action=cancel"><input type="button" value="Cancelar" /></a>
                            <input id="submit-form-iva-config" type="submit"></input>
                            <br />
                            <br />
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>

