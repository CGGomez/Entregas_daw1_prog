package ExtraBucle;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.print( "Introduzca la altura de su L: " );
        num1 = teclado.nextInt();

        int altura = num1 /2;
        for (int i = 1; i <= altura; i++){
            System.out.println( "*" );
            if (i == altura){
                for (int j =1; j <= num1; j++){
                    System.out.print( "*" );
                }
            }
        }
    }
}

