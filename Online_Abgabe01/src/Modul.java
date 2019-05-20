import java.util.*;

public class Modul {
    // variablen
    private String name;

    // ArrayListe mit Hoerern des Moduls (Studenten)
    private ArrayList<Student> hoerer = new ArrayList<>();

    //getter Methode
    public Modul(String name){
        this.name = name;
    }

    // Methode um Studenten zu einem Modul anzumelden
    public boolean bearbeiteteAnmeldungen(Student s){
        if(hoerer.size() <= 100){
            hoerer.add(s);
            return true;
        }else{
            return false;
        }
    }
}
