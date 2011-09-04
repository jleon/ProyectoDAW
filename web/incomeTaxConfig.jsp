<%-- 
    Document   : incomeTaxConfig
    Created on : 14/08/2011, 08:25:49 PM
    Author     : Gustavo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" 
    "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es" lang="es">
    <head>
        <meta http-equiv="Content-Type" xml:lang="es" content="text/html; charset=utf-8" />
        <meta name="description" xml:lang="es" content="Configuración del Sistema: Fácil declarador de impuestos, parte de Impuesto a la Renta"/>
        <meta name="keywords" xml:lang="es" content="FDI, Configuración, Sistema, Impuesto a la Renta" />
        <meta name="tittle" content="Impuesto a la Renta, Configuración del Sistema" />
        <meta name="author" content="Ericka Castro, Juan León Mera, Pedro Lucas, Gustavo Totoy C." />
        <title>Impuesto a la Renta, Configuración del Sistema</title>
        
        <link rel="stylesheet" type="text/css" href="css/layouts.css" />
        <link rel="stylesheet" type="text/css" href="css/incomeTaxConfig.css" />
        
        <script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
        <script type="text/javascript" src="js/incomeTaxConfig.js"></script>
    </head>
    <body>
        <div id="container">
            <div id="tittle">
                <h1>Impuesto a la Renta</h1>
            </div>   
            <div id="content-container">

                <a href="javascript:void(0);" class="taxable-link" title="Despliegue Base Imponible"><img src="images/arrow_down.png" alt="Despliegue Base Imponible"/>Base Imponible</a>
             
                <div id="taxable" class="container_linked">
                    <div id="taxable-description" class="description">
                        <h2>Valores que representan la Base Imponible</h2>
                    </div>
                    <div id="taxable-year">
                        <label for="year">Año: </label>
                        <input type="text" id="year" name="year" />
                        <input type="button" value="Buscar" />
                        <br />
                        <br />
                    </div>
                    <div id="taxable-table" class="table">
                        <table border="1" cellpadding="3">
                            <tr>
                              <th>Fracción básica</th>
                              <th>Exceso hasta</th>
                              <th>Impuesto fracción básica</th>
                              <th>Impuesto fracción excedente</th>
                            </tr>
                            <tr>
                              <td><input type="text" value="0" /></td>
                              <td><input type="text" value="9210" /></td>
                              <td>-</td>
                              <td><input type="text" value="0" /> </td>
                            </tr>
                            <tr>
                              <td><input type="text" value="9210" /></td>
                              <td><input type="text" value="11730" /></td>
                              <td><input type="text" value="0" /></td>
                              <td><input type="text" value="5" /> </td>
                            </tr>
                            <tr>
                              <td><input type="text" value="11730" /></td>
                              <td><input type="text" value="14670" /></td>
                              <td><input type="text" value="126" /></td>
                              <td><input type="text" value="10" /> </td>
                            </tr>
                            <tr>
                              <td><input type="text" value="14670" /></td>
                              <td><input type="text" value="17610" /></td>
                              <td><input type="text" value="420" /></td>
                              <td><input type="text" value="12" /> </td>
                            </tr>
                            <tr>
                              <td><input type="text" value="17610" /></td>
                              <td><input type="text" value="35210" /></td>
                              <td><input type="text" value="773" /></td>
                              <td><input type="text" value="15" /> </td>
                            </tr>
                            <tr>
                              <td><input type="text" value="35210" /></td>
                              <td><input type="text" value="52810" /></td>
                              <td><input type="text" value="3410" /></td>
                              <td><input type="text" value="20" /> </td>
                            </tr>
                            <tr>
                              <td><input type="text" value="52810" /></td>
                              <td><input type="text" value="70420" /></td>
                              <td><input type="text" value="6933" /></td>
                              <td><input type="text" value="25" /> </td>
                            </tr>
                            <tr>
                              <td><input type="text" value="70420" /></td>
                              <td><input type="text" value="93890" /></td>
                              <td><input type="text" value="11335" /></td>
                              <td><input type="text" value="30" /> </td>
                            </tr>
                            <tr>
                              <td><input type="text" value="93890" /></td>
                              <td>En adelante</td>
                              <td><input type="text" value="18376" /></td>
                              <td><input type="text" value="35" /> </td>
                            </tr>
                        </table>
                        <br />
                        <br />
                    </div>
                    <div id="taxable-option-buttons" class="option-buttons">
                        <input type="button" value="Nuevo" />
                        <input type="button" value="Guardar" />
                        <input type="button" value="Cancelar" />
                        <br />
                        <br />
                    </div>
                </div>
				
				<a href="javascript:void(0);" class="deadlines-link" title="Despliegue Plazos"><img src="images/arrow_down.png" alt="Despliegue Plazos"/>Plazos</a>
       
                <div id="deadlines" class="container_linked">
					
                    <div id="deadlines-description" class="description">
                        <h2>Plazos en función del noveno dígito del RUC</h2>
                    </div>
                    <div id="deadlines-table" class="table">
                        <table border="1" cellpadding="3">
                            <tr>
                                <th>Noveno dígito del RUC</th>
                                <th>Fecha de Personas Naturales</th>
                            </tr>
                            <tr>
                              <td>1</td>
                              <td>combobox de combobox</td>
                            </tr>
                            <tr>
                              <td>2</td>
                              <td>combobox de combobox</td>
                            </tr>
                            <tr>
                              <td>3</td>
                              <td>combobox de combobox</td>
                            </tr>
                            <tr>
                              <td>4</td>
                              <td>combobox de combobox</td>
                            </tr>
                            <tr>
                              <td>5</td>
                              <td>combobox de combobox</td>
                            </tr>
                            <tr>
                              <td>6</td>
                              <td>combobox de combobox</td>
                            </tr>
                            <tr>
                              <td>7</td>
                              <td>combobox de combobox</td>
                            </tr>
                            <tr>
                              <td>8</td>
                              <td>combobox de combobox</td>
                            </tr>
                            <tr>
                              <td>9</td>
                              <td>combobox de combobox</td>
                            </tr>
                            <tr>
                              <td>0</td>
                              <td>combobox de combobox</td>
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
