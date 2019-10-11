package Tarea8;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int edad;
        int contador=0;
        int mediaedad=0;
        int sumaedad=0;
        int contadoredad=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Introduzca Edades" );
        edad = teclado.nextInt();

        do {
             contador = contador +1;
             sumaedad = sumaedad + edad;
             if( edad >= 18){
                 contadoredad = contadoredad+1;
             }
            edad = teclado.nextInt();
        }while (edad >= 0);
        System.out.println( "Se han contado las edades de "+contador+ " alumnos");
        System.out.println( "Los mayores de edad son "+contadoredad+ " alumnos");
        System.out.println( "La suma total de edad es: "+sumaedad+ " años");
        System.out.println( "La media es de "+sumaedad/contador+ " años");
    }
}
