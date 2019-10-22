package ExtraBucle;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.println( "Introduzca un número de dos crifras" );
        num1 = teclado.nextInt();

        if (num1 >= 10) {
            String str = String.valueOf(num1);
            String rpta = " ";

            char[] valor = str.toCharArray();

            for (int i = valor.length - 1; i > -1; i--) {
                rpta += valor[i] + " ";
            }
            System.out.println(rpta);
        }
    }
}
