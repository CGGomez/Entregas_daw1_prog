package ExamenHerencia;

public class Minecraft extends Materiales{
    public Materiales material[] = new Materiales[10];

    public void eliminaMat(){
        for (int i = 0; i < material.length; i++){
            if(material[i].getLamasa() == 0){
                System.out.println( "Material sin masa, eliminandolo" );
                material[i] = material[i-1];
            }
        }
    }
}
