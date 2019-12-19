package tarea9.maquinas;

 public class Vagones {
    int capacidad_max;
    int cap_actual;
    String mercancia;

    public Vagones(int capacidad_max, int cap_actual, String  mercancia){
        this.cap_actual = cap_actual;
        this.capacidad_max = capacidad_max;
        this.mercancia = mercancia;
    }
}
