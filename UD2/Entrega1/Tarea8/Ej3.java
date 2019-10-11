package Tarea8;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aleatorio= (int)(Math.random()*100+1);
        int num1;
        System.out.println( "Hemos generado un número aleatorio. Intente averiguarlo, se rinde escribiendo -1" );
        num1 = teclado.nextInt();

        while ( num1 != aleatorio && num1 != -1){
            if (num1 > aleatorio){
                System.out.println( "Está por encima" );
            }else {
                System.out.println( "Está por debajo" );
            }
            num1 = teclado.nextInt();
        }
        if (num1 == -1){
            System.out.println( "Se ha rendido, el número era "+ aleatorio );
        }
        if (num1 == aleatorio){
            System.out.println( "Enhorabuena, has acertado" );
        }

    }
}
