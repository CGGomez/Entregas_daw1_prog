package tarea4;

public class Ej9
    {public static void main(String[] args) {
        int apuesta[] = {4,7,0,2,1};
        int ganadora[] ={0,0,0,0,0}; //Referencia al chiste de Eugenio. El ceromil, cerocientos cero cero.

        int aciertos = 0;

        System.out.println( "Usted ha acertado un total de "+primitiva(apuesta,ganadora,aciertos)+"/5 numeros" );

    }
    static int primitiva(int[] apuesta, int[] ganadora, int aciertos){
        for (int i = 0; i < apuesta.length;i++){
            if (apuesta[i] == ganadora[i]){
                aciertos++;
            }
        }
        return aciertos;
    }
}
