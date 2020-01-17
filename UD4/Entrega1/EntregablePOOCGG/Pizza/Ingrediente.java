package EntregablePOOCGG.Pizza;

public class Ingrediente {

    public String ingred[] = new String[3];
    protected String ingri;
    protected boolean menos;

    public Ingrediente( String ingri){
        for (int i = 0; i < ingred.length;i++){
                ingred[i] = ingri;
        }
    }

    public boolean simenosdetres(){
        for (int i = 0; i < ingred.length;i++){
            if(ingred[i]==null){
                menos = true;
            }
        }
        return menos;
    }

    public Ingrediente(){
        for (int i = 0; i < ingred.length;i++){
            if (menos){
                ingred[i] = "Queso";
            }
        }
    }
    public void mostrarIngred(){
        for (int i = 0; i < ingred.length;i++){
            System.out.println(ingred[i]);
            System.out.println(menos);
        }

    }
}
