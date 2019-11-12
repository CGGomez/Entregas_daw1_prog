package tarea4;

import java.util.Arrays;

public class Ej6 {
    public static void main(String[] args) {
        int datos[], sinrepes[] ={1,3,6,3,7,9,1,7,5};

        datos = norepes(sinrepes);

        System.out.println(Arrays.toString(datos));
    }

    static int[] norepes(int datos[]){
        int copia[] = Arrays.copyOf(datos, datos.length);

        int elementos = datos.length;
        int i =0;

        while (i < elementos){
            int buscar = copia[i];
            int j = 0;
            while ( j< i && copia[j] != buscar){
                j++;
            }
            if (j < i){
                copia[i] = copia[elementos -1];
                elementos--;
            }else{
                i++;
            }
        }
        return Arrays.copyOf(copia,elementos);
    }
}
