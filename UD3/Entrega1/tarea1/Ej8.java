package tarea1;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int contador =0;

        System.out.println( "Introduzca un número, contaremos los primos que son divisores" );
        num1 = teclado.nextInt();

        System.out.println( "El número de divisores primos que hay son:" );
        divisoresPrimos(num1,contador);
    }

    public static int divisoresPrimos(int num1, int diviprimo){
        for (int i =1; i <= num1; i++) {

            int contar =2;
            while (contar != i-1){
                if (i % contar ==0){
                    diviprimo++;
                }
                contar++;
            }
        }
        return diviprimo;
    }
}
