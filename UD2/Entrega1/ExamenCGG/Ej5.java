package ExamenCGG;

import java.util.Scanner;

public class Ej5 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            String a = "a";
            String e = "e";
            String ii = "i";
            String o = "o";
            String u = "u";


            String cadena;
            boolean vocales = false;
            int contavocal = 0;

            System.out.println( "Introduzca una cadena, se contará el número de vocales que tiene" );
            cadena = teclado.nextLine();

            System.out.println(cadena.length());

            for (int i = 1; i <= cadena.length(); i++){
                if (a.equals(cadena.charAt(i-1))){
                    vocales = true;
                }
                if (e.equals(cadena.charAt(i-1))){
                    vocales = true;
                }
                if (ii.equals(cadena.charAt(i-1))){
                    vocales = true;
                }
                if (o.equals(cadena.charAt(i-1))){
                    vocales = true;
                }
                if (u.equals(cadena.charAt(i-1))){
                    vocales = true;
                }
                if (vocales == true){
                    contavocal= contavocal + 1;
                }
            }
            System.out.println( "En su frase hay un total de: "+contavocal+" vocales" );
        }
}

