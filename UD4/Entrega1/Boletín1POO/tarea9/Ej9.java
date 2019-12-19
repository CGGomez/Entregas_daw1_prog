package tarea9;

import tarea9.personal.Jefe;
import tarea9.personal.Maquinista;
import tarea9.personal.Mecanico;



public class Ej9 {

    public static void main(String[] args) {
        Maquinista maq1 = new Maquinista("Link", "20021311", 1200.5, "Capitán");

        Mecanico mec1 = new Mecanico("Atsuko Kagari","Hidraulicos","23032017");

        Jefe boss1 = new Jefe("Diana Cavendish", "24042017D");
    }
}
