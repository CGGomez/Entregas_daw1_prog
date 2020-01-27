package Tarea9;

public class Tv extends Electrodomestico{

    protected int pulgadas;
    protected boolean tdt;


    public Tv(){
        super();
        tdt = false;
        pulgadas = 46;
        getPrecioFinal();
        setPrecioConsumo();
    }

    public Tv(boolean tdt, int pulgadas, int peso, color colour, consumo consum){
        super();
        this.pulgadas = pulgadas;
        this.tdt = tdt;
        setPrecioFinal();
        setPrecioConsumo();
    }

    @Override
    public int getPrecioFinal(){
        if (pulgadas > 40){
            preciofinal = precio*(30/100);
        }
        if (tdt == true){
            preciofinal = precio + 50;
        }
        return preciofinal;
    }

    @Override
    public int setPrecioConsumo(){
        return preciofinal;
    }

    @Override
    public consumo getConsumo(){
        return consum;
    }

    @Override
    public String toString(){
        String res;
        res = "TDT: "+tdt+" Pulgadas: "+ pulgadas+" Precio: "+preciofinal+" Consumo: "+consum+" Color: "+ colour;
        return res;
    }
}
