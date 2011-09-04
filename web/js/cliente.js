/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
var xRequest;
var messageRes="";
var parametros="";
var action;
var id_cliente;

function getXMLHTTPRequest()
{
  xRequest=null;
  if (window.XMLHttpRequest) {
         xRequest=new XMLHttpRequest();
  }
  else if (typeof ActiveXObject != "undefined"){
  xRequest=new ActiveXObject("Microsoft.XMLHTTP");
  }
  return xRequest;
}	

function doActionCliente(action)
{
   //There are no text in the query value
   if (action==null);
         //doSomething(str);
   else
   {         
         //Get valid object
         xRequest = getXMLHTTPRequest();  
         //Get response from server

         xRequest.onreadystatechange=function()
         {
                //Request completed and response                 
                if (xRequest.readyState==4 && xRequest.status==200)
                {
           //To something with that response in text format	                    
                    var lst_cliente=document.getElementById("s_listado_clientes");
                    switch(action){
                        case 0:
                            id_cliente=xRequest.responseText;                            
                        break;
                        case 3:                            
                            setInfoClientesForm(xRequest.responseXML);
                        break;
                        case 4:
                            lst_cliente.innerHTML=xRequest.responseText;
                        break;
                        case 5:
                            lst_cliente.innerHTML=xRequest.responseText;
                        break;
                        default:
                        break;
                    }                   
                }
         }
         //Make the request to server when obtain the response
         var url=getURL();
         
         
         xRequest.open("POST",url+"ClienteCtrl",true);         
         xRequest.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");         
         xRequest.send("action="+ action + "&" +parametros);
   }  
}   

function getURL(){
    
    var rutaAbsoluta = self.location.href;        // http://asdas.asd/uno/dos/index.html
    var posicionUltimaBarra = rutaAbsoluta.lastIndexOf("/");
    var pagina = rutaAbsoluta.substring( 0,posicionUltimaBarra + "/".length);       // index.html
    return pagina;
}


function nuevoCliente(){
    enabledClientesForm();
    limpiarClientesForm();
    document.getElementById("btn_guardar_cliente").removeAttribute("disabled");
    document.getElementById("btn_nuevo_cliente").setAttribute("disabled","disabled");
    document.getElementById("s_listado_clientes").setAttribute("disabled","disabled");
    document.getElementById('nom_cliente_busq').setAttribute("disabled","disabled");
    document.getElementById('btn_cancelar_cliente').removeAttribute("disabled");
    document.getElementById("btn_modificar_cliente").setAttribute("disabled","disabled");
    document.getElementById("seleccionar_cliente").setAttribute("disabled","disabled");
    document.getElementById('nom_cliente_busq').value="";
    document.getElementById("s_listado_clientes").innerHTML="";    
    action=0;
}

function modificarCliente(){
    enabledClientesForm();
    document.getElementById("btn_guardar_cliente").removeAttribute("disabled");
    document.getElementById("btn_modificar_cliente").setAttribute("disabled","disabled");
    document.getElementById('btn_cancelar_cliente').removeAttribute("disabled");
    document.getElementById("seleccionar_cliente").setAttribute("disabled","disabled");
    action=1;
}


function guardarCliente(){
    if(isValidateForm()){
        setParametrosCliente();
        switch(action)
        {
            case 0:
                insertarCliente();
                document.getElementById("btn_nuevo_cliente").removeAttribute("disabled");
                document.getElementById("btn_modificar_cliente").removeAttribute("disabled");
            break;
            case 1:
                actualizarCliente();
                document.getElementById("btn_modificar_cliente").removeAttribute("disabled");
            break;        
            default:
            break;
        }  
        document.getElementById("btn_guardar_cliente").setAttribute("disabled","disabled");    
        document.getElementById("s_listado_clientes").removeAttribute("disabled");
        document.getElementById('nom_cliente_busq').removeAttribute("disabled");
        document.getElementById('btn_cancelar_cliente').setAttribute("disabled","disabled");
        document.getElementById("seleccionar_cliente").removeAttribute("disabled");
    }
}


function insertarCliente(){
    doActionCliente(0);
    alert("Los datos fueron almacenados corectamente..¡");
    disabledClientesForm();
}

function actualizarCliente(){
    doActionCliente(1);
    alert("Los datos fueron actualizados corectamente..¡");
    disabledClientesForm();
    document.getElementById('nom_cliente_busq').value="";
    document.getElementById("s_listado_clientes").innerHTML="";
}

function resetFormCliente(){
    limpiarClientesForm();
    disabledClientesForm();
    
    document.getElementById("btn_guardar_cliente").setAttribute("disabled","disabled");
    document.getElementById("btn_nuevo_cliente").removeAttribute("disabled");
    document.getElementById("s_listado_clientes").removeAttribute("disabled");
    document.getElementById('nom_cliente_busq').removeAttribute("disabled");
    document.getElementById('btn_cancelar_cliente').setAttribute("disabled","disabled");
    document.getElementById("btn_modificar_cliente").setAttribute("disabled","disabled");
    document.getElementById("seleccionar_cliente").removeAttribute("disabled");    
    document.getElementById('nom_cliente_busq').value="";
    document.getElementById("s_listado_clientes").innerHTML="";    
    document.getElementById("abrirPop").blur();
    document.getElementById('nom_cliente_busq').focus();    
}

function setParametrosCliente(){
   var nombre=document.getElementById('nombre_cliente').value;
    var ruc_ci=document.getElementById('ruc_ci_cliente').value;
    var direccion=document.getElementById('dir_cliente').value;
    var telefono=document.getElementById('tlf_cliente').value;
    var id_usuario=document.getElementById('id_usuario').value;
    parametros='nombre_cliente='+nombre+"&ruc_ci_cliente="+ruc_ci+"&dir_cliente="+direccion+"&tlf_cliente="+telefono+"&id_usuario="+id_usuario+"&id_cliente="+id_cliente;
}

function buscarClientes(){
    var nombre=document.getElementById('nom_cliente_busq').value;
    var id_usuario=document.getElementById('id_usuario').value;
    parametros='nombre_buscar='+nombre+'&id_usuario='+id_usuario;
    doActionCliente(4);
    limpiarClientesForm();
    document.getElementById("btn_modificar_cliente").setAttribute("disabled","disabled");
}

function buscarTodosClientes(){    
    var id_usuario=document.getElementById('id_usuario').value;
    parametros='nombre_buscar='+''+'&id_usuario='+id_usuario;
    doActionCliente(5);
    document.getElementById('nom_cliente_busq').value='';
    limpiarClientesForm();
}

function setInfoClientes(){
    var id_cliente=document.getElementById("s_listado_clientes").value;
    parametros='id_cliente='+id_cliente;
    doActionCliente(3);
}

function setInfoClientesForm(xml){
    var tagCliente=xml.getElementsByTagName("cliente")[0];
    document.getElementById('nombre_cliente').value=tagCliente.getAttribute("nombre");
    document.getElementById('ruc_ci_cliente').value=tagCliente.getAttribute("rucci");
    document.getElementById('dir_cliente').value=tagCliente.getAttribute("direccion");
    document.getElementById('tlf_cliente').value=tagCliente.getAttribute("telefono");    
    id_cliente=tagCliente.getAttribute("id");  
    document.getElementById("btn_modificar_cliente").removeAttribute("disabled");
    disabledClientesForm();
}

function limpiarClientesForm(){
    document.getElementById('nombre_cliente').value='';
    document.getElementById('ruc_ci_cliente').value='';
    document.getElementById('dir_cliente').value='';
    document.getElementById('tlf_cliente').value='';    
    document.getElementById('nombre_cliente').focus();
}

function disabledClientesForm(){
    document.getElementById('nombre_cliente').setAttribute("disabled","disabled");
    document.getElementById('ruc_ci_cliente').setAttribute("disabled","disabled");
    document.getElementById('dir_cliente').setAttribute("disabled","disabled");
    document.getElementById('tlf_cliente').setAttribute("disabled","disabled");
}

function enabledClientesForm(){
    document.getElementById('nombre_cliente').removeAttribute("disabled");
    document.getElementById('ruc_ci_cliente').removeAttribute("disabled");
    document.getElementById('dir_cliente').removeAttribute("disabled");
    document.getElementById('tlf_cliente').removeAttribute("disabled");
    document.getElementById('nombre_cliente').focus();
}


function setClienteEnFactura(){
    if(document.getElementById('nombre_cliente').value==''){        
        alert("Seleccione un Cliente asociado a su factura..¡¡¡");
    }
    else{
        document.getElementById('cliente').value=document.getElementById('nombre_cliente').value;        
        document.getElementById('id_cliente').value=id_cliente;        
        document.getElementById('cerrar_popup').click();
    }
    
}


//VALIDACION DE FORMULARIOS

function isValidateForm(){
    var nombre=document.getElementById('nombre_cliente').value;
    var ruc_ci=""+document.getElementById('ruc_ci_cliente').value;
    var direccion=document.getElementById('dir_cliente').value;
    var telefono=""+document.getElementById('tlf_cliente').value;    
     if( validateIsEmpty(nombre) || validateIsEmpty(ruc_ci) || validateIsEmpty(direccion) ||
         validateIsEmpty(telefono)){
         alert("ATENCIÓN: Se requere que todos los campos esten llenos...")
         return false;
     }
     var tam_ruc_ci=ruc_ci.length;
     if( !validateInteger(ruc_ci) || !(tam_ruc_ci==10 || tam_ruc_ci==13)){
         alert("ATENCIÓN: La identificación, ya sea RUC o CI, debe ser totalmente numérica. Si es CI debe tener 10 números y si es RUC debe tener 13...")
         return false;
     }
     
     if( !validateInteger(telefono)){
         alert("ATENCIÓN: El teléfono debe estar compuesto solo de números...")
         return false;
     } 
     return true;
}

function validateIsEmpty(field){
    if(field==null || field=="")
        return true;
    else
        return false;
    
}

function validateInteger(dValidate)
{
  if(dValidate=="")
  {    
    return false;
  }
  else if(isDigits(dValidate)==false)
  {   
   return false;
  }
  return true
}

function isDigits(argvalue) {
    argvalue = argvalue.toString();
    var validChars = "0123456789";
   
    for (var n = 0; n < argvalue.length; n++) {
        if (validChars.indexOf(argvalue.substring(n, n+1)) == -1) return false;
    }
  return true;
}

//AUTOCOMPLETAR



$(function() {
$("#cliente").autocomplete("ClienteCtrl?action=6&id_usuario="+document.getElementById('id_usuario').value, {
                formatItem: function(data) {
                    return data[1];
                },
                formatResult: function(data) {
                    return data[1];
                }
            }).result(function(event, data) {
                if (data) {
                    $("#id_cliente").attr("value", data[0]);
                }
            }).setOptions({
                max: '100%'
            });
    });


