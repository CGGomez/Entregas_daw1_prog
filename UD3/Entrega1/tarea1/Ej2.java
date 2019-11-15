package tarea1;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Introduzca el primer número");
        num1 = teclado.nextInt();
        System.out.println("Introduzca el segundo número");
        num2 = teclado.nextInt();
        System.out.println( "Escribiremos los numeros que estén entre ambos" );
        lista(num1,num2);
    }

    static void lista(int num1,int num2){
       if (num1 < num2){
           for (int i = num1; i <= num2;i++){
               System.out.println(i);
            }
        }else{
           System.out.println( "El primer número debe ser menor que el segundo" );
       }
    }
}
