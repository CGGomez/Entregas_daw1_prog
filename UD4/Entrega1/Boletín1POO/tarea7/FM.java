package tarea7;

public class FM {

    double maximo = 108.0;
    double minimo = 80.0;
    double frecuencia;
    String frecuency;

    FM(double onda_inicial){
        frecuencia = onda_inicial;
        if (frecuencia < minimo){
            frecuencia = minimo;
        }else if ( frecuencia > maximo) {
            frecuencia = maximo;
        }
    }

    public double down(){
        frecuencia -= 0.5;
        ccompruebaRango();

        return (frecuencia);
    }

    public double up(){
        frecuencia += 0.5;
        ccompruebaRango();

        return (frecuencia);
    }

    private void ccompruebaRango(){
        if (frecuencia < 80){
            frecuencia = maximo;
        }else if (frecuencia > 108){
            frecuencia = minimo;
        }
    }

    public void muestra_frecuencia(){
        System.out.println( "Su frecuencia actual es: "+frecuencia );
    }
}
