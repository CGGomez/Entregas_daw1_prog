package ExamenHerencia;

public class Mezclar extends Materiales {
    private String mezcla;
    private String segMater;
    String nombre;

    public  Mezclar(String nombre, String segMater){
        super();
        this.segMater = segMater;
    }

    public void setMezcla(String mezcla) {
        this.mezcla = mezcla;
    }
    public String MezclaMaterial(){
        if (segMater.equals( "Roca" ) && nombre.equals( "Cristal" )){
            mezcla = "Rocastal";
        }else if(segMater.equals( "Roca" ) && nombre.equals( "Metal" ))
            mezcla = "Mocatal";
        else if (segMater.equals( "Metal" ) && nombre.equals( "Cristal" )){
            mezcla = "Metastal";
        }
        return mezcla;
    }

    @Override
    public String toString (){
        return mezcla;
    }
}
