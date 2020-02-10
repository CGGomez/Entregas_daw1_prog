package Boletin2.Tarea1;

public class PilaLista implements Pila {
    private int indiceCima;
    private Lista lista;

    public PilaLista(){
        indiceCima = -1;
        lista = new Lista();
    }

    public PilaLista(int capacidad){
     lista = new Lista(capacidad);
    }

    private boolean pilaVacia(){
        return indiceCima == -1;
    }

    private boolean pilaLlena(){
        return indiceCima == -1;
    }

    int cima(){
        return lista.numeroElem() -1;
    }

    @Override
    public void apila(int elem) {
        lista.insertaFinal(elem);
        indiceCima++;

    }

    @Override
    public Integer desapila() {
        Integer elem = lista.elimina(indiceCima);
            if (elem != null){
                indiceCima--;
            }
        return elem;
    }

    @Override
    public String toString() {
        return lista.muestra();
    }
}
