package tarea3;

public class Ej3 {
    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente("Sally", "3948231G");

        cuenta.ingresar_dinero(200);

        cuenta.muestra_info();

        if (cuenta.saca_dinero(280)){
            System.out.println( "Se ha sacado correctamente dinero" );
        }else {
            System.out.println( ". Pruebe con otra cantidad" );
        }
    }
}
