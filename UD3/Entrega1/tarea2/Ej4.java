package tarea2;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pal1;
        int posicion;
        boolean esespacio = false;

        System.out.println( "Introduzca una frase" );
        pal1 = teclado.nextLine();

        posicion = (pal1.length()-1) / 2;

        System.out.println(posicion);

        if (EsEspacio(pal1,posicion,esespacio)==true){
            System.out.println( "Aquí hay un espacio" );
        }else{
            System.out.println( "En esta posición no hay espacio" );
        }
    }
    static boolean EsEspacio(String pal1, int posicion, boolean esespacio){
        for(int i =0; i <=pal1.length();i++){
            if (i == posicion && pal1.charAt(i) ==' '){
                    esespacio = true;
            }
        }
        return esespacio;
    }
}
