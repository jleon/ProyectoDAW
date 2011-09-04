/*
 * jQuery CSS popUp
 * http://dixso.net/
 *
 * Copyright (c) 2009 Julio De La Calle Palanques
 *
 * Date: 2009-03-27 12:34:00 - (Viernes, 27 Mar 2009)
 * 
 * Modificado por: Pedro Lucas
 */
 
 function sizeBrowserWorkArea() {
  var myWidth = 0, myHeight = 0;
  if( typeof( window.innerWidth ) == 'number' ) {
    //Non-IE
    myWidth = window.innerWidth;
    myHeight = window.innerHeight;
  } else if( document.documentElement && ( document.documentElement.clientWidth || document.documentElement.clientHeight ) ) {
    //IE 6+ in 'standards compliant mode'
    myWidth = document.documentElement.clientWidth;
    myHeight = document.documentElement.clientHeight;
  } else if( document.body && ( document.body.clientWidth || document.body.clientHeight ) ) {
    //IE 4 compatible
    myWidth = document.body.clientWidth;
    myHeight = document.body.clientHeight;
  }
  var array= new Array();
  array[0]=myWidth;
  array[1]=myHeight;  
  return array;
}
 
 function widthBrowserWorkArea(){
	var array = sizeBrowserWorkArea();
	return (array[0]);
 }
 
 function heightBrowserWorkArea(){
	var array = sizeBrowserWorkArea();
	return (array[1]);
 }
 
 
//Variable que almacenar� la posici�n del scroll, por defecto tiene valor 0.
var scrollCachePosition = 0;
var isOpen=0;
$(function() {
	$("#abrirPop").click(function(event) {
                isOpen=1;
		scrollCachePosition = $(window).scrollTop();
		//Env�o el scroll a la posici�n 0 (left), 0 (top), es decir, arriba de todo.
		window.top.scroll(0,0);

		//Si el body es mas grande que la capa 'wrapper' incrementa la altura del body a la capa 'capaPopUp'.
		if ($("body").outerHeight()>$("#wrapper").outerHeight()){
			var altura=$("body").outerHeight();
	    }else{
		//Si la capa 'wrapper' es m�s grande que el body incrementa la altura de la capa 'wrapper' a la capa 'capaPopUp'.
			var altura=$("#wrapper").outerHeight();
		}
		if(altura<heightBrowserWorkArea())
			altura=heightBrowserWorkArea();
                else
                    altura+=20;
		window.document.getElementById("capaPopUp").style.height=altura+"px";
		event.preventDefault();
		//Muestro la capa con el efecto 'slideToggle'.
		$("#capaPopUp").slideToggle();

		//Calculo la altura de la capa 'popUpDiv' y lo divido entre 2 para darle un margen negativo.
		var altura=$("#popUpDiv").outerHeight();
		$("#popUpDiv").css("margin-top","-"+parseInt(altura/2)+"px");
		
		//Calculo la anchura de la capa 'popUpDiv' y lo divido entre 2 para darle un margen negativo.
		var anchura=$("#popUpDiv").outerWidth();		
		$("#popUpDiv").css("margin-left","-"+parseInt(anchura/2)+"px");
		
		//Muestro la capa con el efecto 'slideToggle'.
		$("#popUpDiv").slideToggle();
	});
	$(".cerrar").click(function(event) {
                isOpen=0;
		event.preventDefault();
		//Cierro las capas con el efecto 'slideToggle'.
		$("#capaPopUp").slideToggle();
		$("#popUpDiv").slideToggle();
		//Si la variable scrollCachePosition es mayor que 0 incrementar� la posici�n del scroll al valor que se almacen�. 
		if (scrollCachePosition > 0) {
			window.top.scroll(0,scrollCachePosition);
			//Reseteamos la variable scrollCachePosition a 0 para poder ejecutar el script tantas veces sea necesario.
			scrollCachePosition = 0;
		}
	});
});

function alertkey(e)
{
        if( !e )
        {
                if( window.event )
                {
                        //Internet Explorer
                        e = window.event;
                }
                else
                {
                        return;
                }
        }
        if( typeof( e.keyCode ) == 'number'  )
        {
                //DOM
           e = e.keyCode;
        } else if( typeof( e.which ) == 'number' )
        {
          //NS 4 compatible
           e = e.which;
        } else if( typeof( e.charCode ) == 'number'  )
        {
          //also NS 6+, Mozilla 0.9+
           e = e.charCode;
        } else
        {
          //total failure, we have no way of obtaining the key code
          return;
        }
        if(e==27)
        {
            //alert("Has presionado la tecla Escape ;-) ")
            if(isOpen==1)//si esta abierto
                document.getElementById('cerrar_popup').click();
        }
}
