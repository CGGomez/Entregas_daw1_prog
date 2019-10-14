package Tarea8;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        double factorial = 1;

        System.out.println( "Introduzca un número" );
        num1 = teclado.nextInt();

        for (int i = num1; i > 0; i--){
            factorial = factorial * i;
        }
        System.out.println( "El factorial de "+num1+ " es: "+factorial );
    }
}
