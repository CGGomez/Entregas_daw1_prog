package tarea1;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;

        System.out.println( "Introduzca un número, contaremos los primos que son divisores" );
        num1 = teclado.nextInt();

        System.out.println( "El número de divisores primos que hay son:" );
        System.out.println(divisoresPrimos(num1));
    }

    public static int divisoresPrimos(int num1){
        int contador = 1;
        for (int i = 2; i<= num1;i++){
            if(EsPrimo(i) && num1 % i ==0){
                contador++;
            }
        }
        return (contador);
    }
    static boolean EsPrimo (int num1){
        boolean primo = true;
        int i = 2;
        if(num1 < 2){
            primo = false;
        }
        while ( i < num1 && primo == true){
            if (num1 % i == 0){
                primo = false;
            }
            i++;
        }
        return primo;
    }
}
