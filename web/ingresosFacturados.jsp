<%-- 
Document   : ingresosFacturados
Created on : 12/08/2011, 11:46:00 AM
Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresos Facturados</title>
        <link rel="stylesheet" type="text/css" href="css/ingresosFacturados.css" />
    </head>
    <body>
        <div class="main_container">
            <h1>Ingresos Facturados</h1>
            <div class="consulta">
                <div class="filtro">
                    <h2 class="tit_consulta">Año: </h2>
                    <select id="cmb_anio">
                        <option>2008</option>
                        <option>2009</option>
                        <option>2010</option>
                        <option selected="selected">2011</option>
                    </select>
                    <h2 id="tit_consulta">Mes: </h2>
                    <select class="cmb_mes">
                        <option value="1" selected="selected" >Enero</option>
                        <option value="2" >Febrero</option>
                        <option value="3" >Marzo</option>
                        <option value="4" >Abril</option>
                        <option value="5" >Mayo</option>
                        <option value="6" >Junio</option>
                        <option value="7" >Julio</option>
                        <option value="8" >Agosto</option>
                        <option value="9" >Septiembre</option>
                        <option value="10" >Octubre</option>
                        <option value="11" >Noviembre</option>
                        <option value="12" >Diciembre</option>
                    </select>
                </div>
                
                <table class="facturas_container">
                    <tr>
                        <th class="th_nro"><h3>Factura Nro: </h3></th>
                        <th class="th_fecha"><h3>Fecha Emision: </h3></th>
                        <th class="th_desc"><h3>Descripcion: </h3></th>
                        <th colspan="2" class="th_imgB"></th>
                    </tr>
                    
                    <tr class="factura_item" id="f1">                  
                        <td class="td_nro"><span id="f1_nro">1</span></td>
                        <td class="td_fecha"><span id="f1_fecha">01/Dic/2010</span></td>
                        <td class="td_desc"><span id="f1_desc">Prestación de servicios en....</span></td>
                        <td class="td_imgB"><a href="agregarFacturaIngreso.jsp" onclick="" ><img src="images/modificarFact.png" alt="Modificar" title="Modificar esta factura" /></a></td>
                        <td class="td_imgB"><a href="agregarFacturaIngreso.jsp" onclick="" ><img src="images/eliminarFact.png" alt="Eliminar" title="Eliminar esta factura" /></a></td>
                    </tr>
                    <tr class="factura_item" id="f2">
                        <td class="td_nro"><span id="f2_nro">13</span></td>
                        <td class="td_fecha"><span id="f2_fecha">20/Dic/2010</span></td>
                        <td class="td_desc"><span id="f2_desc">Concepto de construir....</span></td>
                        <td class="td_imgB"><a href="agregarFacturaIngreso.jsp" onclick="" ><img src="images/modificarFact.png" alt="Modificar" title="Modificar esta factura" /></a></td>
                        <td class="td_imgB"><a href="agregarFacturaIngreso.jsp" onclick="" ><img src="images/eliminarFact.png" alt="Eliminar" title="Eliminar esta factura" /></a></td>
                        
                    </tr>
                    <tr class="factura_item" id="f3">
                        <td class="td_nro"><span id="f3_nro">27</span></td>
                        <td class="td_fecha"><span id="f3_fecha">28/Dic/2010</span></td>
                        <td class="td_desc"><span id="f3_desc">Concepto de construir....</span></td>
                        <td class="td_imgB"><a href="agregarFacturaIngreso.jsp" onclick="" ><img src="images/modificarFact.png" alt="Modificar" title="Modificar esta factura" /></a></td>
                        <td class="td_imgB"><a href="agregarFacturaIngreso.jsp" onclick="" ><img src="images/eliminarFact.png" alt="Eliminar" title="Eliminar esta factura" /></a></td>
                        
                    </tr>
                    
                </table>
                
            </div>
            <div class="nueva_factura">
                <h3>Agregar NUEVA FACTURA</h3>
                <a href="#" onclick="" ><img src="images/nuevaFact.png" alt="Nueva" title="Agregar una nueva factura" /></a>
            </div>
        </div>
    </body>
</html>
