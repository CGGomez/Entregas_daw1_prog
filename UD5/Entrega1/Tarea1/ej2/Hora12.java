package Tarea1.ej2;

import Tarea1.Hora;

public class Hora12 extends Hora {
    public enum Meridia {AM,PM}
    protected Meridia mer;


    public Hora12(int hora, int minuto, Meridia mer ){
        super(hora,minuto);
        setHour(hora);
        this.mer = mer;
    }
    @Override
    public void setHour(int hora){
        if(hora >= 1 && hora <= 12){
            this.hora = hora;
        }
    }
    @Override
    protected void inc(){
        super.inc();
        if (hora > 12){
            hora = hora - 12;
            mer = mer == Meridia.AM? Meridia.PM : Meridia.AM;
        }
    }
    @Override
    public String toString(){
        String res;
        res = super.toString();
        res += " "+mer;
        return  res;
    }
}
