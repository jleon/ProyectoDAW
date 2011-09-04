<%-- 
Document   : ingresosRelacionDependencia
Created on : 13/08/2011, 05:27:29 PM
Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresos por Relación de Dependencia</title>
        <link rel="stylesheet" type="text/css" href="css/ingresosRelDependencia.css" />
    </head>
    <body>
        <div class="main_container">
            <h1>Ingresos por Relación de Dependencia</h1>
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
                
                <table class="relDependencia_container">
                    <tr>                    
                        <th class="th_fecha"><h3>Fecha de Ingreso: </h3></th>
                        <th class="th_emp_per"><h3>Empresa o Persona: </h3></th>
                        <th class="th_val_ingresos"><h3>Valor de Ingresos: </h3></th>
                        <th class="th_val_egresos"><h3>Valor de Egresos: </h3></th>
                        <th class="th_liquido"><h3>Líquido Recibido: </h3></th>
                        <th colspan="2" class="th_imgB"></th>
                    </tr>
                    
                    <tr class="relDependencia_item" id="r1">                                      
                        <td class="td_fecha"><span id="r1_fecha">02/Sep/2010</span></td>
                        <td class="td_emp_persona"><span id="r1_desc">Politécnica del Litoral</span></td>
                        <td class="td_val_ingresos"><span id="r1_ing">300.20</span></td>
                        <td class="td_val_egresos"><span id="r1_egr">30.20</span></td>
                        <td class="td_val_liquido"><span id="r1_liq">270.00</span></td>
                        <td class="td_imgB"><a href="agregarRelacionDependencia.jsp" onclick="" ><img src="images/modificarFact.png" alt="Modificar" title="Modificar esta relDependencia" /></a></td>
                        <td class="td_imgB"><a href="agregarRelacionDependencia.jsp" onclick="" ><img src="images/eliminarFact.png" alt="Eliminar" title="Eliminar esta relDependencia" /></a></td>
                    </tr>
                    <tr class="relDependencia_item" id="r2">
                        <td class="td_fecha"><span id="r2_fecha">05/Sep/2010</span></td>
                        <td class="td_emp_persona"><span id="r2_desc">Universidad de Guayaquil</span></td>
                        <td class="td_val_ingresos"><span id="r2_ing">700.00</span></td>
                        <td class="td_val_egresos"><span id="r2_egr">60.00</span></td>
                        <td class="td_val_liquido"><span id="r2_liq">640.00</span></td>
                        <td class="td_imgB"><a href="agregarRelacionDependencia.jsp" onclick="" ><img src="images/modificarFact.png" alt="Modificar" title="Modificar esta relDependencia" /></a></td>
                        <td class="td_imgB"><a href="agregarRelacionDependencia.jsp" onclick="" ><img src="images/eliminarFact.png" alt="Eliminar" title="Eliminar esta relDependencia" /></a></td>
                        
                    </tr>
                    <tr class="relDependencia_item" id="r3">
                        <td class="td_fecha"><span id="r3_fecha">05/Sep/2010</span></td>
                        <td class="td_emp_persona"><span id="r3_desc">Universidad Santa María</span></td>
                        <td class="td_val_ingresos"><span id="r3_ing">200.00</span></td>
                        <td class="td_val_egresos"><span id="r3_egr">0.00</span></td>
                        <td class="td_val_liquido"><span id="r3_liq">200.00</span></td>
                        <td class="td_imgB"><a href="agregarRelacionDependencia.jsp" onclick="" ><img src="images/modificarFact.png" alt="Modificar" title="Modificar esta relDependencia" /></a></td>
                        <td class="td_imgB"><a href="agregarRelacionDependencia.jsp" onclick="" ><img src="images/eliminarFact.png" alt="Eliminar" title="Eliminar esta relDependencia" /></a></td>                    
                    </tr>
                    
                </table>
                
            </div>
            <div class="nueva_relDependencia">
                <h3>Agregar NUEVO item de Ingreso por Relación de Dependencia</h3>
                <a href="#" onclick="" ><img src="images/nuevaFact.png" alt="Nueva" title="Agregar NUEVO item de Ingreso por Relación de Dependencia" /></a>
            </div>
        </div>
    </body>
</html>
