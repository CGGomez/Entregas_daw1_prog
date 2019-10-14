package Tarea8;

public class Ej7 {
    public static void main(String[] args) {
        double product = 1;

        for (int i =1; i < 20; i +=2){
            product = product * i;
        }
        System.out.println( "El producto de los primeros 10 impares es: "+ product );
    }
}
