package tarea2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String password;
        String respuesta;
        boolean acierto = false;

        System.out.println( "J1 introduzca una contraseña" );
        password = teclado.next();
        System.out.println( "J2, intente averiguar la contraseña; estas son sus pistas" );
        System.out.println( password.length() );
        System.out.println( password.charAt(0));
        System.out.println( password.charAt(password.length()-1));

        respuesta = teclado.next();

        if (AciertaPassword(password,respuesta,acierto)== true){
            System.out.println( "Ha acertado" );
        }else {
            System.out.println( "Ha fallado" );
        }
    }

    static Boolean AciertaPassword(String password, String respuesta, boolean acierto){
        if (respuesta.equals(password)){
            acierto = true;
        }
    return acierto;
    }
}
