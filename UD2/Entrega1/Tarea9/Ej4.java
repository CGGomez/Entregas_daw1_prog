package Tarea9;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pal1;

        System.out.println( "Introduzca una palabra" );
        pal1 = teclado.nextLine();

        if (" " == (pal1.charAt(pal1.length()) / 2)){
            System.out.println("En esta posición hay un espacio");
        }
        else{
            System.out.println( "El caracter de esta posición es: "+ pal1.charAt(pal1.length()/2) );
        }
    }
}
