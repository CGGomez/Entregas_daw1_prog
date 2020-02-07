package EntregableHerenciaCGG;

public class Helicoptero extends Aereo {

    public Helicoptero(String nombre, int num_pasajeros, String oaci, int altitud){
        super();
        setNombre(nombre);
        setNum_pasajeros(num_pasajeros);
        setAltitud(altitud);
        setOaci(oaci);
    }

    @Override
    public String toString(){
        String res;
        res ="Helicoptero "+ super.toString();
        return res;
    }
}
