package Tarea1.ej3;

import Tarea1.Hora;

public class HoraExacta extends Hora {
    protected int segundo;

    public HoraExacta(int hora, int minuto, int segundo){
        super(hora,minuto);
        setHour(hora);
        setSegundo(segundo);
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <=59){
            this.segundo = segundo;
        }
    }

    public void incre(){
        segundo++;
        if (segundo > 59){
            segundo = segundo - 60;
            super.inc();
        }
    }

    @Override
    public String toString(){
        String res;
        res = hora+":"+minuto+":"+segundo;
        return res;
    }

    @Override
    public boolean equals(Object h){
        HoraExacta newReloj = (HoraExacta) h;
        boolean igual = false;
        if (this.hora == newReloj.hora && this.minuto == newReloj.minuto && this.segundo == newReloj.segundo) {
            igual = true;
        }else {
            igual = false;
        }
        return igual;
    }
}
