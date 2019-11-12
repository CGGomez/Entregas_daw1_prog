package tarea4;

public class Ej8 {
    public static void main(String[] args) {

        int datos[][] = new int[5][5];

        for (int i = 0; i < datos.length;i++){
            for (int j =0; j < datos.length; j++){
                datos[i][j] = i+j;
            }
        }

        for (int i = datos.length-1; i >=0 ;i--){
            System.out.println();
            for (int j =datos.length-1; j >= 0;j--){
                System.out.print( datos[i][j]);
            }
        }
    }
}
