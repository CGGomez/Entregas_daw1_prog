package EntrgableU3CGG;

public class Ej4 {
    public static void main(String[] args) {

        int Numeros[] ={1,2,3,4,5,6,7,8,9,10};

        System.out.print( "Hemos recibido su Array, lo convertiremos a un String de una sola linea" );
        System.out.print(convierteArrayEnString(Numeros));
    }

    public static String convierteArrayEnString(int[] Numeros){
        String numeroenString = " ";
        for (int i = 0; i < Numeros.length; i++){
            numeroenString += Numeros[i];
        }
        return numeroenString;
    }
}
