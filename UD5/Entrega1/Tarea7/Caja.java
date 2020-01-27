package Tarea7;

public class Caja {
    public enum Unidades{Cm,m}
    protected final int alto;
    protected final int ancho;
    protected final int profundo;
    protected final Unidades u;
    protected double volume;

    public Caja(int alto, int ancho, int profundo, Unidades u){
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
        this.u = u;
        getVolume();
    }

    public double setVolume(){
        switch(u){
            case Cm:
                volume = (ancho / 100) * (alto / 100) * (profundo / 100);
                break;
            case m:
                volume = ancho * alto * profundo;
                break;
        }
        return volume;
    }

    public double getVolume(){
        return volume;
    }

    @Override
    public String toString(){
        return alto+" x "+ ancho +" x "+ profundo+ " = "+ volume + " m2";
    }
}
