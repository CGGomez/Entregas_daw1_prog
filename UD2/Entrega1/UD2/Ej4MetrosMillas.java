package UD2;

import java.util.Scanner;

public class Ej4MetrosMillas {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Tarea 2 Ejercicio 4" );
        int metros = 1609;
        int millas;
        System.out.println( "Introduzca su cantidad en millas, será cambiado al correspondiente en metros" );
        millas = teclado.nextInt();

        System.out.println( millas+" millas corresponde a un total de: "+ millas*metros+ " metros.");


    }
}
