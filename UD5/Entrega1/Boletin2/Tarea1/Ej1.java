package Boletin2.Tarea1;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       Pila p1 = new PilaTabla();
       Pila p2 = new PilaLista();
       int num1;

       for (int i = 0; i < 10; i++){
           //num1 = teclado.nextInt();
           p1.apila(i);
       }
        Integer num = p1.desapila();
       while (num != null){
           System.out.println(num);
           num = p1.desapila();
       }

       for (int i = 0; i < 10; i++){
           //num1 = teclado.nextInt();
           p2.apila(i);
       }
        num = p2.desapila();
       while (num != null){
           System.out.println(num);
           num = p2.desapila();
       }
    }
}
