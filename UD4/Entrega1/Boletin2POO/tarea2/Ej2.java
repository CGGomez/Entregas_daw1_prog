package boletín2.tarea2;

public class Ej2 {
	public static void main(String[] args){
		Pila batt = new Pila();
		for (int i = 0; i < 10; i++) {
			batt.apila(i);
		}
		
		Integer num = batt.desapilo();
		while (num != null) {
			System.out.println(num);
			num = batt.desapilo();
		}
	}
}
