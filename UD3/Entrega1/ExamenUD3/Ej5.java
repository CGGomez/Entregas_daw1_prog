package ExamenUD3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fila = 6;
        int columna = 6;
        String encortezado;

        int cortezo[][] = new int[6][4];

        for (int i = 0; i < fila;i++){
            for (int j = 0; j < columna;j++){
                System.out.println( "Introduzca el dato de "+i+","+j );
                cortezo[i][j] = teclado.nextInt();
            }
        }
        encortezado = Arrays.toString(corteza(cortezo));
        System.out.print(encortezado);
    }
    public static int[] corteza(int cortezo[][]){
        int externo[] = new int[16];

        for (int i = 0; i < externo.length;i++){
            for (int j = 0; j < 6; j++){
                for (int k = 0; k < 4; k++){
                    if (j < 6 && k ==0){
                        externo[i]=cortezo[j][k];
                    }else if (j == 5 && k == 3){
                        externo[i]=cortezo[j][k];
                    }
                }
            }
        }
        return externo;
    }
}
