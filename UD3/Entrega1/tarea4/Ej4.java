package tarea4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;

        System.out.println("Introduzca tamaño de la contraseña");
        num1 = teclado.nextInt();

        int datos[] = new int[num1];

        for (int i =0; i <datos.length;i++){
            datos[i] = (int) (Math.random()*5)+1;
        }
        System.out.println("la contraseña se ha generado. Intente solucionarlo");
        int result[] = new int[num1];

       do {
            for (int i = 0; i < num1; i++) {
                System.out.println( "Dato de la posición: "+ i );
                result[i] = teclado.nextInt();
                if (result[i] > datos[i]) {
                    System.out.println("El dato es mayor");
                } else if (result[i] < datos[i]) {
                    System.out.println("El dato es menor");
                } else {
                    System.out.println("El dato es correcto, mantengalo");
                }
            }
        } while (!Arrays.equals(datos,result));
       System.out.println( "Enhorabuena, lo ha conseguido" );
    }
}
