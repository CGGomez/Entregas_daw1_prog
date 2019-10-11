package Tarea5;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println( "Introduzca el primer número" );
        num1 = teclado.nextInt();
        System.out.println( "Introduzca el segundo número" );
        num2 = teclado.nextInt();

        if ( num1 %  2== 0 && num2 % 2==0 ) {
            System.out.println("Ambos son pares");
        }

        if (num1 % 2 != 0 && num2 %2 != 0) {
            System.out.println("Ambos son impares");
        }else{
            System.out.println( "Uno es impar" );
        }


    }
}
