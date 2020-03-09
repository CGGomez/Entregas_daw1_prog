package Boletin2;

import java.io.*;

public class Ej6 {
    public static void main(String[] args) {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("DoblesNum.dat"));
            try {
                while (true){
                    System.out.println(in.readDouble());
                }
            }catch (EOFException e){
                System.out.println( "Fin del archivo" );
            }
        }catch (FileNotFoundException e){

        } catch (IOException e) {
            System.out.println(e.getMessage());
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
