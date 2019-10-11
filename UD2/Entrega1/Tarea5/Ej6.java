package Tarea5;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double gravedad =9.8;
        double tiempo;
        double velocidad;
        System.out.println( "Introduzca la variable de tiempo" );
        tiempo = teclado.nextDouble();

        if (tiempo <= 0){
            System.out.println( "El tiempo es incorrecto, llama a un Doctor" );
        }else{
            velocidad = tiempo * gravedad;
            System.out.println( velocidad );
        }
    }
}
