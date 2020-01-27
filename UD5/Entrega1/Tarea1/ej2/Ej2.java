package Tarea1.ej2;

public class Ej2 {
    public static void main(String[] args) {
        Hora12 h12 = new Hora12(14,35, Hora12.Meridia.AM);
        System.out.println(h12);

        for (int i = 0; i < 2; i++){
            h12.inc();
        }
        System.out.println(h12);
    }
}
