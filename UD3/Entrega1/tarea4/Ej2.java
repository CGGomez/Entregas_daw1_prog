package tarea4;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.println( "Introduzca el tamaño de su Array" );
        num1 = teclado.nextInt();
        teclado.nextLine();
        int datos[] = new int[num1];

        System.out.println( "Introduzca los datos" );
        for (int i = 0; i < datos.length; i++){
            datos[i] = teclado.nextInt();
        }

        for (int i = datos.length-1; i >=0; i--){
            System.out.println(datos[i]);
        }
    }
}
