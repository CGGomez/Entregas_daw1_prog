package EntregableHerenciaCGG;

public class Avioneta extends Aereo {

    public Avioneta(String nombre, int num_pasajeros, String oaci, int altitud){
        super();
        setNombre(nombre);
        setNum_pasajeros(num_pasajeros);
        setAltitud(altitud);
        setOaci(oaci);
    }

    @Override
    public String toString(){
        String res;
        res ="Avioneta "+ super.toString();
        return res;
    }
}
