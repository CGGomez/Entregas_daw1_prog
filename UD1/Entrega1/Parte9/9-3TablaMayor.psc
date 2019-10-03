Algoritmo TablaMayor
	Dimension datos[5]
	Definir suma como Entero
	Definir media Como Entero
	para i <-1 Hasta 5 Hacer
		Escribir "Dame el dato ",i
		Leer datos[i]
		Escribir datos[i]
		
	FinPara
	Para  i <- 1 Hasta 5 Hacer
		suma =suma + datos[i]
		
	FinPara
	Escribir suma
	media = suma /5
	Escribir media
	
	Para i<- 1 Hasta 5 Hacer
		Si datos[i] > media Entonces
			Escribir "El dato " i " Que corresponde a " datos[i] " Es mayor que la media"
		SiNo
			Escribir "El dato de la posición " i " Es menor que la meida"
		Fin Si
	Fin Para
FinAlgoritmo