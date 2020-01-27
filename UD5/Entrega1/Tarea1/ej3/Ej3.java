package Tarea1.ej3;

public class Ej3 {
    public static void main(String[] args) {
        HoraExacta he = new HoraExacta(14, 35, 59);
        System.out.println(he);
        for (int i = 0; i < 2; i++){
            he.incre();
        }

        System.out.println(he);
    }
}
