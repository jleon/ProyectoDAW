<%-- 
    Document   : index
    Created on : 24/08/2011, 08:14:39 AM
    Author     : jleon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario 104A</title>
        <link href="formulario104A.css" type="text/css" rel="stylesheet"
    </head>
    <body>
        <div id="pagina">
            <div id="cabecera">
                <div id="titulo_izquierda">
                    <h1>Formulario 104A</h1>
                </div>
                <div id="titulo_centro">
                    <h3>Declaración del impuesto al valor agregado o para personas naturales 
                        no obligadas a llevar contabilidad y que no realizan actividades de comercio exterios</h2>
                </div>
                <div id="titulo_derecha">
                    <label for="Numero">Número</label>
                    <input type="text" id="Numero" name="Numero"></input>
                </div>
            </div>
            <div id="cuerpo">
                <div id="bloque100">
                    <p id="100">100 Identificación de la declaración</p>
                    <div id="bloque101" class="bloque10X">
                        <label class="num">101</label>
                        <label for="mes">Mes</label>
                        <select id="mes">
                            <option value="1" >01</option>
                            <option value="2" >02</option>
                            <option value="3" >03</option>
                            <option value="4" >04</option>
                            <option value="5" >05</option>
                            <option value="6" >06</option>
                            <option value="7" >07</option>
                            <option value="8" >08</option>
                            <option value="9" >09</option>
                            <option value="10" >10</option>
                            <option value="11" >11</option>
                            <option value="12" >12</option>
                        </select>
                    </div>
                    <div id="bloque102" class="bloque10X" >
                        <label class="num">102</label>
                        <label for="anio">Año</label>
                        <input id="anio" name="anio" type="text" ></input>
                    </div>
                    <div id="bloque103" class="bloque10X" >
                        <label class="num">103</label>
                        <label for="semestre">Semestre</label>
                        <select id="semestre">
                            <option value="1">Enero a Junio</option>
                            <option value="2">Julio a Diciembre</option>
                        </select>
                    </div>
                    <div id="bloque104" class="bloque10X" >
                        <label class="num">104</label>
                        <div id="subbloque104">
                            <label for="formulario_que_sustituye">Nº de formulario que sustituye</label>
                            <input id="formulario_que_sustituye" type="text"></input>
                        </div>
                    </div>

                </div>

                <div id="bloque200">
                    <p id="200">200 Identificación sujeto pasivo</p>
                    <div id="bloque201" class="bloque20x">
                        <label class="num">201</label>
                        <label for="ruc">RUC</label>
                        <input id="ruc" name="ruc" type="text"></input>
                    </div>
                    <div id="bloque202" class="bloque20x">
                        <div id="subbloque202">
                            <label class="num">202</label>
                            <label id="label_razon_social" for="razon_social">Razón social o Apellidos y Nombres completos</label>
                        </div>
                        <input id="razon_social" name="razon_social" type="text"></input>
                    </div>
                </div>

                <div id="bloque400">
                    <div class="subbloque400">
                        <label id="b400A" >Resumen de ventas y otras operaciones del periodo que declara</label>
                        <label id="b400B" >Valor bruto</label>
                        <label id="b400C" >Valor neto (Valor bruto - N/C)</label>
                        <label id="b400D" >Impuesto generado</label>
                    </div>
                    <div id="bloque4x1">
                        <label for="401" class="bloque_descripcion">Ventas locales (Excluye activos fijos) gravadas tarifa 12%</label>
                        <div class="bloque">
                            <label class="num">401</label>
                            <label class="signo">+</label>
                            <input id="401" name="401" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">411</label>
                            <label class="signo">+</label>
                            <input id="411" name="411" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">421</label>
                            <label class="signo">+</label>
                            <input id="421" name="421" type="text"></input>
                        </div>
                    </div>
                    <div id="bloque4x2">
                        <label for="402" class="bloque_descripcion">Ventas de activos fijos gravadas tarifa 12%</label>
                        <div class="bloque">
                            <label class="num">402</label>
                            <label class="signo">+</label>
                            <input id="402" name="402" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">412</label>
                            <label class="signo">+</label>
                            <input id="412" name="412" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">422</label>
                            <label class="signo">+</label>
                            <input id="422" name="422" type="text"></input>
                        </div>
                    </div>
                    <div id="bloque4x3">
                        <label for="403" class="bloque_descripcion">Ventas locales (Excluye activos fijos) 
                            gravadas tarifa 0% que no dan derecho a credito tributario</label>
                        <div class="bloque">
                            <label class="num">403</label>
                            <label class="signo">+</label>
                            <input id="403" name="403" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">413</label>
                            <label class="signo">+</label>
                            <input id="413" name="413" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">423</label>
                            <label class="signo">+</label>
                            <input id="423" name="423" type="text"></input>
                        </div>
                    </div>
                    <div id="bloque4x4">
                        <label for="404" class="bloque_descripcion">Ventas de activos fijos gravadas tarifa 
                            0% que no dan derecho a crédito tributario</label>
                        <div class="bloque">
                            <label class="num">404</label>
                            <label class="signo">+</label>
                            <input id="404" name="404" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">414</label>
                            <label class="signo">+</label>
                            <input id="414" name="414" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">424</label>
                            <label class="signo">+</label>
                            <input id="424" name="424" type="text"></input>
                        </div>
                    </div>
                    <div id="bloque4x5">
                        <label for="405" class="bloque_descripcion">Ventas locales (Excluye activos fijos) 
                            gravadas tarifa 0% que dan derecho a crédito tributario</label>
                        <div class="bloque">
                            <label class="num">405</label>
                            <label class="signo">+</label>
                            <input id="405" name="405" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">415</label>
                            <label class="signo">+</label>
                            <input id="415" name="415" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">425</label>
                            <label class="signo">+</label>
                            <input id="425" name="425" type="text"></input>
                        </div>
                    </div>
                    <div id="bloque4x6">
                        <label for="406" class="bloque_descripcion">Ventas de activos fijos 
                            gravadas tarifa 0% que dan derecho a crédito tributario</label>
                        <div class="bloque">
                            <label class="num">406</label>
                            <label class="signo">+</label>
                            <input id="406" name="406" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">416</label>
                            <label class="signo">+</label>
                            <input id="416" name="416" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">426</label>
                            <label class="signo">+</label>
                            <input id="426" name="426" type="text"></input>
                        </div>
                    </div>
                    <div id="bloque4x9">
                        <label for="409" class="bloque_descripcion">TOTAL DE VENTAS Y OTRAS OPERACIONES</label>
                        <div class="bloque">
                            <label class="num">409</label>
                            <label class="signo">=</label>
                            <input id="409" name="409" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">419</label>
                            <label class="signo">=</label>
                            <input id="419" name="419" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">429</label>
                            <label class="signo">=</label>
                            <input id="429" name="429" type="text"></input>
                        </div>
                    </div>
                    <div id="bloque431">
                        <label for="431" class="bloque_descripcion">Transferencias no objeto de IVA</label>
                        
                        <div class="bloque margen_adelante_atras">
                            
                            <label class="num">431</label>
                            <input id="431" name="431" type="text"></input>
                        </div>
                        
                    </div>
                    <div id="bloque432">
                        <label for="432" class="bloque_descripcion">Notas de crédito tarifa 0% por compensar 
                            próximo mes (Informativo)</label>
                        
                        <div class="bloque margen_adelante_atras">
                            <label class="num">432</label>
                            <input id="432" name="432" type="text"></input>
                        </div>
                    </div>
                    <div id="bloque433_443">
                        <label for="433" class="bloque_descripcion">Notas de crédito tarifa 12% por compensar 
                            próximo mes (Informativo)</label>
                       
                        <div class="bloque">
                            <label class="num">433</label>
                            <input id="433" name="433" type="text"></input>
                        </div>    
                        <label class="relleno"></label>
                        <div class="bloque margen_atras">
                            <label class="num">443</label>
                            <input id="443" name="443" type="text"></input>
                        </div>    
                    </div>
                    <div id="bloque434">
                        <label for="434" class="bloque_descripcion">Ingresos por reembolso como intermediario 
                            (Informativo)</label>
                        <div class="bloque">
                            <label class="num">434</label>
                            <input id="434" name="434" type="text"></input>
                        </div>
                        <div class="bloque margen_atras">
                            <label class="num">444</label>
                            <input id="444" name="444" type="text"></input>
                        </div>   
                    </div>

                    <p id="p1">Liquidación de IVA en el mes</p>

                    <div class="subbloque400">
                        <div class="subbloque400pequenio">
                            <label class="etiqueta" for="480">Total transferencias gravadas 12% a contado este mes</label>
                            <label class="num">480</label>
                            <input id="480" name="480" type="text"></input>
                        </div>
                        <div class="subbloque400pequenio">
                            <label class="etiqueta" for="481">Total transferencias gravadas 12% a crédito este mes</label>
                            <label class="num">481</label>
                            <input id="481" name="481" type="text"></input>
                        </div>
                        <div class="subbloque400pequenio">
                            <label class="etiqueta" for="482">Total de impuesto generado (Trasládese a campo 429)</label>
                            <label class="num">482</label>
                            <input id="482" name="482" type="text"></input>
                        </div>
                        <div class="subbloque400pequenio">
                            <label class="etiqueta" for="483">Impuesto a liquidar el mes anterior (Trasládese el campo 485 de la declaración del período anterior)</label>
                            <label class="num">483</label>
                            <input id="483" name="483" type="text"></input>
                        </div>
                        <div class="subbloque400pequenio">
                            <label class="etiqueta" for="484">Impuesto a liquidar este mes (Mínimo 12% del campo 480) </label>
                            <label class="num">484</label>
                            <input id="484" name="484" type="text"></input>
                        </div>
                        <div class="subbloque400pequenio">
                            <label class="etiqueta" for="485">Impuesto a liquidar en el próximo mes (482-484)</label>
                            <label class="num">485</label>
                            <input id="485" name="485" type="text"></input>
                        </div>
                        <div class="subbloque400pequenio">
                            <label class="etiqueta" for="499">Total impuesto a liquidar este mes (Sumar 483 y 484)</label>
                            <label class="num">499</label>
                            <input id="499" name="499" type="text"></input>
                        </div>

                    </div>


                </div>
                
                <div id="bloque500">
                    <div class="subbloque400">
                        <label id="b400A" >Resumen de adquisiciones y pagos del periodo que declara</label>
                        <label id="b400B" >Valor bruto</label>
                        <label id="b400C" >Valor neto (Valor bruto - N/C)</label>
                        <label id="b400D" >Impuesto generado</label>
                    </div>
                    <div id="bloque4x1">
                        <label for="501" class="bloque_descripcion">ADQUISICIONES Y PAGOS (EXCLUYE ACTIVOS FIJOS) GRAVADOS TARIFA 12% (CON DERECHO A CRÉDITO TRIBUTARIO)</label>
                        <div class="bloque">
                            <label class="num">501</label>
                            <label class="signo">+</label>
                            <input id="501" name="501" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">511</label>
                            <label class="signo">+</label>
                            <input id="511" name="511" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">521</label>
                            <label class="signo">+</label>
                            <input id="521" name="521" type="text"></input>
                        </div>
                    </div>
                    <div id="bloque4x2">
                        <label for="502" class="bloque_descripcion">ADQUISICIONES LOCALES DE ACTIVOS FIJOS GRAVADOS TARIFA 12% (CON DERECHO A CRÉDITO TRIBUTARIO)</label>
                        <div class="bloque">
                            <label class="num">502</label>
                            <label class="signo">+</label>
                            <input id="502" name="502" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">512</label>
                            <label class="signo">+</label>
                            <input id="512" name="512" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">522</label>
                            <label class="signo">+</label>
                            <input id="522" name="522" type="text"></input>
                        </div>
                    </div>
                    <div id="bloque4x3">
                        <label for="503" class="bloque_descripcion">OTRAS ADQUISICIONES Y PAGOS GRAVADOS TARIFA 12% 
                            (SIN DERECHO A CRÉDITO TRIBUTARIO)</label>
                        <div class="bloque">
                            <label class="num">503</label>
                            <label class="signo">+</label>
                            <input id="503" name="503" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">513</label>
                            <label class="signo">+</label>
                            <input id="513" name="513" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">523</label>
                            <label class="signo">+</label>
                            <input id="523" name="523" type="text"></input>
                        </div>
                    </div>
                    <div id="bloque4x4">
                        <label for="507" class="bloque_descripcion">ADQUISICIONES Y PAGOS (INCLUYE ACTIVOS FIJOS) GRAVADOS TARIFA 0%</label>
                        <div class="bloque">
                            <label class="num">507</label>
                            <label class="signo">+</label>
                            <input id="507" name="507" type="text"></input>
                        </div>
                        <div class="bloque margen_atras">
                            <label class="num">517</label>
                            <label class="signo">+</label>
                            <input id="517" name="517" type="text"></input>
                        </div>
                    </div>
                    <div id="bloque518">
                        <label for="518" class="bloque_descripcion">ADQUISICIONES REALIZADAS A CONTRIBUYENTES RISE </label>
                        
                        <div class="bloque margen_adelante_atras">
                            <label class="num">518</label>
                            <label class="signo">+</label>
                            <input id="518" name="518" type="text"></input>
                        </div>
                        
                    </div>
                    <div id="bloque5x9">
                        <label for="519" class="bloque_descripcion">TOTAL ADQUISICIONES Y PAGOS </label>
                        <div class="bloque">
                            <label class="num">519</label>
                            <label class="signo">=</label>
                            <input id="519" name="519" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">519</label>
                            <label class="signo">=</label>
                            <input id="519" name="519" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">529</label>
                            <label class="signo">+</label>
                            <input id="529" name="529" type="text"></input>
                        </div>
                    </div>
                    <div id="bloque531">
                        <label for="531" class="bloque_descripcion">ADQUISICIONES NO OBJETO DE IVA</label>
                        <div class="bloque margen_adelante_atras">
                            <label class="num">531</label>
                            <input id="531" name="5" type="text"></input>
                        </div>
                        
                    </div>
                    <div id="bloque532">
                        <label for="532" class="bloque_descripcion">NOTAS DE CRÉDITO TARIFA 0% POR COMPENSAR PRÓXIMO MES (INFORMATIVO)</label>
                        
                        <div class="bloque margen_adelante_atras">
                            
                            <label class="num">532</label>
                            <input id="532" name="532" type="text"></input>
                        </div>
                        
                    </div>
                    <div id="bloque533_543">
                        <label for="533" class="bloque_descripcion">NOTAS DE CRÉDITO TARIFA 12% POR COMPENSAR PRÓXIMO MES (INFORMATIVO)</label>
                        
                        <div class="bloque margen_adelante">
                            <label class="num">533</label>
                            <input id="533" name="533" type="text"></input>
                        </div>
                        <div class="bloque">
                            <label class="num">543</label>
                            <input id="543" name="543" type="text"></input>
                        </div>
                    </div>
                    <div id="bloque534_544">
                        <label for="534" class="bloque_descripcion">PAGOS NETOS POR REEMBOLSO COMO INTERMEDIARIO (INFORMATIVO)</label>
                       
                        <div class="bloque margen_adelante">
                            <label class="num">534</label>
                            <input id="534" name="534" type="text"></input>
                        </div>    
                        <div class="bloque  ">
                            <label class="num">544</label>
                            <input id="544" name="544" type="text"></input>
                        </div>    
                    </div>
                    

                    <label for="553" class="bloque_descripcion_grande">FACTOR DE PROPORCIONALIDAD PARA CRÉDITO TRIBUTARIO  (411+412+415+416) / 419 </label>
                     <div class="bloque  ">
                            <label class="num">553</label>
                            <input id="553" name="553" type="text"></input>
                    </div>   
                    
                    <label for="554" class="bloque_descripcion_grande">CRÉDITO TRIBUTARIO APLICABLE EN ESTE PERÍODO 
                        (De acuerdo al Factor de Proporcionalidad)      (521+522) x 553</label>
                     <div class="bloque  ">
                            <label class="num">554</label>
                            <label class="signo">=</label>
                            <input id="554" name="554" type="text"></input>
                    </div>  
                    
                    <p id="p2">RESUMEN IMPOSITIVO</p>
                    
                   <label for="601" class="bloque_descripcion_grande">IMPUESTO CAUSADO (Si diferencia campo 499-554 
                       es mayor que cero)</label>
                     <div class="bloque  ">
                            <label class="num">601</label>
                            <label class="signo">=</label>
                            <input id="601" name="601" type="text"></input>
                    </div>  
                    <label for="602" class="bloque_descripcion_grande">CRÉDITO TRIBUTARIO APLICABLE EN ESTE PERÍODO
                        (Si diferencia campo 499-554 es menor que cero) </label>
                     <div class="bloque  ">
                            <label class="num">602</label>
                            <label class="signo">=</label>
                            <input id="602" name="602" type="text"></input>
                    </div>  
                    <label for="605" class="bloque_descripcion_grande">POR ADQUISICIONES E IMPORTACIONES (Traslada 
                        el campo 615 de la declaración del período anterior) </label>
                     <div class="bloque  ">
                            <label class="num">605</label>
                            <label class="signo">(-)</label>
                            <input id="605" name="605" type="text"></input>
                    </div>  
                    <label for="607" class="bloque_descripcion_grande">POR RETENCIONES EN LA FUENTE DE IVA QUE LE
                        HAN SIDO EFECTUADAS (Traslada el campo 617 de la declaración del período anterior)</label>
                     <div class="bloque  ">
                            <label class="num">607</label>
                            <label class="signo">(-)</label>
                            <input id="607" name="607" type="text"></input>
                    </div>  
                    <label for="609" class="bloque_descripcion_grande">(- )RETENCIONES EN LA FUENTE DE IVA QUE LE 
                        HAN SIDO EFECTUADAS EN ESTE PERIODO</label>
                     <div class="bloque  ">
                            <label class="num">609</label>
                            <label class="signo">(-)</label>
                            <input id="609" name="609" type="text"></input>
                    </div>  
                    <label for="611" class="bloque_descripcion_grande">(+) AJUSTE POR IVA DEVUELTO E IVA RECHAZADO 
                        IMPUTABLE AL CREDITO TRIBUTARIO EN EL MES</label>
                     <div class="bloque  ">
                            <label class="num">611</label>
                            <label class="signo">+</label>
                            <input id="611" name="611" type="text"></input>
                    </div>  
                    <label for="615" class="bloque_descripcion_grande">POR ADQUISICIONES E IMPORTACIONES</label>
                     <div class="bloque  ">
                            <label class="num">615</label>
                            <label class="signo">=</label>
                            <input id="615" name="615" type="text"></input>
                    </div>  
                    <label for="617" class="bloque_descripcion_grande">POR RETENCIONES EN LA FUENTE DE IVA QUE LE 
                        HAN SIDO EFECTUADAS</label>
                     <div class="bloque  ">
                            <label class="num">617</label>
                            <label class="signo">=</label>
                            <input id="617" name="617" type="text"></input>
                    </div>  
                    <label for="619" class="bloque_descripcion_grande">SUBTOTAL A PAGAR         Si 601-602-605-607-609+611 > 0</label>
                     <div class="bloque  ">
                            <label class="num">619</label>
                            <label class="signo">=</label>
                            <input id="619" name="619" type="text"></input>
                    </div>  
                    <label for="621" class="bloque_descripcion_grande">IVA PRESUNTIVO DE SALAS DE JUEGO (BINGO MECÁNICOS)
                        Y OTROS JUEGOS DE AZAR </label>
                     <div class="bloque">
                            <label class="num">621</label>
                            <label class="signo">+</label>
                            <input id="621" name="621" type="text"></input>
                    </div>  
                    <label for="699" class="bloque_descripcion_grande">TOTAL IMPUESTO A PAGAR POR 
                        PERCEPCION (619 + 621) </label>
                     <div class="bloque  ">
                            <label class="num">699</label>
                            <label class="signo">=</label>
                            <input id="699" name="699" type="text"></input>
                    </div>  
                    
                    <label for="890" class="bloque_descripcion_grande">PAGO PREVIO  (Informativo)</label>
                     <div class="bloque  ">
                            <label class="num">890</label>
                            <label class="signo">=</label>
                            <input id="890" name="890" type="text"></input>
                    </div> 
                    <p id="p2">DETALLE DE IMPUTACIÓN AL PAGO (Para declaraciones sustitutivas)</p>
                    <div class="subbloquepeqenio">
                        <label for="897" class="bloque_descripcion_pequenio">IMPUESTO</label>
                         <div>
                                <label class="num">897</label>
                                <label class="signo">USD</label>
                                <input id="897" name="897" type="text"></input>
                        </div>
                    </div>
                    <div class="subbloquepeqenio">
                        <label for="898" class="bloque_descripcion_pequenio">INTERÉS</label>
                         <div >
                                <label class="num">898</label>
                                <label class="signo">USD</label>
                                <input id="898" name="898" type="text"></input>
                        </div> 
                    </div>
                    <div class="subbloquepeqenio">
                    <label for="899" class="bloque_descripcion_pequenio">MULTA</label>
                         <div >
                                <label class="num">899</label>
                                <label class="signo">USD</label>
                                <input id="899" name="899" type="text"></input>
                        </div> 
                    </div>
                </div>
                <div id="bloque900">
                    <p id="p3">VALORES A PAGAR Y FORMA DE PAGO (luego de imputación al pago en declaraciones sustitutivas)</p>
                    <label for="902" class="bloque_descripcion_grande">TOTAL IMPUESTO A PAGAR (699-897)</label>
                     <div class="bloque  ">
                            <label class="num">902</label>
                            <label class="signo">+</label>
                            <input id="902" name="902" type="text"></input>
                    </div> 
                    
                    <label for="903" class="bloque_descripcion_grande">INTERÉS POR MORA </label>
                     <div class="bloque  ">
                            <label class="num">903</label>
                            <label class="signo">+</label>
                            <input id="903" name="903" type="text"></input>
                    </div> 
                    <label for="904" class="bloque_descripcion_grande">MULTAS</label>
                     <div class="bloque  ">
                            <label class="num">904</label>
                            <label class="signo">+</label>
                            <input id="904" name="904" type="text"></input>
                    </div> 
                    <label for="999" class="bloque_descripcion_grande">TOTAL PAGADO</label>
                     <div class="bloque  ">
                            <label class="num">999</label>
                            <label class="signo">=</label>
                            <input id="999" name="999" type="text"></input>
                    </div> 
                    <label for="905" class="bloque_descripcion_grande">MEDIANTE CHEQUE, DÉBITO BANCARIO,
                        EFECTIVO U OTRAS FORMAS DE PAGO</label>
                     <div class="bloque  ">
                            <label class="num">905</label>
                            <label class="signo">USD</label>
                            <input id="905" name="905" type="text"></input>
                    </div> 
                    <label for="906" class="bloque_descripcion_grande">MEDIANTE COMPENSACIONES</label>
                     <div class="bloque  ">
                            <label class="num">906</label>
                            <label class="signo">USD</label>
                            <input id="906" name="906" type="text"></input>
                    </div> 
                    <label for="907" class="bloque_descripcion_grande">MEDIANTE NOTAS DE CRÉDITO</label>
                     <div class="bloque  ">
                            <label class="num">907</label>
                            <label class="signo">USD</label>
                            <input id="907" name="907" type="text"></input>
                    </div> 
                    
                    
                    <p id="p4">DETALLE DE NOTAS DE CRÉDITO</p>
                    
                    
                     <div class="bloque_mediano  ">
                            <label class="num">908</label>
                            <label class="signo">N/C No</label>
                            <input id="908" name="908" type="text"></input>
                    </div> 
                    <div class="bloque_mediano  ">
                            <label class="num">910</label>
                            <label class="signo">N/C No</label>
                            <input id="910" name="910" type="text"></input>
                    </div> 
                    <div class="bloque_mediano  ">
                            <label class="num">912</label>
                            <label class="signo">N/C No</label>
                            <input id="912" name="912" type="text"></input>
                    </div> 
                    <div class="bloque_mediano  ">
                            <label class="num">914</label>
                            <label class="signo">N/C No</label>
                            <input id="914" name="914" type="text"></input>
                    </div> 
                    <div class="bloque_mediano  ">
                            <label class="num">909</label>
                            <label class="signo">USD</label>
                            <input id="909" name="909" type="text"></input>
                    </div> 
                    <div class="bloque_mediano  ">
                            <label class="num">911</label>
                            <label class="signo">USD</label>
                            <input id="911" name="911" type="text"></input>
                    </div> 
                    <div class="bloque_mediano  ">
                            <label class="num">913</label>
                            <label class="signo">USD</label>
                            <input id="913" name="913" type="text"></input>
                    </div> 
                    <div class="bloque_mediano  ">
                            <label class="num">915</label>
                            <label class="signo">USD</label>
                            <input id="915" name="915" type="text"></input>
                    </div> 
                    
                    <p id="p5">DETALLE DE COMPENSACIONES</p>
                    
                    <div class="bloque_mediano  ">
                            <label class="num">916</label>
                            <label class="signo">Resol No.</label>
                            <input id="916" name="916" type="text"></input>
                    </div> 
                    
                    <div class="bloque_mediano  ">
                            <label class="num">918</label>
                            <label class="signo">Resol No.</label>
                            <input id="918" name="918" type="text"></input>
                    </div> 
                    
                    <div class="bloque_mediano  ">
                            <label class="num">917</label>
                            <label class="signo">USD</label>
                            <input id="917" name="917" type="text"></input>
                    </div> 
                    
                    <div class="bloque_mediano  ">
                            <label class="num">919</label>
                            <label class="signo">USD</label>
                            <input id="919" name="919" type="text"></input>
                    </div> 
                </div>
                
                <div id="bloquefinal">
                    <p>AL PRECIONAR ACEPTAR ESTÁ DECLARANDO QUE LOS DATOS PROPORCIONADOS EN ESTE DOCUMENTO SON EXACTOS Y VERDADEROS,
                        POR LO QUE ASUME LA RESPONSABILIDAD LEGAL QUE DE ELLA SE DERIVEN (Art. 101 de la L.O.R.T.I.)</p>
                    <div class="bloque_grande  ">
                            <label id="etiquetaNombre">NOMBRE</label>
                            <input id="nombre" name="nombre" type="text"></input>
                            
                           
                    </div> 
                    <div class="bloque_grande  ">
                     <label class="num">198</label>
                            <label id="etiquetaCI">Cédula de Identidad o No. de Pasaporte</label>
                            <input id="198" name="198" type="text"></input>
                    </div>
                    
                    <button id="boton_cancelar" class="botones">CANCELAR</button>
                    <button id="boton_aceptar" class="botones">ACEPTAR</button>
                </div>
                
            </div>
        </div>
    </body>
</html>
