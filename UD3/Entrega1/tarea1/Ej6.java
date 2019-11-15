package tarea1;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String letra;

        System.out.println( "Escriba una letra, se le dirá si es o no una vocal" );
        letra = teclado.nextLine();
        System.out.println(vocalverdad(letra));

    }
    static boolean vocalverdad (String letra){
        boolean es_vocal = false;

        if(letra.equals("a") ||letra.equals("e") || letra.equals("i") ||letra.equals("o")||letra=="u"
                ||letra.equals("A") ||letra.equals("E") || letra.equals("I") ||letra.equals("O")||letra.equals("U")){
            es_vocal = true;
        }

        return es_vocal;
    }
}
