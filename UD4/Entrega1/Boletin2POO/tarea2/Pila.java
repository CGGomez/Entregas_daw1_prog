package boletín2.tarea2;

import java.util.Arrays;

public class Pila {
	private int cima;
	private Integer[] tabla;
	
	public Pila() {
		cima = -1;
		tabla = new Integer[10];
	}
	
	public Pila (int capInic) {
		tabla = new Integer[capInic];
	}
	
	private boolean PilaVacia() {
		return cima == -1;
	}

	private boolean PilaLlena() {
		return cima == tabla.length;
	}
	
	Integer Cim() {
		Integer elCima = null;
		if(!PilaVacia()) {
			elCima = tabla[cima];
		}
		return cima;
	}
	
	void apila(Integer elem) {
		if(PilaLlena()) {
			tabla = Arrays.copyOf(tabla, tabla.length+10);
		}
		cima++;
		tabla[cima] = elem;
	}
	
	Integer desapilo() {
		Integer elem = null;
		if(!PilaVacia()) {
			elem = tabla[cima];
			cima--;
		}
		return elem;
	}
	
	public String muestra() {
		String resul ="";
		for(int i =0; i <= cima; i++) {
			resul += tabla[cima]+ " ";
		}
		return resul;
	}
	
}
