package tarea3;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pal1;
        String frase = "";

        System.out.println( "Introduzca palabras. Se escribirá una frase con cada palabra. Se dentendrá cuand se introduzca la palabra fin" );
        pal1 = teclado.nextLine();
        while (!pal1.equals( "fin" )&& !pal1.equals("FIN")&&!pal1.equals("Fin")&&!pal1.equals("fIn")&&!pal1.equals("fiN")){
            frase = frase+ " " + pal1;
            pal1 = teclado.nextLine();
        }

        System.out.println( "Aquí está su frase" );
        System.out.println(frase);
    }
}
