Algoritmo ArrayCVerdFals
	Dimension array[20]
	Dimension array2[20]
	Definir  num Como Entero
	Definir vector Como Entero
	Definir decision Como Entero
	
	Para i<-1 hasta 20 Hacer
		array[i] = num + 1
	FinPara
	
	Escribir "Escriba 1 para revisar en la primera array, escriba 2 para la segunda"
	Leer decision
	
	Segun decision Hacer
		1:
			Para i <- 1 hasta 20 Hacer
				Escribir "Vamos a buscar un entero en el array, introduzca el número en el que va a bsucar" 
				Leer vector
				si array[i] = vector entonces
					Si array[i] <> null entonces
						Escribir "Verdadero"
					SiNo
						Escribir "Falso"
					FinSi
				SiNo
					Escribir "Fuera de rango"
				FinSi
			FinPara
		2:
			Para i <- 1 hasta 20 Hacer
				Escribir "Vamos a buscar un entero en el array, introduzca el número en el que va a bsucar" 
				Leer vector
				si array2[i] = vector entonces
					Si array2[i] = null entonces
						Escribir "Verdadero"
					SiNo
						Escribir "Falso"
					FinSi
				FinSi
			FinPara
		De Otro Modo:
			Escribir "Ha cometido un error al escribir"
	Fin Segun
FinAlgoritmo
