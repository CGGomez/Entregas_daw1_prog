package ExamenHerencia;

public class Pico extends Materiales implements Minar{
    private int grosor;
    private String nombre;
    private String material;
    private int cantidad;

    public  Pico(String nombre, int grosor){
        super();
        this.grosor = grosor;
    }

    @Override
    public String toString(){
        String res=" ";
        res = "Pico. Material: "+nombre+" Grosor:"+grosor;
        return res;
    }

    @Override
    public int hacer() {
        return cantidad + 100;
    }

    @Override
    public int deshacer() {
        return cantidad - 100;
    }
}
