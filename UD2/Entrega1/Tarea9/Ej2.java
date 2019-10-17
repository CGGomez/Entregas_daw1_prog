package Tarea9;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pal1;
        String contra;

        System.out.println( "J1 introduzca la contraseña" );
        contra = teclado.nextLine();

        System.out.println( "J2 Intente averiguar la contraseña estas son sus pistas" );
        System.out.println("Longitud: "+contra.length());
        System.out.println("Primera letra: "+contra.charAt(0));
        System.out.println("Primera letra: "+contra.charAt(contra.length()-1));
        pal1 = teclado.nextLine();

        if (!pal1.equals(contra)){
            do {
                System.out.println( "Intentelo otra vez" );
                pal1 =teclado.nextLine();
            }while (!pal1.equals(contra));
        }

        System.out.println( "Lo has conseguido, bien hecho" );
    }
}
