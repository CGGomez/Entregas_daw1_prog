package tarea4;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int contacero = 0;
        int contapositivo = 0;
        int contanegativo = 0;
        int medianegativa = 0;
        int mediapositiva = 0;
        System.out.println( "Introduzca el tamaño de su Array" );
        num1 = teclado.nextInt();
        teclado.nextLine();
        int datos[] = new int[num1];

        System.out.println( "Introduzca los datos" );
        for (int i = 0; i < datos.length; i++){
            datos[i] = teclado.nextInt();
            if ( datos[i] ==0){
                contacero++;
            }
            if (datos[i] <= -1){
                medianegativa = medianegativa - datos[i];
                contanegativo++;
            }
            if (datos[i]>0 && datos[i] !=0){
                mediapositiva = mediapositiva + datos[i];
                contapositivo++;
            }
        }
        if (contanegativo !=0){
            System.out.println( "Media de los números negativos: "+  medianegativa / contanegativo );
        }
        if ( contapositivo !=0){
            System.out.println( "Media de los números positivos: "+  mediapositiva / contapositivo );
        }
        System.out.println( "Número de ceros introducidos: "+ contacero );
    }
}
