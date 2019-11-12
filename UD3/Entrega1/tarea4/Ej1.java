package tarea4;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1;


        double datos[] = new double[5];

        for (int i = 0; i < datos.length; i++){
            num1 = teclado.nextDouble();
            datos[i] = num1;
        }

        for (int i = 0; i < datos.length;i++){
            System.out.println( datos[i] );
        }
    }
}
