package Tarea8;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println( "Introduzca un mínimo" );
        num1 = teclado.nextInt();
        System.out.println( "Introduzca un máximo" );
        num2 = teclado.nextInt();

        System.out.println( "Ahora introduzca un número comprendido entre estos dos números" );
        num3 =teclado.nextInt();
        do {
            System.out.println( "Vuelvalo a introducir, no está en el rango" );
            num3 =teclado.nextInt();
        }while (num3 < num1 && num3 > num2);
        System.out.println( "Gracias por su colaboración" );
    }
}
