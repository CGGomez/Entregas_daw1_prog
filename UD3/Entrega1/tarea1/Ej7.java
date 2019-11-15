package tarea1;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        boolean primo = true;

        System.out.println( "Introduzca un número, se le dirá si es primo o no" );
        num1 = teclado.nextInt();

        if (numprimo(num1,primo)==true){
            System.out.println( "Es primo" );
        }else {
            System.out.println( "No es primo" );
        }
    }

    public static boolean numprimo(int num1, boolean primo){
        primo = true;
        int j = 2;

        while (j <= num1 - 1 && primo) {
            if (num1 % j == 0) {
                primo = false;
            }
            j++;
        }
        return primo;
    }
}
