package ExamenHerencia;

public class Cristal extends Materiales{
    enum vision {translucido, transparente}
    private vision vis;

    public Cristal(int LaMasa, int Quemado, int Diluido, Boolean movible, vision vis ){
        super();
        this.vis = vis;
    }
}
