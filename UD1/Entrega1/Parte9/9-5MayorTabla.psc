Algoritmo numMayor
	Dimension comparador[7]
	
	Para i <- 1 hasta 7 Hacer
		Escribir "Introduzca el dato " i
		Leer comparador[i]
	FinPara
	
	Para i<-1 hasta 7 con paso 1 Hacer 		
		Si comparador[i]>mayor Entonces
		    mayor<-comparador[i]
		Fin Si
	FinPara
	
	Escribir "El número mayor es " mayor
FinAlgoritmo
