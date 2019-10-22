package ExtraBucle;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.println( "Introduzca un número" );
        num1 = teclado.nextInt();

        for (int i = 1; i <=5; i++) {
            System.out.print(num1+" ");
            System.out.print(num1*num1+" ");
            System.out.println(num1*num1*num1+" ");
            num1++;
        }
    }
}
