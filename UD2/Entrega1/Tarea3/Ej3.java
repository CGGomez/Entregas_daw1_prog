package Tarea3;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1;
        double num2;

        System.out.println( "Introduzca el primer número" );
        num1 = teclado.nextDouble();
        System.out.println( "Introduzca el segundo número" );
        num2 = teclado.nextDouble();

        System.out.println( "Su división es un total de: "+ num1/num2 );
    }
}
