package Tarea9;

public class Lavadora extends Electrodomestico implements Comparable{
    protected int carga;

    public Lavadora(){
        carga = 5;
    }

    public Lavadora(int carga){
        super();
        this.carga = carga;
        setPrecioFinal();
        setPrecioConsumo();
        setCarga();
    }

    public Lavadora(int precio, int peso){
        super();
        setPrecioFinal();
        setPrecioConsumo();
        setCarga();
    }

    public Lavadora(int carga, int peso, consumo consum, color colour){
        super();
        this.carga = carga;
        setPrecioFinal();
        setPrecioConsumo();
        setCarga();
    }

    public int getCarga(){
        return carga;
    }

    public int setCarga(){
        return carga;
    }

    @Override
    public consumo getConsumo(){
        return consum;
    }

    @Override
    public int getPrecioFinal(){
        return preciofinal;
    }
    @Override
    public String toString(){
        String res;
        res = "Carga: "+ carga+" Precio: "+preciofinal;
        return res;
    }

    @Override
    public int compareTo(Object o){
        int resultado = 0;
        Lavadora otraLavadora = (Lavadora) o;
        if (this.carga < otraLavadora.getCarga()){
            resultado = -1;
        }else if(carga > otraLavadora.getCarga()){
            resultado = 1;
        }
        return resultado;
    }
}
