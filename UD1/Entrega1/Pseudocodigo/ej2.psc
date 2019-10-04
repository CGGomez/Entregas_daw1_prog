Algoritmo numeroCambiaPos
	Definir num Como Caracter
	Definir posicion Como Entero
	Definir  newNum Como Caracter
	Dimension datos[100]
	Escribir "Introduzca un número en la tabla"
	Leer  num
	
	Para i <- 1 Hasta Longitud(num)  hacer
		datos[i] = Subcadena(num,i,i)
		Escribir Sin Saltar datos[i]
	FinPara
	
	Escribir "Indique la posición en la que va a sustituir su número"
	Leer posicion
	
	Para i <- 1 Hasta Longitud(num) Hacer
		si i = posicion Entonces
			Leer newNum
			datos[i] = newNum
		FinSi
	FinPara
	
	Para i <- 1 Hasta Longitud(num)  hacer
		Escribir Sin Saltar datos[i]
	FinPara
	
FinAlgoritmo
