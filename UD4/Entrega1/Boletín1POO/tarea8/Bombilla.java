package tarea8;

public class Bombilla {
    public boolean interruptorGeneral = true;
    private boolean interr;
    boolean hestatus;

    public Bombilla(){
        interr = false;
    }

    public void enciende(){
        interr = true;
    }

    public void apaga(){
        interr = false;
    }

    public boolean estatos(){
        if (interruptorGeneral == true && interr == true){
            hestatus = true;
        }else {
            hestatus = false;
        }
        return (hestatus);
    }

    public String  muestradeestado(){
        String estado;
        if (hestatus == true){
            estado = "Encendida";
        }else {
            estado = "Apagada";
        }
        return estado;
    }
}
