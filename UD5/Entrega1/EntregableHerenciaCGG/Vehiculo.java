package EntregableHerenciaCGG;

public class Vehiculo {
    protected String nombre;
    protected int num_pasajeros;

    public Vehiculo(String nombre, int num_pasajeros){
        this.nombre = nombre;
        this.num_pasajeros = num_pasajeros;
        getNombre();
    }

    public Vehiculo() {
        this.num_pasajeros = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNum_pasajeros() {
        return num_pasajeros;
    }

    public void setNum_pasajeros(int num_pasajeros) {
        this.num_pasajeros = num_pasajeros;
    }

    @Override
    public String toString(){
        String res;
        res = "Nombre: "+nombre+" numero pasajeros: "+num_pasajeros;
        return  res;
    }
}
