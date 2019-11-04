package ExamenCGG;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura;

        System.out.println( "Vamos a dibujar un 8 con M, indique la altura. Debe ser mayor que cinco e impar" );
        altura = teclado.nextInt();

        int mitad = altura / 2; //Se supone que con este debería buscar la mitad y escrbir ahí.

        if (altura >= 5 && altura % 2 != 0) {
            for (int i = 1; i <= altura; i++) {
                for (int j = 2; j <= 6; j++) {
                    System.out.print("M");
                }
                System.out.print( "M" );
                System.out.println( " " );
            }
        }else {
            System.out.println( "Su altura no es igual o mayor a cinco o no es un impar" );
        }
    }
}
