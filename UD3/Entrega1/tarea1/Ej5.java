package tarea1;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("Introduzca el primer número");
        num1 = teclado.nextInt();
        System.out.println("Introduzca el segundo número");
        num2 = teclado.nextInt();
        System.out.println("Y ahora un tercero");
        num3 = teclado.nextInt();
        System.out.println( "El número mayor es:" );
        System.out.println(mayor3s(num1,num2,num3));
    }

    static int mayor3s(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            return num1;
        }else if (num2 > num1 && num2 > num3){
            return num2;
        }else if (num3 > num1 && num3 > num2){
            return num3;
        }
        return num1;
    }
}
