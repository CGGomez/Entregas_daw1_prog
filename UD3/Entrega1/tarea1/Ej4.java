package tarea1;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Introduzca el primer número");
        num1 = teclado.nextInt();
        System.out.println("Introduzca el segundo número");
        num2 = teclado.nextInt();
        System.out.println( "El número mayor es:" );
        System.out.println(smayor(num1,num2));
    }

    static int smayor(int num1, int num2){
        if (num1 > num2){
            return num1;
        }else if (num2 > num1){
            return num2;
        }else{
            System.out.println( "Vaya. Ninguno es mayor" );
        }
        return num1;
    }
}
