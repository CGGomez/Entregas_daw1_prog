package Boletin2;

import java.io.*;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int contado = 0;
        ObjectOutputStream o = null;
        ObjectInputStream in = null;


        try {
            o = new ObjectOutputStream(new FileOutputStream("VarioNumero.dat"));
            System.out.println("Introduzca un número comprendido en el valor Double");
            num = teclado.nextInt();
            while (num >= 0) {
                o.writeInt(num);
                num = teclado.nextInt();
                contado++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (o != null) {
                    o.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            in = new ObjectInputStream(new FileInputStream("VarioNumero.dat"));
            for (int i = 0; i < contado; i++) {
                int x = in.read();
                System.out.println(x);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }
}
