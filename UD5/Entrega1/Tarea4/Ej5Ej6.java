package Tarea4;

public class Ej5Ej6 {
    public static void main(String[] args) {
        Campana bell =new Campana();
        bell.add(Instrumento.notas.Do);
        bell.interpretar();

        Piano pi = new Piano();
        pi.add(Instrumento.notas.Do);
        pi.interpretar();
    }
}
