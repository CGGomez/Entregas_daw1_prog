package EntrgableU3CGG;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;

        int mesa[] ={3,4,0,2,1,3,2,1,0,2};

        System.out.println("¿Cuantos son? [-1 para abandonar el programa]");
        System.out.println("Tenga en cuenta que solo admitimos grupos de hasta 4 personas");
        num1 = teclado.nextInt();

        while (num1 > 4) {
                System.out.println("No pueden acceder, son más de 4. Intentelo de nuevo");
                num1 = teclado.nextInt();
        }
        if (num1 != -1 && num1 < 4){
            System.out.println( "Estas son sus mesas disponibles" );
        }


        if (num1 <= 4 && num1 != -1){
            for (int i = 0; i < mesa.length; i++){
                    if (num1 + mesa[i] <=4) {
                        System.out.println( "Mesa "+ i);
                        System.out.println( mesa[i] );
                    }else{
                        System.out.println( "Esta mesa no admite más comensales" );
                    }
                }
            }
        if (num1 == -1){
            System.out.println( "Vuelva algún día" );
        }

    }
}
