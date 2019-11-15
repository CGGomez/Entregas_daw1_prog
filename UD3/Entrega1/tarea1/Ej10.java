package tarea1;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0, num1, num2;
        System.out.print("Introduce primer número: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce segundo número: ");
        num2 = teclado.nextInt();

        amigos(num1,num2,suma);
    }
    public static void amigos(int num1, int num2, int suma){
        for(int i=1;i<num1;i++){
            if(num1%i==0){
                suma=suma+i;
            }
        }
        if(suma==num2){
            suma=0;
            for(int i=1;i<num2;i++){
                if(num2%i==0){
                    suma=suma+i;
                }
            }
            if(suma==num1){
                System.out.println("Son Amigos");
            }else{
                System.out.println("No son amigos");
            }
        }
        else{
            System.out.println("No son amigos");
        }
    }
}