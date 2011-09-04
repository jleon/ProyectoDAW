
function mostrarElemento(elemento){
	var ele=document.getElementById(elemento);
	ele.style.visibility="visible";
}

function ocultarElemento(elemento){
	var ele=document.getElementById(elemento);
	ele.style.visibility="hidden";
}

function mostrarEspOtros(elemento,div){
	if(elemento=="Otros...")
		mostrarElemento(div);
	else
		ocultarElemento(div);
}