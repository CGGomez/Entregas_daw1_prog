package EntrgableU3CGG;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int datos[] = new int[10];

        System.out.println( "Introduzca 10 datos en la tabla. Se le añadirán a otra solo con aquellos que contentgan un 7" );
        for (int i = 0; i <datos.length; i++){
            datos[i] = teclado.nextInt();
        }

        for (int i =0; i < datos.length;i++){
            System.out.print(filtracon7(datos));
        }
    }

    static int[] filtracon7(int datos[]){
        int[] solo7 = new  int[10];
        for (int i = 0; i < datos.length; i++){
            if (datos[i] % 10 == 7  ){
                solo7[i] = datos[i];
            }
        }
        return  solo7;
    }
}
