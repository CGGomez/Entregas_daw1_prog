package Boletin1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ej2 {
    public static void main(String[] args) {
        List<Integer> coleccion = new ArrayList<>();
        int max = 20;
        Integer num;

        for (int i = 0; i < max; i++){
            num = (int) (Math.random()*100);
            coleccion.add(num);
        }
        System.out.println( "Aquí esta su lista ordenado por orden de inserción" );
        System.out.println(coleccion);

        System.out.println( "Y ahora ordenada (Descendiente) para mayor visibilidad" );
        Collections.sort(coleccion, Collections.reverseOrder());
        System.out.println(coleccion);
    }
}
