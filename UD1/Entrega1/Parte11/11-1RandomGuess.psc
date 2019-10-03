Proceso Adivina_Numero
	Definir intentos como Entero
	Definir x, num como entero

    intentos<-7
    x <- azar(100)+1
    
    Escribir "Adivine el numero (de 1 a 100):"
    Leer num
    Mientras x<>num Y intentos>1 Hacer
        Si x>num Entonces
            Escribir "Muy bajo"
        Sino 
            Escribir "Muy alto"
        FinSi
        intentos <- intentos-1
        Escribir "Le quedan ",intentos," intentos:"
        Leer num
    FinMientras
    
    Si x=num Entonces
        Escribir "Exacto! Usted adivino el número"
    Sino
        Escribir "El numero era: ",x
    FinSi
    
FinProceso