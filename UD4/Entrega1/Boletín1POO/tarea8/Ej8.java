package tarea8;

public class Ej8 {
    public static void main(String[] args) {
        Bombilla bom1, bom2;

        bom1 = new Bombilla();
        bom2 = new Bombilla();

        bom1.enciende();
        bom2.apaga();

        System.out.println(bom1.muestradeestado());
        System.out.println(bom2.muestradeestado());
    }
}
