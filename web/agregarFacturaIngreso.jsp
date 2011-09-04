<%-- 
    Document   : agregarFacturaIngreso
    Created on : 12/08/2011, 05:00:34 PM
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Factura</title>
        
        <link rel="stylesheet" type="text/css" href="css/jquery.autocomplete.css" />
        <link rel="stylesheet" type="text/css" href="css/agregarFactura.css" />
        <link rel="stylesheet" type="text/css" href="css/popupStyle.css" />
        
        <script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
        <script type="text/javascript" src="js/jquery.autocomplete.js"></script>
        <script type="text/javascript" src="js/jquery.autocomplete.min.js"></script>
        <script type="text/javascript" src="js/jquery.autocomplete.pack.js"></script>
        <script type="text/javascript" src="js/agregarFactura.js"></script>
        <script type="text/javascript" src="js/csspopup.js"></script>
        <script type="text/javascript" src="js/cliente.js"></script>
        
    </head>
    <body onKeyPress="alertkey(event);" >
        <div id="main_container" class="main_container">
            <h1>Factura</h1>
            
            <form id="form_factura"   method="post" class="formulario" action="IngresoFacturado?action=0" enctype="multipart/form-data" onsubmit="" >
                <fieldset>
                    <legend>Datos de la Factura</legend>
                    <div class="form_fila">
                        <div class="form_box_izq">
                            <label for="fecha">Fecha: </label>
                        </div>
                        <div class="form_box_der">
                            <input type="text" class="text_box"  id="fecha" name="fecha"/>                  
                            <div>
                                <label for="tipo">Tipo: </label>
                                <select id="tipo" name="tipo">
                                    <option selected="selected">Normal</option>
                                    <option>Por Reembolso</option>
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
                            <input type="text" class="text_box"  id="nro_factura" name="nro_factura" size="10" value="0" onkeypress="return onlyIntegerNumbers(event)" />
                            <br/>
                        </div>                
                    </div>
                    
                    <div class="form_fila">
                        <div class="form_box_izq">
                            <label for="cliente">Cliente: </label>
                        </div>
                        <div class="form_box_der">
                            <input type="hidden" id="id_cliente" name="id_cliente" />
                            <input type="text" class="text_box"  id="cliente" name="cliente" size="40" autocomplete="off"  />
                            <button id="abrirPop" name="abrirPop" type="button" title="Buscar Cliente" onclick="resetFormCliente();">
                                <img src="images/cliente_icon.png" alt="Buscar Clientes" title="Buscar Cliente"/>						
                            </button>					
                            <br/>
                        </div>                
                    </div>
                    
                    <div class="form_fila">
                        <div class="form_box_izq">
                            <label for="desc_general">Descripción General: </label>
                        </div>
                        <div class="form_box_der">
                            <input type="text" class="text_box"  id="desc_general" name="desc_general" size="60"/>
                            <br/>
                        </div>                   
                    </div>
                    
                    
                    <div class="form_fila">
                        <div class="form_box_izq">
                            <label for="subtotal_cero">Subtotal Valor 0%: </label>
                        </div>
                        <div class="form_box_der">
                            <input type="text" class="text_box"  id="subtotal_cero" name="subtotal_cero" size="10" value="0.00" onkeypress="return onlyFloat2Numbers(event, this)"/>
                            <br/>
                        </div>                
                    </div>
                    
                    <div class="form_fila">
                        <div class="form_box_izq">
                            <label for="subtotal_iva">Subtotal IVA: </label>
                        </div>
                        <div class="form_box_der">
                            <input type="text" class="text_box"  id="subtotal_iva" name="subtotal_iva" size="10" value="0.00" onkeypress="return onlyFloat2Numbers(event, this)"/>
                            <br/>
                        </div>                
                    </div>
                    
                    <div class="form_fila">
                        <div class="form_box_izq">
                            <label for="total">TOTAL: </label>
                        </div>
                        <div class="form_box_der">
                            <input type="text" class="text_box"  id="total" name="total" size="10" value="0.00" onkeypress="return onlyFloat2Numbers(event, this)"/>
                            <br/>
                        </div>                
                    </div>
                    
                    <div class="form_fila">
                        <div class="form_box_izq">
                            <label for="copia_fact">Copia de Factura(Op): </label>
                        </div>
                        <div class="form_box_der">                            
                            <input type="file" id="img_factura" name="img_factura" value="Subir Escaneado"/>                            
                            <br/>
                        </div>                
                    </div>
                </fieldset>
                <div class="form_fila">
                    
                    <a href="javascript:ocultarEliminarComprobante();" id="id_a_retencion" class="a_retencion" title="Despliegue el comprobante de retención"><img src="images/arrow_down.png" alt="Despliegue Retencion"/>Comprobante de Retención(Opcional)</a>
                    <div id="retencion_container" class="retencion">
                        <div id="comprobante_retencion">
                            <fieldset>
                                <legend>Datos del Comprobante de Retención</legend>
                                <div class="form_fila_der">								
                                    <label for="nro_retencion">Nro Comprobante de Retención: </label>						
                                    <input type="text" class="text_box"  id="nro_retencion" name="nro_retencion" value="0" onkeypress="return onlyIntegerNumbers(event)"/>                    
                                    <br/>								
                                </div>
                                <div class="ajuste"></div>  
                                <table>
                                    <tr>
                                        <th><label for="impuesto">Impuesto</label></th>
                                        <th><label for="ejercicio_fiscal">Ejercicio Fiscal(año,mes)</label></th>
                                        <th><label for="base_imponible">Base Imponible</label></th>
                                        <th><label for="porc_retencion">% Retencion</label></th>
                                        <th><label for="valor_retenido">Valor Retenido</label></th>
                                    </tr>

                                    <tr>
                                        <td>IVA</td>
                                        <td><input type="text" class="text_box"  id="iva_ejerc_fiscal_anio" name="iva_ejerc_fiscal_anio" size="4" onkeypress="return onlyIntegerNumbers(event)"/>
                                            - <input type="text" class="text_box"  id="iva_ejerc_fiscal_mes" name="iva_ejerc_fiscal_mes" size="2" onkeypress="return onlyIntegerNumbers(event)"/>
                                        </td>
                                        <td><input type="text" class="text_box"  id="iva_base_imponible" name="iva_base_imponible" size="10" value="0.00" onkeypress="return onlyFloat2Numbers(event, this)"/></td>
                                        <td><input type="text" class="text_box"  id="iva_porc_retencion" name="iva_porc_retencion" size="4" value="0.00" onkeypress="return onlyFloat2Numbers(event, this)"/></td>
                                        <td><input type="text" class="text_box"  id="iva_valor_retenido" name="iva_valor_retenido" size="8" value="0.00" onkeypress="return onlyFloat2Numbers(event, this)"/></td>									
                                    </tr>

                                    <tr>
                                        <td>RENTA</td>
                                        <td><input type="text" class="text_box"  id="ir_ejerc_fiscal_anio" name="ir_ejerc_fiscal_anio" size="4" onkeypress="return onlyIntegerNumbers(event)"/>
                                            - <input type="text" class="text_box"  id="ir_ejerc_fiscal_mes" name="ir_ejerc_fiscal_mes" size="2" onkeypress="return onlyIntegerNumbers(event)"/>
                                        </td>
                                        <td><input type="text" class="text_box"  id="ir_base_imponible" name="ir_base_imponible" size="10" value="0.00" onkeypress="return onlyFloat2Numbers(event, this)"/></td>
                                        <td><input type="text" class="text_box"  id="ir_porc_retencion" name="ir_porc_retencion" size="4" value="0.00" onkeypress="return onlyFloat2Numbers(event, this)"/></td>
                                        <td><input type="text" class="text_box"  id="ir_valor_retenido" name="ir_valor_retenido" size="8" value="0.00" onkeypress="return onlyFloat2Numbers(event, this)"/></td>									
                                    </tr>
                                    <tr>
                                        <td colspan="4" >TOTAL RETENIDO:</td>																		
                                        <td><input type="text" class="text_box"  id="total_retenido" name="total_retenido" size="10" value="0.00"  onkeypress="return onlyFloat2Numbers(event, this)"/></td>									
                                    </tr>

                                </table>
                                <div class="form_fila">								
                                    <label for="copia_ret">Copia del Comprobante(Op): </label>							                                                                    
                                    <input type="file" id="img_retencion" name="img_retencion" value="Subir Escaneado"/>                                    
                                </div>
                                <div class="form_fila_der">								
                                    <input type="button" value="Agregar Comprobante" onclick="agregarComprobanteRetencion();"/>                    								
                                    <input type="button" value="Cancelar" onclick="cancelarComprobanteRetencion();" />
                                </div>
                            </fieldset>
                       </div>
                       <div id="comprobante_retencion_agregado" style="display:none;" >
                           <fieldset>
                                <legend>Comprobante de Retencion Agregado</legend>
                                <p>Ha agregado el comprobante de retención respetivo con Nro <span id="label_nro_comprobante"></span> y total retenido de $<span id="label_total_retenciones"></span></p>
                                <div class="form_fila_der">								
                                    <input type="button" value="Modificar" onclick=" modificarComprobanteRetencion();"/>                    								
                                    <input type="button" value="Eliminar" onclick=" eliminarComprobanteRetencion();" />
                                    <input style="display:none;" type="button" id="limpiar_retencion_file" name="limpiar_retencion" value="Limpiar datos" />
                                </div>
                            </fieldset>
                       </div>
                    </div>				
                    
                </div>
                
                <div class="form_fila_der">								
                    <label for="total_recibido">TOTAL RECIBIDO(Total-Retenciones): </label>							
                    <input type="text" class="text_box"  id="total_recibido" name="total_recibido" size="10" value="0.00"  onkeypress="return onlyFloat2Numbers(event, this)"/>								
                </div>
                <div class="form_fila">
                    <div class="form_box_izq">
                        <input type="submit" value="Guardar"/>                    
                    </div>
                    <div class="form_box_der">
                        <input type="button" value="Cancelar" onclick="document.location.href='ingresosFacturados.jsp'"/>
                    </div>                   
                </div>
                
            </form>
            
            <div class="ajuste"></div>
            
        </div>
        <!--INICIO POP UP CLIENTE-->
        <div id="capaPopUp"></div>
        <div id="popUpDiv">
            <div id="capaContent">
                <a href="javascript:void(0);" title="Cerrar" id="cerrar" class="cerrar"  >
                    <img src="images/cerrar_popup.png" alt="Cerrar esta ventana" title="Cerrar esta ventana"/>
                </a>
                <h1>Clientes</h1>
                <form id="form_cliente"  method="post" class="formulario" action="">
                    <fieldset>
                        <legend>Información de Clientes</legend>
                        <div class="form_fila">				
                            <label for="buscar_cliente">Buscar: </label>					
                            <input type="text" class="text_box"  id="nom_cliente_busq" name="nom_cliente_busq" size="20" onkeyup="buscarClientes()"/>				
                            <div class="form_fila_der" style="margin-left: 9em;">
                                <input type="button" value="Seleccionar Cliente" id="seleccionar_cliente" onclick="setClienteEnFactura()" />
                            </div>
                        </div>                        
                        <a href="javascript:void(0);" onclick="buscarTodosClientes()">Mostrar Todos los Clientes</a>
                        <h2>Listado de Clientes</h2>
                        <select class="s_listado_clientes" size="12" id="s_listado_clientes" onclick="setInfoClientes()" onkeyup="setInfoClientes()" >					  
                            <!--Options dinamicos-->					  
                        </select>	
                        <div class="datos_cliente">
                            
                            <div class="form_fila">
                                <div class="form_box_izq">	
                                    <label for="nombre_cliente">Nombre del Cliente: </label>
                                </div>
                                <div class="form_box_der">							
                                    <input type="text" class="text_box"  id="nombre_cliente" name="nombre_cliente" size="20"/>
                                    <br/>
                                </div>                
                            </div>	
                            
                            <div class="form_fila">
                                <div class="form_box_izq">
                                    <label for="ruc_ci_cliente">RUC o Cédula: </label>
                                </div>
                                <div class="form_box_der">
                                    <input type="text" class="text_box"  id="ruc_ci_cliente" name="ruc_ci_cliente" size="13"/>
                                    <br/>
                                </div>                
                            </div>
                            
                            <div class="form_fila">
                                <div class="form_box_izq">
                                    <label for="dir_cliente">Dirección: </label>
                                </div>
                                <div class="form_box_der">
                                    <input type="text" class="text_box"  id="dir_cliente" name="dir_cliente" size="25"/>
                                    <br/>
                                </div>                
                            </div>
                            
                            <div class="form_fila">
                                <div class="form_box_izq">
                                    <label for="tlf_cliente">Teléfono: </label>
                                </div>
                                <div class="form_box_der">
                                    <input type="text" class="text_box"  id="tlf_cliente" name="tlf_cliente" size="13"/>
                                    <br/>
                                </div>                
                            </div>	
                            
                            <div class="form_fila_der">	
                                <input type="hidden" id="id_usuario" name="id_usuario" value="1" />
                                <input type="button" id="btn_nuevo_cliente" value="Nuevo" onclick="nuevoCliente();"/>	
                                <input type="button" id="btn_modificar_cliente" value="Modificar" disabled="disabled" onclick="modificarCliente();"/>	
                                <input type="button" id="btn_guardar_cliente" value="Guardar" disabled="disabled" onclick="guardarCliente();"/>                   
                                <input type="button" value="Cancelar"  disabled="disabled" id="btn_cancelar_cliente" onclick="resetFormCliente();" />					
                                <input type="button" id="cerrar_popup" class="cerrar" style="display: none;" />					
                                
                            </div>
                        </div>
                        
                    </fieldset>
                </form>
            </div>
        </div>		
        <!--FIN POP UP CLIENTE-->		
        
    </body>
</html>
