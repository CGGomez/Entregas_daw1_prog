package Tarea8;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.println( "Introduzca un número le mostraremos su tabal del 1 al 10" );
        num1 = teclado.nextInt();
        if (num1 > 10 || num1 < 1) {

            do {
                System.out.println("Por favor, inserte un número del 1 al 10. Ni más ni menos");
                num1 = teclado.nextInt();
            } while (num1 > 10 || num1 < 0);
        }else {
            for (int i =0; i <= 10; i++) {
                System.out.println(num1 + " X " + i);
                System.out.println(num1 * i);
            }
        }
    }
}
