package ExamenUD3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        String onlycap;

        int capicua[] = new int[10];

        for (int i = 0; i < capicua.length;i++){
            do {
                System.out.println( "Intoduzca el dato "+i );
                num1 = teclado.nextInt();
            }while (num1 < 10);
            if (num1 >= 10){
                capicua[i] = num1;
            }
        }

        Arrays.toString(filtraCapicuas(capicua));
        System.out.println( "Array, solo con los capicua" );
        onlycap = Arrays.toString(filtraCapicuas(capicua));
        System.out.print(onlycap);

    }

    public static int[] filtraCapicuas(int capicua[]){
        int onlycap[] = new int[10];
        boolean cap = false;
        for (int i = 0; i < capicua.length; i++){
            int comprob = capicua[i];
            int inverso = 0;
            while (comprob!=0){
                int alveres = comprob % 10;
                inverso = inverso * 10 + alveres;
                comprob = comprob/ 10;
                cap = true;
            }
            if (inverso == capicua[i] && cap == true){
                onlycap[i] = inverso;
            }
        }
        for (int i =0; i < onlycap.length;i++){
            if (onlycap[i] ==0 && cap){
                onlycap[i] = -1;
            }
        }
        return onlycap;
    }
}
