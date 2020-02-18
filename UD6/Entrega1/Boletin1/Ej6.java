package Boletin1;

import java.io.*;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int opc;
        String nombre;
        System.out.println( "Elija una opción" );
        System.out.println( "1 | Mostrar libro de firmas. 2 | Añadir firma al libro" );
        opc = teclado.nextInt();

        switch (opc){
            case 1:
                muestrafichero();
                break;
            case 2:
                System.out.println( "Introduzca el nombre, si el nombre ya está introducido se le será informado" );
                teclado.next();
                nombre = teclado.nextLine();
                insecionFirma(nombre);
                break;
            default:
        }
    }
    static void muestrafichero() throws IOException {
        try {
            BufferedReader b = new BufferedReader(new FileReader("firmas.txt"));
            String linea = b.readLine();
            while (linea != null){
                System.out.println(linea);
                linea = b.readLine();
            }
            b.close();
        }catch (FileNotFoundException e){
            System.out.println( "Fichero no encontrado" );
        }catch (EOFException e){
            System.out.println( "Fin del archivo" );
        }
    }

    static void insecionFirma(String nombre){
        try{
            BufferedReader b = new BufferedReader(new FileReader("firmas.txt"));
            String name = b.readLine();
            boolean encon = false;
            while (name != null && encon){
                if (name.equals(nombre)){
                    encon = true;
                }
                name = b.readLine();
            }
            b.close();
            if (encon == false){
                BufferedWriter c = new BufferedWriter(new FileWriter("firmas.txt"));
                c.newLine();
                c.write(name);
                System.out.println( "Insertado con éxito" );
            }else {
                System.out.println( "Esta persona ya ha firmado" );
            }
        }catch (IOException e){
            System.out.println( "Error en el archivo" );
        }
    }
}

