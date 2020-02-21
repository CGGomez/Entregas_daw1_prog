package ExamenHerencia;

public class Sierra extends Materiales{
    private int diametro;
    private String nombre;

    public Sierra(int diametro, String nombre){
        super();
        this.diametro = diametro;
    }

    @Override
    public String toString(){
        String res = "";
        res = "Sierra. Material: "+nombre+" Diametro: "+diametro;
        return res;
    }
}
