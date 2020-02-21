package ExamenHerencia;

public class Metal {
    enum tipo{Aluminio, Estaño, Acero}
    private tipo tipe;
    private boolean magnetigo = false;

    public Metal(tipo tipe,boolean magnetigo, int LaMasa, int Quemado, int Diluido, Boolean movible){
        super();
        this.tipe = tipe;
        this.magnetigo = magnetigo;
    }
}
