Algoritmo CuentaPalabra
	Definir frase como Caracter
	Definir contador como entero
	Escribir "Introduzca una frase"
	Dimension palabra[100]
	leer frase
	
	para i <- 1 hasta longitud(frase) hacer
		palabra[i] = subcadena[frase,i,i]
		si palabra[i] = " " entonces
			contador = contador +1
		FinSi
	FinPara
	Escribir "Su frase tien un total de: " contador " palabras"
	
FinAlgoritmo
	