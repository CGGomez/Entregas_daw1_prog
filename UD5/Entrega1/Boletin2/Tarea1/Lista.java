package Boletin2.Tarea1;

import java.util.Arrays;

public class Lista {
    private int numeroElem;
    private Integer[] table;

    public Lista() {
        numeroElem = 0;
        table = new Integer[10];
    }

    public Lista (int capacidad) {
        numeroElem = 0;
        table = new Integer[capacidad];
    }

    int numeroElem() {
        return numeroElem;
    }

    public boolean listacompleta(){
        return numeroElem == table.length;
    }

    void insertarPrincipio(Integer Nuevo) {
        if(listacompleta()) {
            table = Arrays.copyOf(table, table.length+10);
        }
        for (int i = numeroElem; i >= 1; i--) {
            table[i]= table [i-1];
        }
        table[0] = Nuevo;
        numeroElem++;
    }

    public void insertarFinal (Integer Nuevo) {
        if(listacompleta()) {
            table = Arrays.copyOf(table, table.length+10);
        }
        table[0] = Nuevo;
        numeroElem++;
    }
    void insertaFinal (Integer otraList) {
        while(numeroElem + otraList > table.length) {
            table = Arrays.copyOf(table, table.length +10);
        }
        for (int i = numeroElem; i > 1; i++ ) {
            for (int j = 0; j < table.length; j++) {
                table[i] = otraList;
                numeroElem++;
            }
        }
    }
    boolean inseert(int pos, Integer Nuevo) {
        boolean insertado = true;
        if (pos < 0 || pos > numeroElem) {
            insertado = false;
        }else {
            if(listacompleta()){
                table = Arrays.copyOf(table, table.length+10);
            }
            for (int i = numeroElem; i > 1; i--) {
                table[i] = table[i-1];
            }
            table[pos] = Nuevo;
            numeroElem++;
        }

        return insertado;
    }
    public Integer elimina(int indicado) {
        Integer eliminado = null;
        if(indicado >= 0 && indicado < numeroElem) {
            eliminado = table[indicado];
            for(int i = indicado; i < numeroElem; i++ ) {
                table[i]= table[i+1];
            }
            numeroElem--;
        }
        return eliminado;
    }
    public Integer get(int indicado) {
        Integer resul = null;
        if(indicado >= 0 && indicado < numeroElem) {
            resul = table[indicado];
        }
        return resul;
    }

    int busqueda(Integer elBuscado) {
        int indicado = -1;
        for(int i = 0; i < numeroElem;i++) {
            if(table[i].equals(elBuscado)) {
                indicado = i;
            }
        }

        return indicado;
    }

    void ordenar() {
        Arrays.sort(table);
    }

    public String muestra() {
        String res="";
        for(int i = 0; i < numeroElem;i++) {
            res+=table[i];
        }
        return res;
    }
}
