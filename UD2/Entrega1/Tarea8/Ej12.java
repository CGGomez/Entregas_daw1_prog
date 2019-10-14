package Tarea8;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int contasus=0;
        System.out.println( "Introduzca 5 notas de usuario" );

        for (int i = 1; i <=5; i++){
            num1 = teclado.nextInt();
            if (num1 < 5){
                contasus++;
            }

        }
        if (contasus >= 1){
            System.out.println( "Hay suspensos o solo uno" );
        }else{
            System.out.println( "Clase limpia" );
        }
    }
}
