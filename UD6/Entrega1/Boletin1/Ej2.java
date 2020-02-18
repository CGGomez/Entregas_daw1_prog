package Boletin1;

import java.io.*;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        String nombre;

        System.out.println( "Introduzca su nombre" );
        nombre = teclado.nextLine();
        System.out.println( "Introduzca su edad" );
        edad = teclado.nextInt();

        try {
            BufferedWriter w = new BufferedWriter(new FileWriter("datos.txt"));
            w.write( "Nombre: "+nombre);
            w.newLine();
            w.write( "Edad: "+edad );
            w.close();
        }catch (EOFException e){
            System.out.println( "Fin del Archivo" );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
