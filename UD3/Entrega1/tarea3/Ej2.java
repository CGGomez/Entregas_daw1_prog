package tarea3;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pal1;

        System.out.println( "Introduzca una frase, contaremos el número de espacios que tiene" );
        pal1 = teclado.nextLine();

        System.out.println( "El número de espacios de su frase son" );
        System.out.println( NumEspacion(pal1) );

    }

    static int NumEspacion(String pal1){
        int numespacios = 0;
        for (int i = 0; i< pal1.length();i++){
            if (pal1.charAt(i) == ' '){
                numespacios++;
            }
        }
        return numespacios;
    }
}
