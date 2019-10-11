package Tarea4;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int nota1;
        int nota2;
        System.out.println( "Introduzca dos notas; la primera: " );
        nota1 = teclado.nextInt();
        System.out.println( "La segunda: " );
        nota2 = teclado.nextInt();
        float result = (nota1 + nota2) / 2;
        System.out.println( "La media es de: "+ result );

    }
}
