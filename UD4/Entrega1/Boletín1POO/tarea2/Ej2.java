package tarea2;

//import tarea3.CuentaCorriente;
// Da erorres en los ingresos de las clases privadas de la CuentaCorriente de la tarea 3
// Renombra automáticamente las sentencias que llaman a los constructores.

public class Ej2 {
    public static void main(String[] args) {
        CuentaCorriente registrado = new CuentaCorriente("Sally","3948231G");
        CuentaCorriente initial = new CuentaCorriente( 10 );
        CuentaCorriente saldo_inicial = new CuentaCorriente(10,0,"3948231G");

        if (initial.saldo == 0){
            System.out.println( "Hemos recibido su nombre y dni, ¿Qué desea hacer?" );
        }else {
            System.out.println( "Bienvenido/a "+registrado.nombre+" ¿Va a ingresar dinero?" );
        }

        registrado.ingresar_dinero(200);
        System.out.println( "Se han ingresado correctamente "+ registrado.saldo + "€");

        if (registrado.saca_dinero(180)){
            System.out.println( "Se ha retirado el dinero de forma correcta" );
        }else {
            System.out.println( ". Pruebe otra cantidad. Ha excedido su límite de descubierto" );
        }

        registrado.muestra_info();

        initial.muestra_info();

        saldo_inicial.muestra_info();
    }
}
