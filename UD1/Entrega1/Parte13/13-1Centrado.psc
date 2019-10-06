Proceso EscribirCentrado
	Definir mensaje1,mensaje2 Como Caracter;
	Escribir "Introduzca un mensaje"
	Leer mensaje1
	centrar(mensaje1);
	Escribir "Introduzca otro mensaje"
	Leer mensaje2
	centrar(mensaje2);
FinProceso
Funcion centrar(cad)	
Definir i como Entero;
Para i<-0 hasta (40 - (Longitud(cad)/2)) Hacer
	Escribir sin saltar " ";
FinPara
Escribir cad;
//Imprimo un subrayado con "="
Para i<-0 hasta (40 - (Longitud(cad)/2)) Hacer
	Escribir sin saltar " ";
FinPara
Para i<-0 hasta Longitud(cad) Hacer
	Escribir sin saltar "=";
FinPara
Escribir "";
FinFuncion
