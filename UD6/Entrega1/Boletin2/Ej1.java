package Boletin2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double num;
        ObjectOutputStream o = null;


        try{
            o = new ObjectOutputStream(new FileOutputStream("Numero.dat"));
            System.out.println( "Introduzca un número comprendido en el valor Double" );
            num = teclado.nextDouble();

            o.writeDouble(num);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (o != null){
                    o.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
