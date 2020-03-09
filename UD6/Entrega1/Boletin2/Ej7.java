package Boletin2;

import java.io.*;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;
        ObjectOutputStream out = null;
        ObjectInputStream in = null;

        System.out.println( "Introduzca una frase" );
        frase = teclado.nextLine();
        try {
            out = new ObjectOutputStream(new FileOutputStream("FraseDoc.dat"));
            out.writeObject(frase);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
            }
        }

        try {
            in = new ObjectInputStream(new FileInputStream("FraseDoc.dat"));

            System.out.println((String)in.readObject());
            }catch (EOFException | FileNotFoundException e){
                System.out.println( "Fin del archivo" );
            } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }finally {
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
