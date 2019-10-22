package ExtraBucle;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pass = 1234;
        int num1;

        System.out.println( "Tiene 4 intentos para abrir la caja fuerte. Inserte su combinación" );
        num1 = teclado.nextInt();

        for (int i = 3; i >=1; i--){
            if (num1 != pass){
                System.out.println( "Prueba otra vez" );
                num1 = teclado.nextInt();
            }
        }
        if(num1 == pass) {
            System.out.println("Bienvenido");
        }else{
            System.out.println( "Lo siento, ha fallado" );
        }
    }
}
