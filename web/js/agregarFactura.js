/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
    $(".a_retencion").click(function(){
        $("#retencion_container").slideToggle("slow");        
    });
    $("#retencion_container").css({display: 'none'});
});

function onlyIntegerNumbers(evt)
{
    var keyPressed = (evt.which) ? evt.which : evt.keyCode
    if (keyPressed == 8 || 
        keyPressed == 37 || 
        keyPressed == 38 || 
        keyPressed == 39 || 
        keyPressed == 40 || 
        keyPressed == 46 ) return true; 
    return !(keyPressed > 31 && (keyPressed < 48 || keyPressed > 57));
}

function NumCheckFloat2(e, field) { 
    key = e.keyCode ? e.keyCode : e.which ;
    var str="wefs";
    
    // backspace, up, down, left, rigth, delete
    if (key == 8 || 
        key == 37 || key == 38 || key == 39 || key == 40 || key == 46 ) return true; 
    // 0-9 
    if (key > 47 && key < 58) {         
        if (field.value == "") return true;
        regexp = /^[0-9]+$/;
        if(regexp.test(field.value))
            return true;
        regexp = /.[0-9]{2}$/;
        return !(regexp.test(field.value));
    } 
    // . 
    if (key == 46) { 
        if (field.value == "") return false;
        regexp = /^[0-9]+$/;
        return regexp.test(field.value);
    } 
    // other key 
    
    return false;
    
} 

function onlyFloat2Numbers(e, field) { 
    key = e.keyCode ? e.keyCode : e.which ;
    if(key==9 && !NumCheckFloat2(e, field))
        return(true);
    return(NumCheckFloat2(e, field));
}


//comprbante de retencion
function esValidoComprobanteRetencion(){
    var nro_retencion=document.getElementById("nro_retencion");    
    
    var iva_anio=document.getElementById("iva_ejerc_fiscal_anio");   
    var iva_mes=document.getElementById("iva_ejerc_fiscal_mes");   
    var iva_base=document.getElementById("iva_base_imponible"); 
    var iva_porc=document.getElementById("iva_porc_retencion"); 
    var iva_valor=document.getElementById("iva_valor_retenido"); 
    
    var ir_anio=document.getElementById("ir_ejerc_fiscal_anio");   
    var ir_mes=document.getElementById("ir_ejerc_fiscal_mes");   
    var ir_base=document.getElementById("ir_base_imponible"); 
    var ir_porc=document.getElementById("ir_porc_retencion"); 
    var ir_valor=document.getElementById("ir_valor_retenido"); 
    
    var total=document.getElementById("total_retenido");
    
    if(!((nro_retencion.value!="" && nro_retencion.value!="0") && total.value!="" &&
    ((iva_anio.value!="" &&
    iva_mes.value!="" &&
    iva_base.value!="" &&
    iva_porc.value!="" &&
    iva_valor.value!="")|| (ir_anio.value!="" &&
    ir_mes.value!="" &&
    ir_base.value!="" &&
    ir_valor.value!="" &&
    ir_porc.value!="" )))){
        alert("Complete los datos necesarios los cuales son: Nro comprobante, todos los datos del IVA \n\
                    o todos los datos del IR o ambos, y el total retenido");
        return false;
    }else
        return true;   
    
}

function limpiarComprobanteRetencion(){
    document.getElementById("limpiar_retencion_file").click();
    document.getElementById("nro_retencion").value="0";     
    document.getElementById("iva_ejerc_fiscal_anio").value="";   
    document.getElementById("iva_ejerc_fiscal_mes").value="";   
    document.getElementById("iva_base_imponible").value="0.00";   
    document.getElementById("iva_porc_retencion").value="0.00";   
    document.getElementById("iva_valor_retenido").value="0.00";   
    
    document.getElementById("ir_ejerc_fiscal_anio").value="";   
    document.getElementById("ir_ejerc_fiscal_mes").value="";   
    document.getElementById("ir_base_imponible").value="0.00";   
    document.getElementById("ir_porc_retencion").value="0.00";   
    document.getElementById("ir_valor_retenido").value="0.00";    
    
    document.getElementById("total_retenido").value="0.00";   
}

function cancelarComprobanteRetencion(){
    $(".a_retencion").click();
    limpiarComprobanteRetencion();
}

function agregarComprobanteRetencion(){
    if(esValidoComprobanteRetencion()){
        document.getElementById("comprobante_retencion").style.display="none";    
        document.getElementById("comprobante_retencion_agregado").style.display="block";    
        document.getElementById("label_nro_comprobante").innerHTML=document.getElementById("nro_retencion").value;    
        document.getElementById("label_total_retenciones").innerHTML=document.getElementById("total_retenido").value;    
        document.getElementById("retencion_container").id="x_retencion_container";
    }
}

function modificarComprobanteRetencion(){
   document.getElementById("comprobante_retencion").style.display="block";    
   document.getElementById("comprobante_retencion_agregado").style.display="none";    
   document.getElementById("x_retencion_container").id="retencion_container";
}

function eliminarComprobanteRetencion(){
   document.getElementById("comprobante_retencion").style.display="block";    
   document.getElementById("comprobante_retencion_agregado").style.display="none";     
   document.getElementById("x_retencion_container").id="retencion_container";
   cancelarComprobanteRetencion();
}

function ocultarEliminarComprobante(){
   if(document.getElementById("comprobante_retencion_agregado").style.display=="none")
    limpiarComprobanteRetencion();
}

$(function() {
    $("#limpiar_retencion_file").click(function(event){
      event.preventDefault();
      $("#img_retencion").replaceWith("<input type='file' id='img_retencion' name='img_retencion' value='Subir Escaneado'/>");
    });
});



