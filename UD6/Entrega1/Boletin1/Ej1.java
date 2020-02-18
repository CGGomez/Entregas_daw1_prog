package Boletin1;

import java.io.*;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner( System.in);
        String namee;
        String texto = "";

        System.out.println( "Introduza nombre del fichero" );
        namee = teclado.nextLine();

        if (namee.isEmpty()){
            namee = "prueba";
        }
        try {
            BufferedReader re = new BufferedReader(new FileReader(namee+".txt"));
            String linea = re.readLine();
            while (linea != null){
                texto = texto + linea+" ";
                linea = re.readLine();
            }

        }catch (FileNotFoundException re){
            System.out.println( "Archivo no encontrado o no existe" );
        }
        catch (IOException re){
            System.out.println( "Fin del archivo" );
        }
        System.out.println(texto);
    }
}
