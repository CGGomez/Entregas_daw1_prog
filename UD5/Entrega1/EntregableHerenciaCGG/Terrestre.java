package EntregableHerenciaCGG;

public class Terrestre extends Vehiculo {
    protected String matricula;
    protected Color colour;
    protected int anio;

    public Terrestre(){
        super();
        this.colour = Color.Verde;
        this.anio= 2020;
    }

    public Terrestre(String matricula, Color colour, int anio, String nombre){
        super();
        this.anio = anio;
        this.colour = colour;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString(){
        String res;
        res = super.toString()+ " matricula: "+matricula+" Color: "+colour+" anio: "+anio;
        return res;
    }
}
