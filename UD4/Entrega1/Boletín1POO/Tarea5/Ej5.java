package Tarea5;

public class Ej5 {
    public static void main(String[] args) {
        Texto tama = new Texto(5);

        tama.addPrincipio("Ho");
        tama.addPrincipio(";");
        tama.add("la");
        tama.add("X" );

        tama.escribir();
        System.out.println( "Numero de vocales totales: "+tama.contavocal() );
    }
}
