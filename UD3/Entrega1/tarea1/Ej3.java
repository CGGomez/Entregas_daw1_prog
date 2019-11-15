package tarea1;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        float altura;
        float radio;

        System.out.println("Introduzca el radio");
        radio = teclado.nextFloat();
        System.out.println("Introduzca la altura");
        altura = teclado.nextFloat();

        System.out.println("Escoja una opción: 1- Calcular Area | 2- Calcular Volumen");
        num1 = teclado.nextInt();

        do {
            switch (num1){
                case 1:
                    area(radio,altura);
                    break;
                case 2:
                    volumen(radio,altura);
                    break;
                default:
                    System.out.println( "Opción no válida" );
                    break;
            }
        }while (num1 >= 3);
    }

    static void area(float altura, float radio){
        System.out.println(2*Math.PI*radio*(radio+altura));
    }

    static void volumen(float altura, float radio){
        System.out.println(Math.PI*Math.pow(radio,2)*altura);
    }
}
