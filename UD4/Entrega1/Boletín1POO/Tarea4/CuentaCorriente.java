package Tarea4;

public class CuentaCorriente {
    String nombre;
    String dni;
    double saldo;
    int limite;
    static String banco = "La Kai'Sa";


    public boolean SacaDinero(double peticion){
        boolean resul = false;

        return resul;
    }

    public static void cambiar_banco(String nuevo_banco){
         banco = nuevo_banco;
    }

    public CuentaCorriente(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public CuentaCorriente(double saldo_inicial){
        saldo = saldo_inicial;
    }

    public CuentaCorriente(double saldo_inicial,int limite, String DNI){
        this.limite = limite;
        this.saldo = saldo_inicial;
        dni = DNI;
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
        System.out.println( "Esta cuenta pertenece a "+nombre+" con el DNI: "+dni);
        System.out.println( "Su slado actual es de "+saldo);
        System.out.println( "Su límite de descubierto es: "+limite);
    }
}
