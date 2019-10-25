package PruebaBuclesCondicionCadena;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra;
        System.out.println( "Introduzca una palabra, esta será transformada a un rombo" );
        palabra = teclado.nextLine();

        // Solo he conseguido medio rombo y encima mal hecho. No quiero volver a ver una figura

        int altura = (palabra.length() *2);

        if ( altura < 10){
            for (int i= 1; i<=altura; i++){
                for (int espacios = altura - i; espacios >0; espacios--) {
                    System.out.print(" ");
                }
                for (int lineas = 1; lineas < 2 * i; lineas++) {
                    System.out.print(palabra.charAt(i - 1));
                }
                System.out.println( "" );
            }
            for (int i= altura; i>=1; i--){
                for (int espacios = altura - i; espacios >0; espacios--) {
                    System.out.print(" ");
                }
                for (int lineas = 1; lineas < 2 * i; lineas++) {
                    System.out.print(palabra.charAt(i - 1));
                }
                System.out.println( "" );
            }
        }else{
            for (int i = 1; i <= 10; i++){
                for (int espacios = altura - i; espacios >0; espacios--) {
                    System.out.print(" ");
                }
                for (int lineas = 1; lineas < 2 * i; lineas++) {
                    System.out.print(palabra.charAt(i - 1));
                }
                System.out.println( "" );
            }
        }
    }
}
