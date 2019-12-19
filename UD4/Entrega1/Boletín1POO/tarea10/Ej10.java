package tarea10;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int segundos;
        System.out.println( "Introduzca la cantidad de segundos" );
        segundos = teclado.nextInt();

        Hora tiempo = new Hora(12, 59, segundos);

        tiempo.hora_actual();

    }
}
