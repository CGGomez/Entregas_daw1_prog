package UD2;

import java.util.Scanner;

public class Ej3DivisionUsuario {
    public static void main(String[] args) {
        System.out.println( "Tarea 2 Ejercicio 3" );
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print( "Introduzca el primer número: " );
        num1= teclado.nextInt();
        System.out.print( "Introduzca el segundo número: " );
        num2= teclado.nextInt();

        System.out.print( "La división de sus números da un total de: "+ num1/num2 );

    }
}
