package tarea4;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        int datos[] = new int[10];
        int contador =0;

        for (int i = 0; i <datos.length; i++){
            num1 = teclado.nextInt();
        }
        System.out.println( "Numero de impares descontados: ");
        llenaPares(num1,datos,contador);
    }

    public static int llenaPares(int num1,int datos[],int contador){
        for (int i =0; i < datos.length;i++){
            if (num1 % 2 !=0){
                contador++;
            }else{
                datos[i] = num1;
            }
        }
        return contador;
    }
}
