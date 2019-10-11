package Tarea4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ej5 {
    public static void main(String[] args){
        DateFormat HoraActual= new SimpleDateFormat("HH;mm;ss");
        Date date = new Date();
        System.out.println("Hora actual: " + HoraActual.format(date));
    }
}
