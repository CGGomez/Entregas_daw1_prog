package Tarea8;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.println( "Introduzca un número, lo leeremos hasta llegar a dicho número" );
        num1 = teclado.nextInt();

        for(int i =1; i <= num1; i++){
            System.out.println( i );
        }
    }
}
