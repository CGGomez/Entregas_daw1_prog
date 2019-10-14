package Tarea8;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arbolalto, esalto;

        int etiquet = 0;
        int alto;

        System.out.println( "Altura del Árbol ("+etiquet+"):" );
        alto = teclado.nextInt();
        arbolalto = alto;
        esalto = 0;
        while ( alto != -1 ){
            if (alto > arbolalto){
                arbolalto = alto;
                esalto = etiquet;
            }
            etiquet++;
            System.out.println( "Altura del Árbol ("+etiquet+"):" );
            alto = teclado.nextInt();
        }

        if( alto == -1 ){
            System.out.println( "Este árbol no existe" );
        }else{
            System.out.println( "El árbol más alto mide: "+ arbolalto );
            System.out.println( "Este árbol tiene la etiqeuta "+ esalto );
        }

    }
}
