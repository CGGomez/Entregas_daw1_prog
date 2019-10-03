Algoritmo alternandoletras
	Escribir "Dime una palabra"
	Leer palabra
	Para i<-1 Hasta longitud(palabra) Hacer
		p<-subcadena(palabra,i,i)
		Si j%2=1  Entonces
			Escribir Sin Saltar Mayusculas(p)
		Sino
			Escribir Sin Saltar Minusculas(p)
		finsi
	Fin Para
FinAlgoritmo
