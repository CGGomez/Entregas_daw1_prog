package EntregableHerenciaCGG;

public class Aereo extends Vehiculo {
    protected String oaci;
    protected int altitud;

    public Aereo(String nombre, int num_pasajeros, String oaci, int altitud){
        super();
        this.oaci = oaci;
        this.altitud = altitud;
    }

    public Aereo() {
        this.oaci = "TD-P0000";
        this.altitud = 0;
    }

    public void setAltitud(int altitud) {
        this.altitud = altitud;
    }

    public int getAltitud() {
        return altitud;
    }

    public String getOaci() {
        return oaci;
    }

    public void setOaci(String oaci) {
        this.oaci = oaci;
    }

    @Override
    public String toString(){
        String res;
        res =  super.toString() +" Oaci: "+oaci+" Altitud: "+altitud;
        return res;
    }
}
