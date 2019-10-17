package Tarea9;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        final String pre = "Javalín, javalón";
        final  String sub = "Javalén, len, len";
        Scanner teclado = new Scanner(System.in);
        String pal1;
        System.out.println( "Escribe una frase" );
        pal1 = teclado.nextLine();

        boolean idiomaJavanes = false;
        if (pal1.startsWith(pre)){
            idiomaJavanes = true;
            pal1 = pal1.substring(pre.length());
        }else if (pal1.endsWith(sub)){
            idiomaJavanes = true;
            pal1 = pal1.substring(0,pal1.length()-sub.length());
        }

        if (idiomaJavanes){
            pal1 = pal1.trim();
            System.out.println(pal1);
        }else{
            System.out.println( "¿Que dice? No entiendo su acento" );
        }
    }
}
