package Boletin1;

import java.io.*;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        final int cada = 24;
        int counted = 0;
        try {
            BufferedReader b = new BufferedReader(new FileReader("carta.txt"));
            String linea = b.readLine();
            while (linea != null){
                System.out.println(linea);
                counted++;
                if (counted == cada){
                    System.out.println();
                    System.out.println( "Pulse enter para continuar..." );
                    teclado.nextLine();
                    System.out.println();
                    counted = 0;
                }
                linea = b.readLine();
            }
            b.close();
        }catch (EOFException e){

        }catch (IOException e){

        }
    }
}
