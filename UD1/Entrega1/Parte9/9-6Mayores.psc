Algoritmo sin_titulo
	Dimension datos[2,10]
	
	Para i <-1 hasta 2 Hacer
		para j <- 1 hasta 10 Hacer
			Escribir "Escribe el dato de " i "," j
			Leer  datos[i,j]
		FinPara
	FinPara
	
	mayor_bloque1 <- 0
	mayor_bloque2 <- 0
	
	Para i <-1 hasta 2 Hacer
		para j <- 1 hasta 10 Hacer
			Si datos[i,j]>mayor_bloque1 y i=1  Entonces
				mayor_bloque1<-datos[i,j]
			Fin Si
			Si datos[i,j]>mayor_bloque2 y i=2  Entonces
				mayor_bloque2<-datos[i,j]
			Fin Si
		FinPara
	FinPara
	
	Escribir  mayor_bloque1
	Escribir  mayor_bloque2
	
FinAlgoritmo
