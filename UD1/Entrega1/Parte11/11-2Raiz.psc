Algoritmo Raices
	Definir num Como Entero
	Escribir "Introduzca un n�mero"
	
	Leer num
	
	Repetir
		Escribir num^2
		Escribir "Siga introduciendo"
		Leer num
		Si num < 0 Entonces
			Escribir "Introduzca un n�mero mayor que cero"
			leer num
		FinSi
	Hasta Que num = 0
	
FinAlgoritmo
