Algoritmo num_aleat
	Definir num_at1 Como Entero
	Definir  num_at2 Como Entero
	num_at1 = azar(100+1);
	num_at2 = azar(100+1);
	
	Escribir "Adivine la suma de los siguientes números aleatorios"
	Escribir num_at1
	Escribir num_at2
	
	Definir  sum Como Entero
	Leer sum
Mientras sum <> num_at1+num_at2 Hacer
	Escribir "Ha fallado, vuelva a intentarlo" 
	Leer sum;
FinMientras
Escribir "Ha acertado, gracias por jugar"
FinAlgoritmo
