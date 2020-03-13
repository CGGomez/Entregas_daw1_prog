package ExamenCollections;

public class Mainfectados {
    public static void main(String[] args) {
        Pacientes p1 = new Pacientes("Twitch",50,75, true, 860310, 'A');
        Pacientes p2 = new Pacientes("Callum",20,68, true, 140914, 'B');
        Pacientes p3 = new Pacientes("Miko",24,57, true, 860310, 'C');
        Pacientes p4 = new Pacientes("Trixie",40,80, false, 860310, 'D');
        Pacientes p5 = new Pacientes("Snake",60,87, true, 140914, 'E');
        Pacientes p6 = new Pacientes("Yoshi",26,51, false, 860310, 'F');
        Pacientes p7 = new Pacientes("Freddy",55,90, false, 140814, 'G');
        Pacientes p8 = new Pacientes("Adora",29,67, true, 140914, 'H');
        Pacientes p9 = new Pacientes("Luigi",40,72, true, 140814, 'I');
        Pacientes p10 = new Pacientes("Nathan",53,79, false, 860310, 'J');

        Medicos m1 = new Medicos("Mario","Bros", 860310,"Virgen del Champiñón");
        Medicos m2 = new Medicos("Rayla","Elveis", 140914,"Sombra de la luna");
        Medicos m3 = new Medicos("Bonnie","Bon", 140814,"Humilde Morada");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p7);
        System.out.println(p8);
        System.out.println(p9);
        System.out.println(p10);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
