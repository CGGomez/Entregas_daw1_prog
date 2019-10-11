package Tarea4;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Introduzca un número decimal" );
        float num1;
        num1 = teclado.nextFloat();
        System.out.println( "Su decimal convertido a entero es: "+ Math.round(num1) );
    }
}
