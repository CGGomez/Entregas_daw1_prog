package Tarea3;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        short nacim;
        short actual;

        System.out.println( "Introduzca su año de nacimiento" );
        nacim = teclado.nextShort();
        System.out.println( "Introduzca el año actual" );
        actual = teclado.nextShort();
        short total = (short) (actual - nacim);
        System.out.print( "Su edad es de: "+ total +" años" );

    }
}
