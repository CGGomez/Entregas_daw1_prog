package EntrgableU3CGG;

public class Ej5 {
    public static void main(String[] args) {

        int Aleatorio[] ={1,2,3,4,5,6,7,8,9,10};
        int elegiatorio = (int) (Math.random()*Aleatorio.length);


        System.out.println( "Se ha elegido un número aleatorio de su Array. El elegido ha sido: " );
        System.out.print(aleatorioDearray(Aleatorio,elegiatorio));
    }
    static int aleatorioDearray(int Aleatorio[],int alegiatorio){
        int elegido = 0;
        for (int i = 0; i < Aleatorio.length;i++){
            if (i == alegiatorio){
                elegido = Aleatorio[i];
            }
        }
        return elegido;
    }
}
