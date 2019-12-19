package tarea3;

public class CuentaCorriente {

    public String nombre;
    protected String DNI;
    private double saldo;
    private int limite;

    public boolean SacaDinero(double peticion){
        boolean resul = false;

        return resul;
    }

    public CuentaCorriente(String nombre, String dni){
        saldo = 0;
        this.nombre = nombre;
        DNI = dni;
        limite = -50;
    }

    public void registrado(){
        if (saldo == 0){
            System.out.print( "Introduzca su nombre y su DNI. Su límite es de 0€" );
        }else {
            System.out.print( "Bienvenido/a ¿Que deséa hacer? Recuerde que su límite es de 0€" );
        }
    }

    public void mostrarinfo(){ }

    public boolean saca_dinero(double peticion){
        boolean resultado = false;
        if ((saldo-peticion)>= limite){
            resultado = true;
            saldo -=peticion;
            System.out.println("Se han sacado correctamente "+peticion+" €");
        }else {
            System.out.print( "No ha podido sacar dinero" );
        }
        return resultado;
    }

    public void ingresar_dinero(double ingreso){
        saldo+= ingreso;
    }

    public void muestra_info(){
        System.out.println( "Esta cuenta pertenece a "+nombre+" con el DNI: "+DNI);
        System.out.println( "Su slado actual es de "+saldo);
        System.out.println( "Su límite de descubierto es: "+limite);
    }
}
