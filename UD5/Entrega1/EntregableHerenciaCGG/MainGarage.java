package EntregableHerenciaCGG;

public class MainGarage {
    public static void main(String[] args) {
        Vehiculo[] garage = new Vehiculo[8];

        Motocicleta m = new Motocicleta("Mortal Korran",2,"",Color.Rojo, 2019);
        Coche c = new Coche("Blue Falcon",5,"0891 FZR",Color.Azul,1991);
        Avioneta a = new Avioneta("Azymondias el Pincipe Dragón",13,"TD-P0001",124);
        Helicoptero h = new Helicoptero("The Ray Man",6,"RL-D0829",134);
        Motocicleta m2 = new Motocicleta("Flawless Fatality",2,"",Color.Verde, 2020);
        Coche c2 = new Coche("Just Dance",5,"0891 FZR",Color.Amarillo,1991);
        Avioneta a2 = new Avioneta("King Rammus",20,"LO-L0034",324);
        Helicoptero h2 = new Helicoptero("El Impavido",7,"PO-C0913",194);

       garage[0]=m;
       garage[1]=c;
       garage[2]=a;
       garage[3]=h;
       garage[4]=m2;
       garage[5]=c2;
       garage[6]=a2;
       garage[7]=h2;

       for (int i = 0; i < garage.length;i++){
           System.out.println(garage[i]);
       }
    }
}
