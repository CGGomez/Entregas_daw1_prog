package PruebaBuclesCondicionCadena;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long num1;
        long comprob;
        long inverso = 0;
        long alveres;

        do {
            System.out.print( "Introduce un número que tenga de mínimo dos cifras y que sea mayor o igual que 10 " );
            num1 = teclado.nextLong();
        } while (num1 < 10);

        comprob = num1;
        while (comprob!=0){
            alveres = comprob % 10;
            inverso = inverso * 10 + alveres;
            comprob = comprob/ 10;
        }

        if(num1 == inverso){
            System.out.println( "Es capicua" );
        }else{
            System.out.println( "No es capicua" );
        }
    }
}

