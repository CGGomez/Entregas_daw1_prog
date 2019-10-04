Algoritmo AzarentreSieteyCinco
	Definir decision Como Entero
	Dimension datos[20]
	
	Para i <-1 hasta 20 hacer
		datos[i] = azar(401)
		Escribir Sin Saltar datos[i] " "
	FinPara
	Escribir " "
	Escribir "Le toca decidir que vamos a hacer con estos números: 1 para mostrar los múltiplos de 5 y 2 para los de 7"
	Leer decision
	
	Segun decision Hacer
		1:
			Para i <- 1 hasta 20 Hacer
				si datos[i]%5=0 Entonces
					Escribir Sin Saltar datos[i] " "
				FinSi
			FinPara
		2:
			Para i <- 1 hasta 20 Hacer
				si datos[i]%7=0 entonces
					Escribir Sin Saltar datos[i] " "
				FinSi
			FinPara
		De Otro Modo:
			Escribir "Solo se admiten números entre 1 y 2, no séas brusco"
	Fin Segun
FinAlgoritmo
