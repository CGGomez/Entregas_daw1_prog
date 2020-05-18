package Boletin1;

import java.util.*;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;

        System.out.println( "Introduzca una frase con aplabras separadas por espacios" );
        frase = teclado.nextLine();
        String palabreria[] = frase.split(" ");
        List<String> palabras = new ArrayList<String>();

        for (String p : palabreria){
            palabras.add(p);
        }
        Set<String> repelab = new LinkedHashSet<>();
        List<String> copia = new ArrayList<>(palabras);

        while (copia.size() > 0){
            String temp = copia.remove(0);
            if (copia.contains(temp)){
                repelab.add(temp);
            }
        }
        System.out.println( repelab );
    }
}
