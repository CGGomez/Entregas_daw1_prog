package ExamenUD3;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long num1;
        long num2;

        System.out.println("Introduzca el primer número");
        num1 = teclado.nextLong();
        System.out.println("Ahora el segundo número");
        num2 = teclado.nextLong();

        System.out.println("La unión de ambos números es igual a: ");
        System.out.println(juntaNumeros(num1,num2));
    }
    public static long juntaNumeros(long num1, long num2){
       long num3 = 0;
       while ( num1 >=1){
           num3 = num1 / 10;
       }
       num3 = num2+num3;
       return num3;
    }
}
