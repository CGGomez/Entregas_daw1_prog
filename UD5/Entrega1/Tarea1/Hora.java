package Tarea1;

public class Hora {
    protected int hora;
    protected int minuto;

    public Hora (int hora, int minuto){
        this.hora = hora;
       this.minuto = minuto;
        setHour(hora);
        setMin(minuto);
    }

    protected void inc(){
        minuto++;
        if (minuto > 59){
            minuto = 0;
            hora++;
            if (hora > 23){
                hora = 0;
            }
        }
    }

    public void setHour(int hora) {
        if (hora >=0 && hora <=23){
            this.hora = hora;
        }
    }

    public void setMin(int minuto) {
        if (minuto >=0 && minuto <=59){
            this.minuto = minuto;
        }
    }

    @Override
    public String toString(){
        String result;
        result = hora+":"+minuto;
        return result;
    }
}
