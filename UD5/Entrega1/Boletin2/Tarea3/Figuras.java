package Boletin2.Tarea3;

public class Figuras {
    public int Figures[] = new int[10];
    public int Triangulos[] = new int[5];

    protected int lado;
    protected Colores color;

    public Figuras (){
        lado = 10;
        color = Colores.Azul;
    }

    public Figuras (int lado, Colores color){
        this.lado = lado;
        this.color = color;
     }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }
}
