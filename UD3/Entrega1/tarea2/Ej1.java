package tarea2;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pal1;
        String pal2;
        String larga = null;

        System.out.println( "Introduzca la primera palabra" );
        pal1 = teclado.next();
        System.out.println( "Ahora introduzca la segunda" );
        pal2 = teclado.next();

        System.out.println( "La palabra más larga es:" );
        System.out.println( palabralarga(pal1,pal2,larga));


    }
    static String palabralarga (String pal1, String pal2, String larga){
        if (pal1.length() > pal2.length()){
            larga = pal1;
        }else if (pal1.length() < pal2.length()){
            larga = pal2;
        }else{
            System.out.println( "Ambas son iguales" );
        }
        return  larga;
    }
}
