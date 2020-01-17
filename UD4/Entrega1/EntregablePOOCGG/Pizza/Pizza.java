package EntregablePOOCGG.Pizza;

public class Pizza {
    Tamanio t;

    public Pizza(Tamanio t) {
        this.t = t;
    }

    public void mostrarPizza() {
        System.out.println( "Especificaion de tamaño" );
        System.out.print(t);
    }
}

