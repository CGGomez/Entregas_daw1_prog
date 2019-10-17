package Tarea9;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pal1;
        String pal2;

        System.out.println("Introduzca dos palabras. La primera:");
        pal1 = teclado.nextLine();
        System.out.println("Ahora la segunda:");
        pal2 = teclado.nextLine();

        if(pal1.length() < pal2.length()){
            System.out.println( "La primera palabra es menor" );
        }else {
            if (pal1.length() > pal2.length()) {
                System.out.println("La segunda es menor");
            }else{
                System.out.println( "Ambas son iguales" );
           }
        }
    }
}
