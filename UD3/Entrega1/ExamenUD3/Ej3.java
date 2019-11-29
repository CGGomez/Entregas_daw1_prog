package ExamenUD3;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cod;
        String morse = " ";
        System.out.println( "Introduzca un código de números. No se admiten negativos o caracteres" );
        cod = teclado.nextLine();



        System.out.println( "Su código morse está listo." );
        System.out.println(convierteEnmorse(cod,morse));

    }
    public static String convierteEnmorse(String cod, String morse){
        String one = "1";
        String two = "2";
        String three = "3";
        String four = "4";
        String five = "5";
        String six = "6";
        String seven = "7";
        String eigth = "8";
        String nine = "9";
        String zero = "0";

        for (int i = 0; i< cod.length(); i++){
            if (zero.equals(cod.charAt(i))){
                morse = morse+ "_ _ _ _ _";
            }
            if (one.equals(cod.charAt(i))){
                morse = morse+ ". _ _ _ _";
            }
            if (two.equals(cod.charAt(i))){
                morse = morse+ ". . _ _ _";
            }
            if (three.equals(cod.charAt(i))){
                morse = morse+ ". . . _ _";
            }
            if (four.equals(cod.charAt(i))){
                morse = morse+ ". . . . _";
            }
            if (five.equals(cod.charAt(i))){
                morse = morse + ". . . . .";
            }
            if (six.equals(cod.charAt(i))){
                morse = morse+"_ _ _ _ .";
            }
            if (seven.equals(cod.charAt(i))){
                morse =morse+ "_ _ _ . .";
            }
            if (eigth.equals(cod.charAt(i))){
                morse =morse+ "_ _ . . .";
            }
            if (nine.equals(cod.charAt(i))){
                morse = morse+"_ . . . .";
            }
        }

        return  morse;
    }
}
