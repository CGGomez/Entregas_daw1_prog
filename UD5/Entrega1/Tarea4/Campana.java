package Tarea4;

public class Campana extends Instrumento {
    public Campana(){
        super();
    }

    @Override
    public void interpretar(){
        for (int i = 1; i < numN; i++){
            switch (note[i]){
                case Do:
                    System.out.println("Dooo");
                    break;
                case Re:
                    System.out.println("Reee");
                    break;
                case Mi:
                    System.out.println("Miii");
                    break;
                case Fa:
                    System.out.println("Faaa");
                    break;
                case Sol:
                    System.out.println("Sool");
                    break;
                case La:
                    System.out.println("Laaa");
                    break;
                case Si:
                    System.out.println("Siii");
                    break;
            }
            System.out.println(" ");
        }
    }
}
