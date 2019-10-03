Algoritmo matrizxy
	Dimension v1[3]
	Dimension v2[3]
	Dimension total[3]
	
	Escribir "Inroduce los valores para v1 y v2]"
	Para i<-1 Hasta 3  Hacer
		Escribir "v1"
		Leer v1[i]
		Escribir "v2"
		Leer v2[i]
	Fin Para
	
	Para i = 1 hasta 3 Hacer
		total[i] = v1[i] + v2[i]
		Escribir total[i]
	FinPara
FinAlgoritmo
