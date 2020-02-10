package Boletin2.Tarea1;

import java.util.Arrays;

public class PilaTabla implements Pila {
    private int cima;
    private Integer[] tabla;

    public PilaTabla() {
        cima = -1;
        tabla = new Integer[10];
    }

    public PilaTabla (int capInic) {
        tabla = new Integer[capInic];
    }

    private boolean PilaVacia() {
        return cima == -1;
    }

    private boolean PilaLlena() {
        return cima == tabla.length;
    }

    Integer Cim() {
        Integer elCima = null;
        if(!PilaVacia()) {
            elCima = tabla[cima];
        }
        return cima;
    }

    Integer desapilo() {
        Integer elem = null;
        if(!PilaVacia()) {
            elem = tabla[cima];
            cima--;
        }
        return elem;
    }

    @Override
    public void apila(int elem) {
        if(PilaLlena()) {
            tabla = Arrays.copyOf(tabla, tabla.length+10);
        }
        cima++;
        tabla[cima] = elem;
    }

    @Override
    public Integer desapila(){
        Integer elem = null;
        if (!PilaVacia()){
            elem = tabla[cima];
            cima--;
        }
        return elem;
    }

    @Override
    public String toString() {
        String resul ="";
        for(int i =0; i <= cima; i++) {
            resul += tabla[cima]+ " ";
        }
        resul +=cima;
        return resul;
    }
}
