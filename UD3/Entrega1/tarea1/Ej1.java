package tarea1;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;

        System.out.println( "Aquí hay eco, ¿Cuantas veces sonará?" );
        num1 = teclado.nextInt();

        eco(num1);
    }
    public static void eco(int num1){
        for (int i =1; i<=num1;i++){
            System.out.println( "Eco..." );
        }
    }
}
