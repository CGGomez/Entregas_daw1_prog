package Tarea1;

public class Ej1 {
    public static void main(String[] args) {
        Hora h = new Hora( 23, 12);

        System.out.println(h);

        for (int i = 0; i < 13; i++){
            h.inc();
        }
        System.out.println(h);
    }
}
