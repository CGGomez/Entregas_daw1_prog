package Tarea4;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        System.out.println( "Introduzca tres notas; la primera: " );
        nota1 = teclado.nextDouble();
        System.out.println( "La segunda: " );
        nota2 = teclado.nextDouble();
        System.out.println( "La tercera: " );
        nota3 = teclado.nextDouble();
        double result = (nota1 + nota2 + nota3) / 3;
        System.out.println( "La media es de: "+ result );
    }

}
