package tarea2;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        final String pre = "Javalín, javalón";
        final String sub = "Javalén, len, len";
        Scanner teclado = new Scanner(System.in);
        String pal1;
        System.out.println("Escribe una frase");
        pal1 = teclado.nextLine();
        boolean idiomaJavanes = false;

        System.out.println(javalinjavalen(pre, sub, pal1, idiomaJavanes));
    }

    static String javalinjavalen (String pre, String sub, String pal1, boolean idiomaJavanes){
        if (pal1.startsWith(pre)){
            idiomaJavanes = true;
            pal1 = pal1.substring(pre.length());
        }else if (pal1.endsWith(sub)){
            idiomaJavanes = true;
            pal1 = pal1.substring(0,pal1.length()-sub.length());
        }

        if (idiomaJavanes){
            pal1 = pal1.trim();
        }else{
            pal1 = "¿Que dice? No entiendo su acento";
        }
        return pal1;
    }
}
