package XML;

public class Etiquetas {
	String nombre;
	String edad;
	
	public Etiquetas(String nombre, String edad) {
		this.edad = edad;
		this.nombre = nombre;
	}
	
    public void setNombre (String nom) { nombre=nom;}

    public void setEdad (String ed) {edad=ed;}

    public String getNombre() {return nombre;}

    public String getEdad() {return edad;}
}
