package EntregableHerenciaCGG;

public class Motocicleta extends Terrestre {

    public Motocicleta(String nombre, int num_pasajeros, String matricula, Color colour, int anio){
        super();
        setNombre(nombre);
        setNum_pasajeros(num_pasajeros);
        setMatricula(matricula);
        setColour(colour);
        setAnio(anio);
    }

    @Override
    public String toString(){
        String res;
        res = "Motocicleta "+super.toString();
        return res;
    }
}
