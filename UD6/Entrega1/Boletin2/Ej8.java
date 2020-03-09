package Boletin2;


import java.io.*;
import java.util.Arrays;

public class Ej8 {
    public static void main(String[] args) {
        int Aleat100[] = new int[10];
        ObjectOutputStream out = null;
        ObjectInputStream in = null;

        for (int i =0 ; i < Aleat100.length; i++){
            Aleat100[i] = (int) (Math.random()*100);
        }

        Arrays.sort(Aleat100);
        for (int i =0 ; i < Aleat100.length; i++){
            System.out.println(Aleat100[i]);
        }

        try {
            out = new ObjectOutputStream( new FileOutputStream("Tabla100.dat"));
           out.writeObject(Aleat100);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
              }
        }
        try {
            in = new ObjectInputStream(new FileInputStream("Tabla100.dat"));
            Aleat100 = (int[]) in.readObject();
            System.out.println(Arrays.toString(Aleat100));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
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
