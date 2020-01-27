package Tarea9;

import java.util.Arrays;
import java.util.Comparator;

public class Ej9 {
    public static void main(String[] args) {
        Tv tele= new Tv (true,60,40, Electrodomestico.color.Negro,Electrodomestico.consumo.E);
        Lavadora lava = new Lavadora();
        Electrodomestico e = new Electrodomestico(40, Electrodomestico.color.Azul, Electrodomestico.consumo.B);

        Electrodomestico e1 = new Electrodomestico();
        Electrodomestico e2 = new Electrodomestico();
        Electrodomestico e3 = new Electrodomestico();
        Electrodomestico e4 = new Electrodomestico();
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        Tv tv3 = new Tv();
        Lavadora lv1 = new Lavadora();
        Lavadora lv2 = new Lavadora();
        Lavadora lv3 = new Lavadora();

        Electrodomestico almacen[] = new Electrodomestico[10];
        almacen[0] = e1;
        almacen[1] = e2;
        almacen[2] = e3;
        almacen[3] = e4;
        almacen[4] = tv1;
        almacen[5] = tv2;
        almacen[6] = tv3;
        almacen[7] = lv1;
        almacen[8] = lv2;
        almacen[9] = lv3;

        for (int i = 0; i < almacen.length; i++){
            System.out.println(almacen[i]);
        }


        Lavadora l1 = new Lavadora(7,45, Electrodomestico.consumo.C, Electrodomestico.color.Rojo);
        Lavadora l2 = new Lavadora(8,25, Electrodomestico.consumo.D, Electrodomestico.color.Rojo);
        Lavadora l3 = new Lavadora(9,75, Electrodomestico.consumo.A, Electrodomestico.color.Rojo);

        Lavadora lavadoras[] = new Lavadora[3];
        lavadoras[0] = l1;
        lavadoras[1] = l3;
        lavadoras[2] = l2;

        Arrays.sort(lavadoras);

        System.out.println(Arrays.toString(lavadoras));

        Arrays.sort(
                lavadoras,
                new Comparator() {
                    public int compare(Object o1, Object o2) {
                        int resultado = 0;
                        Lavadora l1 = (Lavadora) o1;
                        Lavadora l2 = (Lavadora) o2;
                        if (l1.getPrecioFinal() < l2.setPrecioFinal() ){
                            resultado = -1;
                        }else if (l1.getPrecioFinal() > l2.getPrecioFinal()){
                            resultado = 1;
                        }
                        return resultado;
                    }
                });

        System.out.println(Arrays.toString(lavadoras));


        System.out.println(tele);
        System.out.println(lava);
        System.out.println(e);
    }
}

