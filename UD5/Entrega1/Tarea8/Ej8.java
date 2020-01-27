package Tarea8;

import Tarea7.Caja;

public class Ej8 {
    public static void main(String[] args) {
        CajaCarton boxcarton = new CajaCarton(12,13,14, Caja.Unidades.Cm);

        boxcarton.etiqueta = " Dirección a enviar ";
        System.out.println(boxcarton);
        System.out.println("Volumen: "+ boxcarton.getVolume());
    }
}
