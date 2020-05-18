package XML;

public class pasearDOMPersonas {
	static String archivo;
	
	public pasearDOMPersonas(String nombre) {
		archivo = nombre;
	}

	public static void parse (String nomFile) {
		System.out.print( archivo+".xml" );
	}
}
