package Tarea9;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pal1;
        int posicion;

        System.out.println( "Introduzca una frase" );
        pal1 = teclado.nextLine();

        posicion = pal1.length() / 2;

        System.out.println(posicion);

        for(int i =0; i <=pal1.length();i++){
            if (i == posicion && pal1.charAt(i) == ' '){
                System.out.println( "Aquí hay un espacio" );
            }else if (i == posicion && pal1.charAt(i) != ' ' ) {
                System.out.println( "La letra es: "+ pal1.charAt(posicion) );
            }
        }
    }
}
