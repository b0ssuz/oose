public class Main {

    public static void main(String[] args){
        Modul ANA = new Modul("Analyis");
        Modul LA = new Modul("Lineare Algebra");
        Student Peter = new Student("Peter","Müller",3345543,5);
        Peter.anmelden(LA);
        Peter.anmelden(ANA);
    }
}
