package Tarea5;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.println( "Introduzca un número entero. Identificaremos si es positivo o noegativo" );
        num1 = teclado.nextInt();

        if (num1 >= 0) {
            System.out.println("Es positivo");
        }else {
            System.out.println("Es negativo");
        }
    }

}
