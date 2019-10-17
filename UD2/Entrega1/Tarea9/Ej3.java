package Tarea9;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pal1;
        String contra;

        System.out.println( "J1 introduzca la contraseña" );
        contra = teclado.nextLine();

        System.out.println
                ( "J2 Intente averiguar la contraseña; se le dirá si su palabra está por encima alfabeticamente o por debajo");
        pal1 = teclado.nextLine();

        do {
            int compar = contra.compareTo(pal1);
            if (compar ==0){
                System.out.println( "Enhorabuena, la has acertado" );
            }else if (compar <0){
                System.out.println( "La contraseña es menor que tu palabra" );
            }else{
                System.out.println( "La contraseña es mayor" );
            }
            pal1 = teclado.nextLine();
        }while (!pal1.equals(contra));
    }
}
