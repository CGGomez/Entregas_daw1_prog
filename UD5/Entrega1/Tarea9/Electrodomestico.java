package Tarea9;

public class Electrodomestico {
    public enum consumo{A,B,C,D,E,F}
    public enum color{Blanco, Negro, Azul, Rojo, Gris}

    protected consumo consum;
    protected int peso;
    protected int precio;
    protected color colour;
    protected int preciofinal;

    public int Electrodomesticos[] = new int[10];
    public int Lavadora[] = new int[5];

   public Electrodomestico(){
       precio = 100;
       preciofinal = precio;
       colour = color.Blanco;
       peso = 5;
       consum = consumo.A;
       setPrecioConsumo();
       setPrecioFinal();
   }

   public Electrodomestico(int peso, int precio){
       this.peso = peso;
       this.precio = precio;
       preciofinal = precio;
       consum = consumo.A;
       colour = color.Blanco;
       setPrecioConsumo();
       setPrecioFinal();
   }

    public Electrodomestico(int peso, color colour, consumo consum){
        this.colour = colour;
        preciofinal = precio;
        this.peso = peso;
        this.consum = consum;
        setPrecioConsumo();
        setPrecioFinal();
    }

    public int getPrecioFinal() {
        return preciofinal;
    }

    public int setPrecioFinal() {
        if (peso > 0 && peso <=29){
            preciofinal +=  10;
        } else if(peso >= 30 && peso <= 49){
            preciofinal += 60;
        }else if(peso >= 50 && peso <= 79){
            preciofinal += 80;
        }else if (peso >= 80){
            preciofinal += 100;
        }else{
            preciofinal = 100;
        }
        return preciofinal;
    }

    public consumo getConsumo() {
        return consum;
    }

    public int setPrecioConsumo() {
       switch (consum){
           case A:
               preciofinal += 100;
               break;
           case B:
               preciofinal += 80;
               break;
           case C:
               preciofinal += 60;
               break;
           case D:
               preciofinal += 50;
               break;
           case E:
               preciofinal += 30;
               break;
           case F:
               preciofinal += 10;
               break;
       }
        return preciofinal;
    }

    @Override
    public String toString() {
        String res;
        res = "Consumo: "+ consum+" Precio Final: "+preciofinal+" Color: "+colour+" Peso: "+peso;
        return res;
    }
}
