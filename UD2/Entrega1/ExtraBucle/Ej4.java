package ExtraBucle;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int contapos = 0;
        int contaneg = 0;
        System.out.println( "Introduzca 10 números" );

        for (int i =1; i <=10; i++){
            num1 = teclado.nextInt();
            if (num1 >= 0){
                contapos++;
            }else {
                contaneg++;
            }
            System.out.println( "Introduzca otro número" );
        }
        System.out.println( "Números positivos: "+ contapos );
        System.out.println( "Números negativos: "+contaneg );
    }
}
