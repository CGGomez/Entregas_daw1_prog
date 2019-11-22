package EntrgableU3CGG;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int total = 0;
        int filas = 4;
        int columnas = 5;
        int maximo = 5;

        int cuadrante[][] = new int[4][5];

        System.out.println( "Introduzca 20 datos. Se le mostrará la suma total de todos los datos instroducidos" );

        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                num1 = teclado.nextInt();
                total = total + num1;
                cuadrante[i][j] = num1;
            }
        }
        for (int i = 0; i < filas;){
            for (int j = 0; j < columnas;) {
                System.out.print(cuadrante[i][j]);
                System.out.print(" ");
                j++;
                }
            System.out.println( " " );
            i++;
        }
        for (int i = 0; i <= maximo;i++){
            System.out.print( "_" );
            if (i == maximo) {
                System.out.print(total);
            }
        }
    }
}

