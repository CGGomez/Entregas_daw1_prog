package Tarea3;

import java.util.Scanner;

public class Ej4 {public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    float metros = (float) 1.609;
    float millas;

    System.out.println( "Introduzca su cantidad en millas, será cambiado al correspondiente en metros" );
    millas = teclado.nextFloat();

    System.out.println("Sus millas corresponden a: "+ millas*metros+ "Km");

    }
}
