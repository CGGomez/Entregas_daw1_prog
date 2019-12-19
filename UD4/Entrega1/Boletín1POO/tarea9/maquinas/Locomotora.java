package tarea9.maquinas;

import tarea9.personal.Mecanico;

public class Locomotora {
    String matricula;
    int potencia;
    String fecha;
    Mecanico mec;

    public Locomotora(String matricula, int potencia, String fecha, Mecanico mec){
        this.fecha = fecha;
        this.matricula = matricula;
        this.potencia = potencia;
        this.mec = mec;
    }

}
