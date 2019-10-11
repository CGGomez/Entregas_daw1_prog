package Tarea8;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        int num1;
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Introduzca un número" );
        num1 = teclado.nextInt();

        do {
            if (num1 %2 ==0){
                System.out.println( "Es par" );
            }
            if (num1 > 0){
                System.out.println( "Es positivo" );
            }
            int cuadrado = num1*num1;
            System.out.println( cuadrado );
            System.out.println( "Introduzca otra vez" );
            num1 = teclado.nextInt();
        }while (num1 != 0);
        System.out.println( "Ha introducido un 0, se interrumpe la sesión" );
    }
}
