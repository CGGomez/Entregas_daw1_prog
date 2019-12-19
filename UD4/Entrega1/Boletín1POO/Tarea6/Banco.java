package Tarea6;

public class Banco {
    final String nombre = "La Kai'Sa";
    String direccion = "C/ Sett Mecha Nº 19";
    double capital = 5200000;

    public Banco(double capital, String direccion) {
        if (capital != 0) {
            this.capital = capital;
        }
        if(!direccion.equals(" ")){
            this.direccion = direccion;
        }
    }

    public static void cambiar_banco(String newbank) {

    }

    public void muestra_info(){
        System.out.println( "El banco al que ingresa se llama: "+ nombre );
        System.out.println( "Este banco está en la dirección: "+direccion );
        System.out.println( "Uested tiene un capital correspondiente a: "+capital );
    }
}

