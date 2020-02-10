package Boletin2.Tarea3;

public class Triangulo extends Figuras implements Figura{

    private int altura;
    public Colores colour;
    double areas;

    public Triangulo(){
        super();
        altura = 10;
        getArea();
      }

    public Triangulo(int altura ,int lado, Colores colour){
        super();
        this.altura = altura;
        getArea();
        setLado(lado);
    }

    public void setArea(double area) {
        this.areas = area;
    }

    @Override
    public void getArea() {
        areas = (lado*altura)/2;
    }

    public int getLado(){return lado;};
    @Override
    public String toString(){
        String area;
        area = "Lado: "+lado+" Altura: "+altura+".Area del triangulo: "+areas;
        return area;
    }
}
