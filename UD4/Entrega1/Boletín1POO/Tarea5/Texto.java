package Tarea5;

public class Texto {

    int maximun;
    String cadeena;

    public Texto(int maximo){
        cadeena = "";
        maximun = maximo;
    }

    public void fini (char c){
        if (maximun > cadeena.length()){
            cadeena = cadeena + c;
        }
    }
    public void add (String  c){
        if (maximun >= cadeena.length()+c.length()){
            cadeena = cadeena +c;
        }
    }

    public void principio (char c){
        if (maximun > cadeena.length()){
            cadeena = c + cadeena;
        }
    }

    public void addPrincipio (String  c){
        if (maximun >= cadeena.length()+c.length()){
            cadeena = c + cadeena;
        }
    }
    public void escribir (){
        System.out.println( cadeena );
    }
    public int contavocal(){
        int  conta = 0;
        for (int i = 0 ; i < cadeena.length();i++){
            if (esVocal(cadeena.charAt(i))){
                conta++;
            }
        }
    return  conta;
    }

    private boolean esVocal(char c) {
        boolean vcal = false;

        c = Character.toLowerCase(c);

        String vocales = cadeena;
        if (vocales.indexOf(c) != -1){
            vcal = true;
        }
        return vcal;
    }
}
