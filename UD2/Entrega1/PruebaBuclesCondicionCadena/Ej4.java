package PruebaBuclesCondicionCadena;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.println( "Introduzca un número impar mayor o igual a 3. No se aceptan los números pares; no molan" );
        num1 = teclado.nextInt();

        if (num1 %2 != 0){

        for (int i = num1; i < 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print( "*" );
        }
            System.out.println( "" );
        }
        for (int i = num1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print( "*" );
            }
            System.out.println( "" );
        }
        }else{
            System.out.println( "Su número no es impar o mayor que 3. Por favor introduzca el valor adecuado" );
        }
    }
}
