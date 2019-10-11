package Tarea5;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int doce;
        System.out.println( "Introduzca el número 12" );
        doce = teclado.nextInt();

        if (doce == 12){
            System.out.println( "Lo has hecho muy bien" );
        }else{
            System.out.println( "Casi, solo te has confundido de número por completo" );
        }
    }
}
