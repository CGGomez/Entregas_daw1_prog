package ExamenCGG;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println( "Introduzca un número" );
        num1 = teclado.nextInt();

        if (num1 >= 10 && num1 <100){

        }else{
            System.out.println( "Su número no es de la longitud mínima requerida" );
        }

        if (num1 >= 100){
            System.out.println( "Inserte la posición en la que se va a dividir el número.");
            System.out.println("Tenga en cuenta que el número no puede ser menor de 2 o mayor que la longitud del número" );
        }
    }
}
