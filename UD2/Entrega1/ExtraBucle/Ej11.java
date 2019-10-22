package ExtraBucle;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;

        System.out.print( "Introduzca un número impar mayor o igual a 3: " );
        num1 = teclado.nextInt();

        if (( num1%2 != 0) && num1 >=3){
            for (int i =0; i <= num1; i++){
                for (int j =0; j <=num1; j++) {
                    if ((i ==j) || (j+i == num1)){
                         System.out.print( "*" );
                    }else{
                        System.out.print( " " );
                    }
                }
                System.out.println( "" );
            }
        }else{
            System.out.print( "Ha elegido un  número no impar o no mayor de 3" );
        }
    }
}
