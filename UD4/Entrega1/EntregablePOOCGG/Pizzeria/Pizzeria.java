package EntregablePOOCGG.Pizzeria;

import EntregablePOOCGG.Pizza.Ingrediente;
import EntregablePOOCGG.Pizza.Pizza;

import java.util.Calendar;

public class Pizzeria {
    Pizza p;
    Ingrediente i;
    Calendar c = Calendar.getInstance();
    public String dia = Integer.toString(c.get(Calendar.DATE));
    public String mes = Integer.toString(c.get(Calendar.MONTH));

    public static String pizzerianame = "Freddy Fazbear's Pizza";

    public void mostrarDatos(){
        System.out.println( "Gracias por pedir; su pedido a sido recogido. Aquí sus detalles");
        System.out.println(pizzerianame+" les agradece su estancia");
        System.out.println(p);
        System.out.println(dia+"/"+mes);
    }
}
