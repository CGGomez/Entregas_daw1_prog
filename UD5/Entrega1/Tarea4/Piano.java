package Tarea4;

public class Piano extends Instrumento {
    public Piano() {
        super();
    }

    @Override
    public void interpretar() {
        for (int i = 1; i < numN; i++) {
            switch (note[i]) {
                case Do:
                    System.out.println("Do ");
                    break;
                case Re:
                    System.out.println("Re ");
                    break;
                case Mi:
                    System.out.println("Mi ");
                    break;
                case Fa:
                    System.out.println("Fa ");
                    break;
                case Sol:
                    System.out.println("Sol ");
                    break;
                case La:
                    System.out.println("La ");
                    break;
                case Si:
                    System.out.println("Si ");
                    break;
            }
            System.out.println(" ");
        }
    }
}

