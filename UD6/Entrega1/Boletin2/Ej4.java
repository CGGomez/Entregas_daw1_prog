package Boletin2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tam;
        double num;
        ObjectOutputStream o = null;

        System.out.println( "Introduzca tamaño de Array" );
        tam = teclado.nextInt();

        int ArrNum[] = new int[tam];

        try {
            o = new ObjectOutputStream(new FileOutputStream("TablaBinaria.dat"));
            System.out.println( "Introduzca número en la tabla. Numeros requeridos: "+tam );
            for (int i = 0; i < ArrNum.length; i++){
                num = teclado.nextInt();
                num = ArrNum[i];

            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
