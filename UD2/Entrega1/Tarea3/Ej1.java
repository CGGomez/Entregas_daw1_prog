package Tarea3;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte num1;
        byte num2;

        System.out.println( "Introduzca el primer número" );
        num1 = teclado.nextByte();
        System.out.println( "Introduzca el Segundo número" );
        num2 = teclado.nextByte();
        byte res = (byte) (num1 + num2);
        System.out.print( "La suma total es de "+ res );
    }
}
