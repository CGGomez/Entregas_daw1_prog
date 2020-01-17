package EntregablePOOCGG;

import EntregablePOOCGG.Pizza.Ingrediente;
import EntregablePOOCGG.Pizza.Pizza;
import EntregablePOOCGG.Pizza.Tamanio;
import EntregablePOOCGG.Pizzeria.Pizzeria;

import java.util.Scanner;


public class Ej1 {
    public static void main(String[] args) {
        String ingred;
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Bienvenido a Freddy Fazbear's Pizza: aquí tiene los tamaños disponibles para nuestras Pizzas. Pequeño, Mediano y Familiar" );

        Pizza piz = new Pizza(Tamanio.Meidano);

        System.out.println( "Seleccione los ingredientes, si no elige nada la pizza solo tendrá Queso" );
        for (int i = 0; i < 3; i++){
            ingred = teclado.nextLine();
            Ingrediente in = new Ingrediente(ingred);
        }

        Pizzeria p = new Pizzeria();

        p.mostrarDatos();
    }
}