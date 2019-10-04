Proceso piramide
	
	definir altura,x,i como entero
	
	cont<-"*"
	
	escribir "ingrese altura:"
	leer altura;
	Si altura%2=1 y altura >=3 entonces
		Para  i <-altura hasta 1 con paso -2 hacer
			escribir cont
			si i <=3 Entonces
				Escribir sin bajar cont
				cont<-cont+"*"
			FinSi
			cont<-cont+"*"
		FinPara
	SiNo
		Escribir "Debe ser un número impar y mayor o igual que 3"
	FinSi
FinProceso