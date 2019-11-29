package ExamenUD3;

public class Ej1 {
    public static void main(String[] args) {

        int novecinco[][] = new int [9][9];
        int filas = 9;
        int columnas = 9;
        int min = 0;

        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){

                    novecinco[i][j] = (int) Math.floor(Math.random()*(900-500+1)+(500));
            }
        }
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.print(novecinco[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        System.out.println( "Ahora desde la esquina inferior izq hasta superior Der" );

        do {
            System.out.print(novecinco[filas-1][min]);
            System.out.print(" ");
            filas--;
            min++;
        }while (filas-1 >=0 && min <columnas);
    }
}
