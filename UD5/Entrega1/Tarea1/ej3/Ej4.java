package Tarea1.ej3;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int min;
        int hou;
        int sec;

        HoraExacta a = new HoraExacta(12,35,12);

        System.out.println( "Introduzca las horas" );
        hou = teclado.nextInt();
        System.out.println( "Introduzca los minutoss" );
        min = teclado.nextInt();
        System.out.println( "Introduzca los segundos" );
        sec = teclado.nextInt();

        HoraExacta compare = new HoraExacta(hou,min,sec);

        System.out.println(compare.equals(a));
    }
}
