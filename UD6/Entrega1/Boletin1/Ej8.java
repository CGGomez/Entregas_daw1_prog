package Boletin1;

import java.io.*;

public class Ej8 {
    public static void main(String[] args) throws IOException {
        try{
            BufferedReader p1 = new BufferedReader(new FileReader("Perso1.txt"));
            BufferedReader p2 = new BufferedReader(new FileReader("Perso2.txt"));
            BufferedWriter all = new BufferedWriter(new FileWriter("MezclaPerso.txt"));

            String n1 = p1.readLine();
            String n2 = p2.readLine();

            while (n1 != null && n2 != null){
                if (n1.compareTo(n2) < 0){
                    all.write(n1);
                    all.newLine();
                    n1 = p1.readLine();
                }else {
                    all.write(n2);
                    all.newLine();
                    n2 = p2.readLine();
                }
            }
            if (n1 != null){
                while (n2 != null){
                    all.write(n1);
                    all.newLine();
                    n2 = p2.readLine();
                }
            }else {
                while (n1 != null){
                    all.write(n1);
                    all.newLine();
                    n1 = p1.readLine();
                }
            }
            p1.close();
            p2.close();
            all.close();
        }catch (EOFException e){
            System.out.println( "Fin del archivo" );
        }catch (FileNotFoundException e){
            System.out.println( "Archivo no encontrado" );
        }
    }
}
