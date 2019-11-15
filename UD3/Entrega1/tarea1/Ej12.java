package tarea1;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;

        System.out.print( "Indique un número, devolveremos su factorial" );
        num1 = teclado.nextInt();

        System.out.print(factorial(num1));
    }

    static int factorial(int num1){
        int factoria = num1;

        if (num1 == 0){
            factoria = 1;
        }else {
            factoria =factoria*factorial(num1 -1);
        }
        return factoria;
    }
}
