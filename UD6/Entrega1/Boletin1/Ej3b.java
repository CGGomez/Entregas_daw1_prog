package Boletin1;

import java.io.*;
import java.util.Scanner;

public class Ej3b {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String archivo;

        System.out.println( "Introduzca el nombre del archivo. Realizaremos una copia de este" );
        archivo = teclado.nextLine();

        try {
            BufferedReader b = new BufferedReader(new FileReader(archivo));
            BufferedWriter w = new BufferedWriter(new FileWriter("copia_de_"+archivo));
            int c = b.read();
            while (c != -1){
                w.write(c);
                c = b.read();
            }
            b.close();
            w.close();
        }catch (FileNotFoundException e){
            System.out.println( "Archivo no encontrado" );
        }
    }
}
