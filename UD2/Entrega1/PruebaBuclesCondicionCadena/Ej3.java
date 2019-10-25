package PruebaBuclesCondicionCadena;

import java.util.Scanner;

public class Ej3 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println( "Ingrese un número en el sistema decimal positivo" );
            int num1 = teclado.nextInt();
            String binario = "";
            if ( num1 > 0 ) {
                while ( num1 > 0 ) {
                    if ( num1 % 2 == 0 ) {
                        binario = "0" + binario;
                    } else {
                        binario = "1" + binario;
                    }
                    num1 = (int) num1 / 2;
                }
            } else if (num1 == 0) {
                binario = "0";
            } else {
                binario = "No se pudo convertir el numero. Ingrese solo números positivos";
            }
            System.out.println( "El número convertido a binario es: " + binario );
        }
}
