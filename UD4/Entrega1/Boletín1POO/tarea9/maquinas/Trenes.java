package tarea9.maquinas;

import tarea9.personal.Maquinista;

public class Trenes {
    Locomotora locomotora;
    Vagones vagon[];
    Maquinista al_mando;
    private int num_vagones;

    public Trenes(Locomotora locomotora, Maquinista al_mando){
        this.al_mando = al_mando;
        this.locomotora = locomotora;
        vagon = new Vagones[12];
    }

    public void más_vagones(int capacidad_max, int cap_actual, String mercancia){
        if (num_vagones > 12){
            System.out.println( "Este tren no puede recibir más vagones" );
        }else {
            Vagones vag = new Vagones(capacidad_max, cap_actual, mercancia);
            vagon[num_vagones] = vag;
            num_vagones++;
        }
    }
}
