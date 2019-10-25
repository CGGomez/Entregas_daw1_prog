package PruebaBuclesCondicionCadena;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1;
        double num2;
        double num3;

        System.out.println("Resultado del primer examen: ");
        num1 = teclado.nextDouble();
        System.out.println("Resultado del segundo examen: ");
        num2 = teclado.nextDouble();
        System.out.println("Resultado del tercer examen: ");
        num3 = teclado.nextDouble();
        teclado.nextLine();

        double media = ( num1 + num2 + num3 )  / 3;

        if (media >=5 && media <6 ){
            System.out.println( "Tu nota de programación es: "+media+" suficiente" );
        }else if (media >=6 && media <7){
            System.out.println( "Tu nota de programación es: "+media+" Bien" );
        }else if (media >=7 && media <9){
            System.out.println( "Tu nota de programación es: "+media+" Notable" );
        }else if( media >= 9){
            System.out.println( "Tu nota de programación es: "+media+" Sobresaliente" );
        }

        String apto = "apto";
        String noapto= "no apto";

        if (media < 5){
            System.out.println( "El alumno ha hecho la recuperación ¿Es apto o no apto? " );
            String resul = teclado.nextLine();
            if (resul.equals(apto)){
                media = 5;
                System.out.println( "Ha resultado apto, su nota es: "+ media );
            }else if (resul.equals(noapto)){
                System.out.println( "No ha resultado apto, se mantiene su meida: "+ media );
            }
        }

    }
}
