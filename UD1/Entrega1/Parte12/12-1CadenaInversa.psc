Algoritmo NombreAlreves
	Definir nombre Como Caracter
	Dimension inversa[100]
	
	Escribir "Digame su nombre"
	Leer nombre
	Escribir "Su nombre invertido es:"
	cantidad = Longitud(nombre)
	
	para i <-cantidad  hasta 1 hacer
		inversa[i] = subcadena[nombre,i,i]
	FinPara
	
	para i <-cantidad  hasta 1 hacer
		Escribir Sin Saltar inversa[i]
	FinPara
	Escribir " "
FinAlgoritmo
