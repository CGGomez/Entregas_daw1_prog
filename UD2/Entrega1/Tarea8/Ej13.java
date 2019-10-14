package Tarea8;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int contasus=0;
        int contacond=0;
        int contaprob=0;

        System.out.println( "Introduzca 6 notas de Alumnos" );

        for (int i = 1; i <=6; i++){
            num1 = teclado.nextInt();
            if (num1 > 5){
                contaprob++;
            }
            if (num1 == 4){
                contacond++;
            }
            if (num1 <4){
                contasus++;
            }

        }
        System.out.println( "Aprobados totales: "+ contaprob );
        System.out.println( "Suspensos totales: "+ contasus );
        System.out.println( "Aprobados totales: "+ contacond );
    }
}
