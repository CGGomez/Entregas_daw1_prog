package Tarea5;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long num1;
        long num2;
        long num3;
        System.out.println( "Introduzca el primer número" );
        num1 = teclado.nextLong();
        System.out.println( "Introduzca el segundo número" );
        num2 = teclado.nextLong();
        System.out.println( "Introduzca el tercer número" );
        num3 = teclado.nextLong();

        if (num1 > num2 && num1 > num3){
            System.out.println( "El primer número es el mayor" );
        }else {
            if (num2 > num1 && num2 > num3) {
                System.out.println("El segundo número es el mayor");
            } else {
                if (num3 > num1 && num3 > num2) {
                    System.out.println("El tercer número es mayor");
                }else{
                    System.out.println( "Son todos iguales" );
                }
            }
        }
    }
}
