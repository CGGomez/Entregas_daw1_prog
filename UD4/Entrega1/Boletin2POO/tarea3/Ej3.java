package boletín2.tarea3;


public class Ej3 {
	public static void main(String[] args){
	PilaLista plista = new PilaLista();
	for (int i = 0; i < 10; i++) {
		plista.apila(i);
	}
	
	Integer num = plista.desapilo();
	while (num != null) {
			System.out.println(num);
			num = plista.desapilo();
		}
	}
}
