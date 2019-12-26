package boletín2.tarea3;

import java.util.Arrays;

import boletín2.tarea1.Lista;

public class PilaLista {
	private int cima;
	private Lista list;
	
	public PilaLista() {
		cima = -1;
		list = new Lista();
	}
	
	public PilaLista (int capInic) {
		list= new Lista(capInic);
	}
	
	private boolean PilaVacia() {
		return cima == -1;
	}

	private boolean PilaLlena() {
		return list.listacompleta();
	}
	
	Integer Cim() {
		Integer elCima = null;
		if(!PilaVacia()) {
			elCima = list.get(cima);
		}
		return cima;
	}
	
	void apila(Integer elem) {
		if(PilaLlena()) {
			list.insertarFinal(elem);
		}
		cima++;
	}
	
	Integer desapilo() {
		Integer elem = list.elimina(cima);
		if(elem != null) {
			cima--;
		}
		return elem;
	}
	
	public String muestra() {
		return list.muestra();
	}
}
