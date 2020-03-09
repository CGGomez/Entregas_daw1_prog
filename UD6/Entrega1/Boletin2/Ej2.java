package Boletin2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ej2 {
    public static void main(String[] args){
        ObjectInputStream in = null;

        try{
            in = new ObjectInputStream(new FileInputStream("Numero.dat"));
            double num = in.readDouble();
            System.out.println("Numero: "+num);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (in != null){
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
