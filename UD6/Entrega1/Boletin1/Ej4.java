package Boletin1;

import java.io.*;

public class Ej4 {
    public static void main(String[] args) throws IOException {
        int conLetr= 0;
        int conLine= 0;
        int conPal = 0;
        try {
            BufferedReader c = new BufferedReader( new FileReader("carta.txt"));

            int d = c.read();
            while (d != -1){
                if ((char) d ==' '){
                    conLetr++;
                    conPal++;
                }else  if ((char)d =='\n'){
                    conPal++;
                    conLine++;
                }else{
                    conLetr++;
                }
                d = c.read();
            }
            c.close();
            if (conPal > 0){
                conPal++;
            }
            if (conLine > 0){
                conLine++;
            }

        }catch (EOFException e){
            System.out.println( "Fin del archivo" );
        }
        System.out.println( "Total de caracteres: "+conLetr );
        System.out.println( "Total de palabras: "+conPal );
        System.out.println( "Total de lineas: "+conLine );
    }
}
