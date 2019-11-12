package tarea4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int datos[] = new int[6];

        System.out.println( "Introduzca 6 datos en la primera lista" );

        for (int i=0; i < datos.length; i++){
            System.out.println("Dato de la posición: "+i);
            datos[i] = teclado.nextInt();
        }
        Arrays.sort(datos);

        System.out.println( "Ahora introduzca otros 6 datos en la segunda lista" );
        int segunda[] = new int[6];

        for (int i=0; i < segunda.length; i++){
            System.out.println("Dato de la posición: "+i);
            segunda[i] = teclado.nextInt();
        }
        Arrays.sort(segunda);

        int listaordenada[] = new int[datos.length+segunda.length];

        System.arraycopy( datos, 0, listaordenada, 0, datos.length );
        System.arraycopy( segunda, 0, listaordenada, datos.length, segunda.length );

        Arrays.sort(listaordenada);

        for (int i =0; i < listaordenada.length; i++){
            System.out.println( listaordenada[i] );
        }

    }
}
