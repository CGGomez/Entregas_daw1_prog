Algoritmo HoraSueldo
	Definir hora Como Entero
	Definir sueldo como Entero
	Definir  sueldo2 como Entero
	
	Escribir "Introduzca las horas trabajadas:"
	Leer hora
	
	Si hora <= 40 entonces
		Escribir "Usted ha trabajado por " hora " hora/s y su sueldo corresponde a:"
		sueldo = 10 * hora
	SiNo
		si hora >= 41 Entonces
			Escribir "Usted ha trabajado por " hora " hora/s y su sueldo aumenta; ahora corresponde a:"
			sueldo = (40* 10)
			sueldo2 = (hora -40)* 15
			sueldo = sueldo+ sueldo2
		FinSi
	FinSi
	
	Escribir  sueldo
FinAlgoritmo
