package ExtraBucle;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int num1;
       String caract;
       System.out.println( "Introduzca el número de filas" );
       num1 = teclado.nextInt();
       System.out.println( "¿Con que caracter debemos pintar la piramide?" );
       caract = teclado.next();

       System.out.println();
        for (int altura = 1; altura <= num1; altura++) {
            for (int blancos = 1; blancos <= num1 - altura; blancos++) {
                System.out.print(" ");
            }

            for (int asteriscos = 1; asteriscos <= (altura * 2) - 1; asteriscos++) {
                System.out.print(caract);
            }
            System.out.println();
        }


    }
}
