package Boletin2.Tarea3;

public class Circulo extends Figuras implements Figura {
    public double areas;
    private int radio;
    public Colores colour;

    public Circulo(){
        super();
        radio = 10;
        getArea();
    }

    public Circulo(int radio, Colores colour){
        super();
        this.radio = radio;
        getArea();
    }

    public void setAreas(double areas) {
        this.areas = areas;
    }

    @Override
    public void getArea() {
        areas = Math.PI * (Math.pow(radio,2));
    }

    @Override
    public String toString(){
        String area;
        area = "Area del círculo: "+areas;
        return area;
    }
}
