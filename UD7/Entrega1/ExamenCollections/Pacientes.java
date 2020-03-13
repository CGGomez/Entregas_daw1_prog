package ExamenCollections;

public class Pacientes {
    private String nombre;
    private  int edad;
    private int peso;
    private boolean vacuna;
    private int medico;
    private char cepa;
    private Coronavirus corona;

    public Pacientes(String nombre, int edad, int peso, boolean vacuna, int medico, char cepa){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.medico = medico;
        this.vacuna = vacuna;
        this.cepa = cepa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public boolean isVacuna() {
        return vacuna;
    }

    public int getMedico() {
        return medico;
    }

    public char getCepa() {
        return cepa;
    }

    public Coronavirus getCorona() {
        return corona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setVacuna(boolean vacuna) {
        this.vacuna = vacuna;
    }

    public void setMedico(int medico) {
        this.medico = medico;
    }

    public void setCepa(char cepa) {
        this.cepa = cepa;
    }

    public void setCorona(Coronavirus corona) {
        this.corona = corona;
    }

    public void Coronavirus(){
        corona.addpaciente(nombre, edad, peso, vacuna, medico, cepa);
    }

    @Override
    public String toString() {
        String res = "";
        res = cepa+", "+nombre+", "+edad+", "+peso+" Kg, "+vacuna+", "+medico;
        return res;
    }
}
