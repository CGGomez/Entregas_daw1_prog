package Boletin2.Tarea3;

public class Cuadrado extends Figuras implements Figura{
    public double areas;
    public Colores colour;

    public Cuadrado(){
        super();
        colour = Colores.Azul;
        getArea();
    }

    public Cuadrado(int lado, Colores colores){
        super();
        getArea();
        setLado(lado);
    }

    public void setAreas(double areas) {
        this.areas = areas;
    }

    @Override
    public void getArea() {
        areas = Math.pow(lado,2);
    }

    public int getLado(){return lado;};
    @Override
    public String toString(){
        String area;
        area = "Area total del cuadrado: "+areas;
        return area;
    }
}
