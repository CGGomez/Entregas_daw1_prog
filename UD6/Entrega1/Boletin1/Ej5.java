package Boletin1;


import java.io.*;

public class Ej5 {
    public static void main(String[] args) throws IOException{
        BufferedReader n = new BufferedReader(new FileReader("numeros.txt"));
        int num, max, min;
        String cipher = n.readLine();
        num = Integer.valueOf(cipher);
        max = num;
        min = num;

        cipher = n.readLine();

        while (cipher != null){
            num = Integer.valueOf(cipher);
            if (num > max){
                max = num;
            }
            if (num < min){
                 min = num;
            }
            cipher = n.readLine();
        }
        n.close();

        System.out.println(max);
        System.out.println(min);
    }
}
