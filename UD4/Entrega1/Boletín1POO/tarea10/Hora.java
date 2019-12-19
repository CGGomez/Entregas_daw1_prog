package tarea10;

public class Hora {
    int hora, minuto, segundo;

    public Hora(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        ajuste();
    }

    public int getHora(){
        return hora;
    }

    public void setHora(int hora){
        if (hora >=0 && hora <=23){
            this.hora = hora;
        }else {
            this.hora = 0;
        }
    }

    public int getMinuto(){
        return minuto;
    }

    public void setMinuto(int minuto){
        if (minuto >=0 && minuto <=59){
            this.minuto = minuto;
        }else {
           // error this.minuto = 0;
        }
    }

    public int getSegundo(){
        return segundo;
    }

    public void setSegundo(int segundo){
        if (segundo >=0 && segundo <=59){
            this.segundo = segundo;
        }else {
            this.segundo = 0;
        }
    }

   public void ajuste(){
        if (segundo >= 60){
            while (segundo > 60) {
                segundo = segundo - 60;
                minuto++;
            }
            if (minuto >= 60){
                minuto =minuto - 60;
                hora++;
                if (hora == 24){
                    hora = hora - 24;
                }
            }
        }
   }

    public void hora_actual(){
        System.out.println(hora+":"+minuto+":"+segundo);
    }
}
