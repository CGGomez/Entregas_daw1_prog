package Boletin1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ej3 {
    public static void main(String[] args) {
        List<Integer> coleccion = new ArrayList<>();
        int max = 20;
        Integer num;

        for (int i = 0 ; i < max; i++){
            num = (int) (Math.random() * 10);
            System.out.print(num+" ");
            coleccion.add(num);
            Collections.sort(coleccion);
        }
        System.out.println( "Lista ordenada de números" );
        System.out.println(coleccion);
    }
}
