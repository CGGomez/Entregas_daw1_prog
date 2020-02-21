package ExamenHerencia;

public class MainCraft {
    public static void main(String[] args) {
        Minecraft mine[] = new Minecraft[10];
        Pico p = new Pico("Cristal",15);

        Cristal c = new Cristal(17,19,50,true, Cristal.vision.translucido);
        Metal m = new Metal(Metal.tipo.Aluminio,false,800, 200,0,true );
        Roca r = new Roca(45,34,7,700,false);
        Cristal c2 = new Cristal(80,9,50,false, Cristal.vision.transparente);
        Metal m2 = new Metal(Metal.tipo.Estaño,true,0, 10,0,true );
        Mezclar me = new Mezclar("Roca","Cristal");
        Mezclar me2 = new Mezclar("Roca","Metal");

        for (int i = 1; i <= 11;i++){
            p.hacer();
            p.deshacer();
        }

        me.toString();
        me2.toString();
    }
}
