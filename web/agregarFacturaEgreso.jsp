<%-- 
Document   : agregarFacturaEgreso
Created on : 16/08/2011, 10:26:25 PM
Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Factura</title>

        <link rel="stylesheet" type="text/css" href="css/agregarFactura.css" />
        <link rel="stylesheet" type="text/css" href="css/demos.css" />
        <link rel="stylesheet" type="text/css" href="css/jquery.ui.all.css" />
        <script type="text/javascript" src="js/jquery-1.6.2.js"></script>
        <script type="text/javascript" src="js/agregarFactura.js"></script>
        <script type="text/javascript" src="js/jquery.ui.core.js"></script>
        <script type="text/javascript" src="js/jquery.ui.widget.js"></script>
        <script type="text/javascript" src="js/jquery.ui.datepicker.js"></script>
        <script>
	$(function() {
		$( "#fecha" ).datepicker({ dateFormat: 'dd/mm/yy' });
	});
	</script>
    </head>
    <body >
        <div id="main_container" class="main_container">
            <h1>Factura</h1>

            <form id="form_factura"  method="post" class="formulario" action="Egresos.do">
                <fieldset>
                    <legend>Datos de la Factura</legend>
                    <div class="form_fila">
                        <div class="form_box_izq">
                            <label for="fecha">Fecha: </label>
                        </div>
                        <div class="form_box_der">
                            <input type="text" id="fecha" name="fecha"/>                    
                        </div>                
                    </div>
                    
                    <div class="form_fila">
                        <div class="form_box_izq">
                            <label for="proveedor">Proveedor: </label>
                            
                        </div>
                        <div class="form_box_der">              
                            <select id="proveedor" name="proveedor">
                                <c:forEach var="Proveedores" items="${listaProveedores}">
                                    <option value="${Proveedores.rucCi}"> ${Proveedores.rucCi}</option>
                                </c:forEach>
                                <option value="otro">Otro</option>
                            </select>
                            <div>
                                <label for="tipo">Tipo: </label>
                                <select id="tipo" name="tipo">
                                    <option selected="selected">Hotel</option>
                                    <option>Gasolina</option>
                                    <option>Educación</option>
                                    <option>Hogar</option>
                                    <option>Salud</option>
                                    <option>Servicios</option>
                                    <option>Alimentación</option>
                                    <option>Vestimenta</option>
                                    <option>Otro</option>
                                </select>
                                <br/>
                            </div>
                        </div>                
                    </div>

                    <div class="form_fila">
                        <div class="form_box_izq">
                            <label for="nro_factura">Nro Factura: </label>
                        </div>
                        <div class="form_box_der">
                            <input type="text" id="nro_factura" name="nro_factura" size="10"/>
                            <br/>
                        </div>                
                    </div>

                    <div class="form_fila">
                        <div class="form_box_izq">
                            <label for="subtotal_cero">Subtotal Valor 0%: </label>
                        </div>
                        <div class="form_box_der">
                            <input type="text" id="subtotal_cero" name="subtotal_cero" size="10"/>
                            <br/>
                        </div>                
                    </div>

                    <div class="form_fila">
                        <div class="form_box_izq">
                            <label for="subtotal_cero">Subtotal IVA 0%: </label>
                        </div>
                        <div class="form_box_der">
                            <input type="text" id="subtotal_iva" name="subtotal_cero" size="10"/>
                            <br/>
                        </div>                
                    </div>

                    <div class="form_fila">
                    <div class="form_box_izq">
                        <label>Derecho a crédito: </label>                   
                    </div>
                        <div class="form_box_der">
                            <label for="derecho_a_credito">SI</label><input type="radio" name="derecho_a_credito" value="SI"/>
                            <label for="derecho_a_credito">NO</label><input type="radio" name="derecho_a_credito" value="NO"/>
                        </div>
                    </div>
                    
                    <div class="form_fila">
                    <div class="form_box_izq">
                        <label for="valor_deducible ">Valor deducible: </label>                   
                    </div>
                        <div class="form_box_der">
                            <input type="text" name="valor_deducible" />
                        </div>
                    </div>
                    
                    <div class="form_fila">
                        <div class="form_box_izq">
                            <label for="total">TOTAL: </label>
                        </div>
                        <div class="form_box_der">
                            <input type="text" id="total" name="total" size="10"/>
                            <br/>
                        </div>                
                    </div>
                    
                    <div class="form_fila">
                        <div class="form_box_izq">
                            <label for="copia_fact">Copia de Factura: </label>
                        </div>
                        <div class="form_box_der">
                            <input type="button" id="img_factura" name="img_factura" value="Subir Escaneado"/>
                            <br/>
                        </div>                
                    </div>
                    
                </fieldset>
                
                
                
                <div class="form_fila">
                    <div class="form_box_izq">
                        <input type="submit" value="Guardar"/>                    
                    </div>
                    <div class="form_box_der">
                        <input type="button" value="Cancelar"/>
                    </div>
                </div>
            </form>

            <div class="ajuste"></div>
        </div>

    </body>
</html>
