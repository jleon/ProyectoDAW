<%-- 
    Document   : agregarRelacionDependencia
    Created on : 13/08/2011, 07:16:07 PM
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresos por Relación de Dependencia</title>
        
        <link rel="stylesheet" type="text/css" href="css/agregarRelDependencia.css" />		
        <script type="text/javascript" src="js/agregarRelacionDependencia.js"></script>		
        
    </head>
    <body >
        <div id="main_container" class="main_container">
            <h1>Ingresos por Relación de Dependencia</h1>
            
            <form id="form_factura"  method="post" class="formulario" action="">
                <fieldset>            
                    <div class="form_fila">
                        <div class="form_box_izq">
                            <label for="fecha">Fecha del Ingreso: </label>
                        </div>
                        <div class="form_box_der">
                            <input type="text" id="fecha" name="fecha"/>  					
                        </div>    				
                        <div class="form_fila_der">								
                            <label for="empresa_persona">Empresa o Persona: </label>
                            <input type="text" id="empresa_persona" name="empresa_persona" size="35"/>
                            <br/>
                        </div>
                    </div>                 
                    
                    <fieldset>
                        <legend>Detalles de Ingresos</legend>
                        <div class="form_fila">
                            <div class="form_box_izq">
                                <label for="concepto_ingreso">Concepto: </label>
                            </div>
                            <div class="form_box_der">
                                <input type="text" id="concepto_ingreso" name="concepto_ingreso" size="50"/>
                                <br/>
                            </div>                   
                        </div>
                        
                        
                        <div class="form_fila">
                            <div class="form_box_izq">
                                <label for="valor_ingreso">Valor: </label>
                            </div>
                            <div class="form_box_der">
                                
                                <input type="text" id="valor_ingreso" name="valor_ingreso" size="10"/>
                                <br/>
                            </div>                
                        </div>
                        
                        <div class="form_fila">
                            <div class="form_box_izq">
                                <label for="tipo_ingreso">Tipo: </label>
                            </div>
                            <div class="form_box_der">
                                <select class="tipo_ingreso" onclick="mostrarEspOtros(this.value,'div_otros_ingreso')">					  
                                    <option selected="selected">Remuneración</option>
                                    <option>Horas Extras</option>
                                    <option>Otros...</option>					  
                                </select>					
                            </div>       
                            <div id="div_otros_ingreso" class="form_fila_der">
                                <label for="otros_ingreso">Especifique: </label>
                                <input type="text" id="otros_ingreso" name="otros_ingreso" size="13"/>
                            </div>
                            <br/>
                        </div>
                    </fieldset>
                    <br/>
                    <fieldset>
                        <legend>Detalles de Egresos</legend>
                        <div class="form_fila">
                            <div class="form_box_izq">
                                <label for="concepto_egreso">Concepto: </label>
                            </div>
                            <div class="form_box_der">
                                <input type="text" id="concepto_egreso" name="concepto_egreso" size="50"/>
                                <br/>
                            </div>                   
                        </div>
                        
                        
                        <div class="form_fila">
                            <div class="form_box_izq">
                                <label for="valor_egreso">Valor: </label>
                            </div>
                            <div class="form_box_der">
                                
                                <input type="text" id="valor_egreso" name="valor_egreso" size="10"/>
                                <br/>
                            </div>                
                        </div>
                        
                        <div class="form_fila">
                            <div class="form_box_izq">
                                <label for="tipo_egreso">Tipo: </label>
                            </div>
                            <div class="form_box_der">
                                <select class="tipo_egreso" onclick="mostrarEspOtros(this.value,'div_otros_egreso')">					  
                                    <option selected="selected">Aporte al IESS</option>
                                    <option>Impuesto a la Renta</option>
                                    <option>Otros...</option>					  
                                </select>					
                            </div>       
                            <div id="div_otros_egreso" class="form_fila_der">
                                <label for="otros_egreso">Especifique: </label>
                                <input type="text" id="otros_egreso" name="otros_egreso" size="13"/>
                            </div>
                            <br/>
                        </div>
                    </fieldset>
                    
                    <br/>
                    <div class="form_fila_der">								
                        <label for="liquido_recibido">VALOR LÍQUIDO RECIBIDO: </label>							
                        <input type="text" id="liquido_recibido" name="liquido_recibido" size="10"/>								
                    </div>
                    
                    <br/>
                    <div class="form_fila">
                        <div class="form_box_izq">
                            <input type="submit" value="Guardar"/>                    
                        </div>
                        <div class="form_box_der">
                            <input type="button" value="Cancelar" onclick="document.location.href='ingresosRelacionDependencia.jsp'"/>
                        </div>
                        
                    </div>
                </fieldset> 
            </form>
            
            <div class="ajuste"></div>
            
        </div>	  	
        
    </body>
</html>
