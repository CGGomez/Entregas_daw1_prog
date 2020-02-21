package ExamenHerencia;

public abstract class Materiales {
    private String nombre;
    private int LaMasa;
    private int Quemado;
    private int Diluido;
    private boolean movible = true;
    private String propiedades = " ";

    public Materiales() {

    }

    public  int getLamasa(){
        return LaMasa;
    }

    public void MostrarEstado(){
        propiedades =  "Nombre: "+nombre+", Masa: "+LaMasa+", Quemadura: "+Quemado+", Disoluble: "+Diluido;
        if (movible){
            propiedades =  ". Este material se puede mover" ;
        }else{
            propiedades = ". Este material es inamovible" ;
        }
    }
    @Override
    public String toString(){
        String res = " ";
        res = propiedades;
        return res;
    }
}
