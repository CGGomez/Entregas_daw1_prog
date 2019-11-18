package tarea1;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int potencia;

        System.out.println( "Introduzca un número" );
        num1 = teclado.nextInt();
        System.out.println( "Ahora su potencia" );
        potencia = teclado.nextInt();

        System.out.println(resultado(num1,potencia));
        System.out.println(resultadorecursivo(num1,potencia));
    }

    public static int resultado(int num1, int num2){
       int potencia =num1;
        if (num1 > 0) {
          for (int i=num1; i <= num2;i++){
              potencia = num1 * potencia;
          }
       }
        return potencia;
    }

    static int resultadorecursivo(int num1, int num2){
       if (num1 > 0) {
           if (num2 == 1) {
               return num1;
           }
       }

       return num1 * resultadorecursivo(num1, num2-1);
    }
}
