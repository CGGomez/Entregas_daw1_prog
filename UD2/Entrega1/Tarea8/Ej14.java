package Tarea8;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;

        System.out.println( "Introduzca el tamaño de su piramide" );
        num1 = teclado.nextInt();

        for (int fila =1; fila <= num1; fila++){
            for(int colum = fila; colum <= num1; colum++){
                System.out.print( "* " );
            }
            System.out.println( " " );
        }
    }
}
