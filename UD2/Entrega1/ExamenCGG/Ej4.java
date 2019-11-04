package ExamenCGG;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int suma = 0;
        int max = 0;
        int min = 0;
        int contador = 0;
        boolean primo = false;

        System.out.println("Introduzca una lista de números. Se parará cuando el número intrducido sea primo");
        num1 = teclado.nextInt();
        for (int i = 1; i <= num1; i++) {
            primo = true;
            int j = 2;

            while (j <= i - 1 && primo) {
                if (i % j == 0) {
                    primo = false;
                }
                j++;
            }
        }
        while (!primo) {
            contador++;
            if (num1 > max) {
                max = num1;
            }
            if (num1 < max) {
                min = num1;
            }

            suma = suma + num1;
            num1 = teclado.nextInt();

            for (int i = 1; i <= num1; i++) {
                primo = true;
                int j = 2;

                while (j <= i - 1 && primo) {
                    if (i % j == 0) {
                        primo = false;
                    }
                    j++;
                }
            }
        }

        System.out.println("Los números introducidos no primos son: " + contador);
        System.out.println("Su media es de: " + suma / contador);
        System.out.println("Su valor máximo es: " + max);
        System.out.println("Su valor mínimo es: " + min);

        teclado.close();
    }
}
