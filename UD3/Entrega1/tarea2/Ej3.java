package tarea2;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String password;
        String respuesta;
        boolean acierto = false;

        System.out.println( "J1 introduzca la contraseña" );
        password = teclado.next();

        System.out.println ( "J2 Intente averiguar la contraseña; se le dirá si su palabra está por encima alfabeticamente o por debajo");
        respuesta = teclado.next();

        if (passCorrecta(password,respuesta,acierto)==true){
            System.out.println( "Enhorabuena has acertado" );
        }else{
            System.out.println(passCorrecta(password,respuesta,acierto));
        }

    }

    static boolean passCorrecta (String password, String respuesta, boolean acierto){
            int compar = password.compareTo(respuesta);
            if (compar ==0){
                acierto = true;
            }else if (compar <0 && acierto == false){
                System.out.println( "La contraseña es menor que tu palabra" );
            }else if (compar >0 && acierto == false){
                System.out.println( "La contraseña es mayor" );
            }
        return acierto;
    }
}
