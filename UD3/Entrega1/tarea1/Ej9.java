package tarea1;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;

        System.out.println("Introduzca un número, se le buscará los divisores primos que tiene");
        num1 = teclado.nextInt();

        System.out.println("Los Divisores primos son:");
        DivisoresPrimos(num1);
    }

    static void DivisoresPrimos(int num1){
        for (int i = 2; i<= num1;i++){
            if(EsPrimo(i) && num1 % i ==0){
                System.out.println(i);
            }
        }
    }
    static boolean EsPrimo (int num1){
        boolean primo = true;
        int i = 2;
        if(num1 < 2){
            primo = false;
        }
        while ( i < num1 && primo == true){
            if (num1 % i == 0){
                primo = false;
            }
            i++;
        }
        return primo;
    }
}


