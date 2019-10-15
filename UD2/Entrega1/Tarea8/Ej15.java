package Tarea8;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int j, contaprimo =0;
        boolean primo;

        System.out.println( "Introduzca un número" );
        num1 = teclado.nextInt();

        for (int i = 1; i <= num1; i++) {
            primo = true;
            j= 2;

            while ( j <=i-1 && primo == true ){
                if ( i % j ==0 ){
                    primo = false;
                }
                j++;
            }
            if (primo){
                contaprimo= contaprimo+1;
                System.out.println( i+" Es primo" );
            }
        }
        System.out.println("Hay un total de: "+contaprimo+" números primos");
    }
}
