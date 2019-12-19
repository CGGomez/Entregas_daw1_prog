package tarea9.personal;

public class Personal {
    String nombre, nom_ap, DNI, telfno, especialidad, rango;
    Double sueldo;

    public Personal (String nombre, String DNI, String rango, double sueldo){
        this.nombre = nombre;
        this.DNI = DNI;
        this.rango = rango;
        this.sueldo = sueldo;
    }

    public Personal(String nom_ap, String  especialidad, String telfno){
        this.nom_ap = nom_ap;
        this.especialidad = especialidad;
        this.telfno = telfno;
    }
    public Personal(String link, String nom_ap, double v, String DNI) {
        this.nom_ap = nom_ap;
        this.DNI = DNI;
    }

    public void info_maquinista(){
      System.out.println( nombre +" con el rango "+ rango+ " cobra un total de "+sueldo );
    }

    public void info_mecanico(){
        System.out.println( "El mecanico/a "+ nom_ap+ " tiene especialidad en "+especialidad );
        System.out.println( " Para contactarlo llame al siguiente teléfono: "+telfno );
    }

    public void info_jefe(){
        System.out.println( nom_ap +" es el/la jefe/a de la estacion general" );
    }
}
