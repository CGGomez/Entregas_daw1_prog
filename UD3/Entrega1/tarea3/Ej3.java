package tarea3;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pal1;
        char caracter;
        String NoVocales="";

        System.out.println( "Introduzca su nombre, se le quitarán las vocales" );
        pal1 = teclado.nextLine();

        for (int i =0; i < pal1.length();i++){
            caracter = pal1.charAt(i);

            if (!hayvocal(caracter)) {
                NoVocales= NoVocales + caracter;

            }
        }
        System.out.println( NoVocales );

    }
    static boolean hayvocal(char caracter){
        boolean EsVocal = false;
        String vocal = "aeiouáéíóúAEIOUÁÉÍÓÚ";

       if ( vocal.indexOf(caracter) == -1){
           EsVocal = false;
       }else {
           EsVocal = true;
       }

            return EsVocal;
    }
}
