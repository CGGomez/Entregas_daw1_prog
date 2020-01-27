package Tarea4;

abstract class Instrumento {
    private notas n;

    public enum notas {Do,Re, Mi, Fa, Sol, La, Si}

    protected notas note[];
    protected int numN;
    static protected int max_notas = 100;

    public Instrumento(){
        note = new notas[max_notas];
        numN = 0;
    }

    public void add(notas aDo){
        if (numN < max_notas){
            note[numN] = n;
            numN++;
        }
    }

    abstract void interpretar();
}
