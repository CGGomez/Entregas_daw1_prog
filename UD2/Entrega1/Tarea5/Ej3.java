package Tarea5;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.println( "Introduzca un número, le diremos si es par o impar" );
        num1 = teclado.nextInt();

        if ( num1 % 2 == 0){
            System.out.println( "Su número es par" );
        }else {
            System.out.println( "Su número es impar" );
        }
    }
}
