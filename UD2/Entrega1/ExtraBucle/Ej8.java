package ExtraBucle;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia1;
        int dia2;
        int horas = 24;
        System.out.println( "Introduzca el primer día" );
        dia1 = teclado.nextInt();
        System.out.println( "Introduzca el segundo día" );
        dia2 = teclado.nextInt();
        if (dia1 >0 || dia2 >0) {
            if (dia2 < dia1) {
                System.out.println("Su segundo día debe ser superior al segundo");
            } else {
                for (int i = dia1; i <= dia2; i++) {
                    horas = horas + horas;
                }
            }
            if (dia1 < dia2 && dia1 > 0 && dia2 > 0) {
                System.out.println("Entre los días indicados hay un total de: " + horas + " horas");
            }
        }
    }
}
