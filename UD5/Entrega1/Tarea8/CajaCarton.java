package Tarea8;

import Tarea7.Caja;

public class CajaCarton extends Caja {

    static double totalcarton;
    protected double area;
    protected String etiqueta;

    public CajaCarton(int alto, int ancho, int profundo, Unidades u){
        super(alto, ancho, profundo, u);
        area = 2 * (alto * ancho * profundo);
        totalcarton += area;
    }

    public double getArea() {
        return area;
    }

    @Override
    public double getVolume(){
        return volume +0.8;
    }

    @Override
    public String toString(){
        String res = "Carton total: "+ totalcarton+" cm2\n";
        res = "Area: "+ area+" ";
        res += super.toString();
        return res;
    }
}
