package Boletin2.Tarea3;

import java.util.Arrays;
import java.util.Comparator;

public class Ej3 {
    public static void main(String[] args) {
        Figuras figurasGeometricas[] = new Figuras[5];
        int contadorPoligonos = 0;
        Triangulo t = new Triangulo();
        Cuadrado c = new Cuadrado();
        Circulo cir = new Circulo();
        Triangulo t2 = new Triangulo(12,10,Colores.Naranja);
        Cuadrado c2 = new Cuadrado(4,Colores.Verde);


        figurasGeometricas[0] = t;
        figurasGeometricas[1] = c;
        figurasGeometricas[2] = cir;
        figurasGeometricas[3] = c2;
        figurasGeometricas[4] = t2;

        for (int i = 0; i < figurasGeometricas.length; i++) {
            System.out.println(figurasGeometricas[i]);
        }
        Figuras tri[] = new Figuras[5];

        Triangulo tris = new Triangulo(12,12,Colores.Rojo);
        Triangulo tris2 = new Triangulo(10,10,Colores.Azul);
        Triangulo tris3 = new Triangulo(16,16,Colores.Naranja);
        Triangulo tris4 = new Triangulo(14,14,Colores.Verde);
        Triangulo tris5 = new Triangulo(20,20,Colores.Amarillo);

        tri[0] = tris;
        tri[1] = tris2;
        tri[2] = tris3;
        tri[3] = tris4;
        tri[4] = tris5;

        for (int i = 0; i < figurasGeometricas.length; i++){
            if (figurasGeometricas[i].getClass() == Triangulo.class || figurasGeometricas[i].getClass() == Cuadrado.class){
                contadorPoligonos++;
            }
        }
        System.out.println("Total de polígonos: "+contadorPoligonos);

        Arrays.sort(
                figurasGeometricas,
                new Comparator() {
                    public int compare(Object o1, Object o2) {
                        int resultado = 0;
                        Figuras t1 = (Figuras) o1;
                        Figuras t2 = (Figuras) o2;
                        if (t1.getLado() < t2.getLado() ){
                            resultado = -1;
                        }else if (t1.getLado() > t2.getLado()){
                            resultado = 1;
                        }
                        return resultado;
                    }
                });

        System.out.println(Arrays.toString(tri));
    }
}
