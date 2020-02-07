package EntregableHerenciaCGG;

public class Coche extends Terrestre {

    public Coche(String nombre, int num_pasajeros, String matricula, Color colour, int anio){
        super();
        setNombre(nombre);
        setNum_pasajeros(num_pasajeros);
        setMatricula(matricula);
        setColour(colour);
        setAnio(anio);
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        String res;
        res = "Coche "+super.toString();
        return res;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }
}
