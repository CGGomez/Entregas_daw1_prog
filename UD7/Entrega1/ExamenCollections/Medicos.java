package ExamenCollections;

public class Medicos {
    private String nombre;
    private String apellido;
    private int colegiado;
    private String hospital;

    public Medicos(String nombre, String apellido, int colegiado, String hospital){
        this.apellido = apellido;
        this.nombre = nombre;
        this.colegiado = colegiado;
        this.hospital = hospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getColegiado() {
        return colegiado;
    }

    public void setColegiado(int colegiado) {
        this.colegiado = colegiado;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        String res = "";
        res = nombre+", "+apellido+", "+colegiado+", "+hospital;
        return res;
    }
}
