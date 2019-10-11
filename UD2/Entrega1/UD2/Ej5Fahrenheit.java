package UD2;

import java.util.Scanner;

public class Ej5Fahrenheit {
    public static void main(String[] args) {
        System.out.println( "Tarea 2 Ejercicio 5" );
        Scanner teclado = new Scanner(System.in);
        double gradosC;
        double gradosF;
        System.out.println( "Introduce la cantidad en grados Centígrados:" );
        gradosC = teclado.nextDouble();
        gradosF = 32 + ( 9 * gradosC / 5 );
        System.out.println( "Su cantidad introducida corresponde a: ");
        System.out.println( gradosC +" ºC = " + gradosF + " ºF" );
    }
}
