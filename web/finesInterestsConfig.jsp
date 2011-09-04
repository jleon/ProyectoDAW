<%-- 
    Document   : finesInterestsConfig
    Created on : 14/08/2011, 08:25:49 PM
    Author     : Gustavo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" 
    "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es" lang="es">
    <head>
        <meta http-equiv="Content-Type" xml:lang="es" content="text/html; charset=utf-8" />
        <meta name="description" xml:lang="es" content="Configuración del Sistema: Fácil declarador de impuestos, parte de Multas e Intereses"/>
        <meta name="keywords" xml:lang="es" content="FDI, Configuración, Sistema, Multas e Intereses" />
        <meta name="tittle" content="Multas e Intereses, Configuración del Sistema" />
        <meta name="author" content="Ericka Castro, Juan León Mera, Pedro Lucas, Gustavo Totoy C." />
        <title>Multas e Intereses, Configuración del Sistema</title>
        
        <link rel="stylesheet" type="text/css" href="css/layouts.css" />
        <link rel="stylesheet" type="text/css" href="css/finesInterestsConfig.css" />
    </head>
    <body>
        <div id="container">
            <div id="tittle">
                <h1>Multas e Intereses</h1>
            </div>   
            <div id="content-container">
                <%-- Multas --%>
                <div id="fines">
                    <div id="fines-description" class="description">
                        <h2>Tabla de multas para declaraciones tardías</h2>
                    </div>
                    <div id="publication-date">
                        <form id="form-publication-date" method="post" action="http://www.espol.edu.ec">
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
                                <input type="button" value="Buscar" />
                                <br />
                            </fieldset>
                        </form>
                    <br />
                    <br />
                </div>
                    <div id="fines-table" class="table">
                        <table border="1" cellpadding="3">
                            <tr>
                              <th rowspan="2">Infracciones</th>
                              <th rowspan="2">Impuesto a la renta anual</th>
                              <th colspan="2">Impuesto al valor agregado</th>
                            </tr>
                            <tr>
                              <th>Mensual Formulario 104A</th>
                              <th>Semestral Formulario 104A</th>
                            </tr>
                            <tr>
                              <td>Si causa impuesto</td>
                              <td> none </td>
                              <td> none </td>
                              <td> none </td>
                            </tr>
                            <tr>
                              <td>No causa impuesto</td>
                              <td> none </td>
                              <td> none </td>
                              <td> none </td>
                            </tr>
                        </table>
                        <br />
                        <br />
                    </div>
                    <div id="fines-option-buttons" class="option-buttons">
                        <input type="button" value="Nuevo" />
                        <input type="button" value="Guardar" />
                        <input type="button" value="Cancelar" />
                        <br />
                        <br />
                    </div>
                </div>
                <%-- Intereses --%>
                <div id="interests">
                    <div id="interests-description" class="description">
                        <h2>Intereses en función del trimestre</h2>
                    </div>
                    <div id="interests-table" class="table">
                        <table border="1" cellpadding="3">
                            <tr>
                                <th>Trimestre</th>
                                <th>Cargo</th>
                            </tr>
                            <tr>
                              <td>none</td>
                              <td>none</td>
                            </tr>
                            <tr>
                              <td>none</td>
                              <td>none</td>
                            </tr>
                            <tr>
                              <td>none</td>
                              <td>none</td>
                            </tr>
                        </table>
                        <br />
                        <br />
                    </div>
                    <div id="deadlines-option-buttons" class="option-buttons">
                        <input type="button" value="Nuevo" />
                        <input type="button" value="Guardar" />
                        <input type="button" value="Cancelar" />
                        <br />
                        <br />
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

