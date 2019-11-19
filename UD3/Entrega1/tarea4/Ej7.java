package tarea4;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int alumno;
        double media1=0;
        double media2=0;
        double media3=0;
        double mediaalumno=0;
        int tablas = 0;

        int primer[] = new int[5];
        int segundo[] = new int[5];
        int tercer[] = new int[5];

        System.out.println( "Introduzca las notas del primer trimestre" );
        for (int i =0; i < primer.length;i++){
            primer[i] = teclado.nextInt();
            media1 = media1 + primer[i];
            teclado.nextLine();
            if (i == primer.length-1){
                tablas++;
            }
        }
        System.out.println( "Introduzca las notas del segundo trimestre" );
        for (int i =0; i < segundo.length;i++){
            segundo[i] = teclado.nextInt();
            media2 = media2 + segundo[i];
            teclado.nextLine();
            if (i == segundo.length-1){
                tablas++;
            }
        }

        System.out.println( "Introduzca las notas del tercer trimestre" );
        for (int i =0; i < tercer.length;i++){
            tercer[i] = teclado.nextInt();
            media3 = media3 + tercer[i];
            teclado.nextLine();
            if (i == tercer.length-1){
                tablas++;
            }
        }

        System.out.println( "Media del primer trismestre: "+ media1 / (primer.length) );
        System.out.println( "Media del segundo trismestre: "+ media2 / (segundo.length) );
        System.out.println( "Media del primer trismestre: "+ media3 / (tercer.length) );

        System.out.println( "Seleccione un alumno en una posición. Se le hará su propia media. El alumno se selecciona de 0 a 4" );
        alumno = teclado.nextInt();
        teclado.nextLine();
        if (alumno >= 0 && alumno <= 4){
            for (int i = 0; i <= alumno; i++){
                if (i == alumno){
                    mediaalumno = primer[i]+segundo[i]+tercer[i];
                    System.out.print( mediaalumno/tablas);
                }
            }
        }else {
            System.out.print( "Numero fuera del rango, terminando programa" );
        }
    }
}
