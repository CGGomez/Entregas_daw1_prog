package Tarea4;

import tarea2.CuentaCorriente;

public class Ej4 {
    public static void main(String[] args) {
        tarea2.CuentaCorriente cuenta = new CuentaCorriente("Sally","3948231G");

        System.out.println(Tarea4.CuentaCorriente.banco);

        Tarea6.Banco.cambiar_banco("BBCircus");

        System.out.println(Tarea4.CuentaCorriente.banco);
    }
}
