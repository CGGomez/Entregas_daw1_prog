package Boletin1;

import java.util.Set;
import java.util.TreeSet;

public class Ej5 {
    public static void main(String[] args) {
        Set<Integer> randomnorep = new TreeSet<>();
        int max = 20;

        while (randomnorep.size() < max){
            randomnorep.add((int)(Math.random()* 100));
        }
        System.out.print(randomnorep);
    }
}
