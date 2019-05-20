public class Student {
    // variablen
    private String vorname;
    private String nachname;
    private int matNr;
    private int semester;

    //Konstruktor
    public Student(String vorname, String nachname, int matNr, int semester){
        this.vorname = vorname;
        this.nachname = nachname;
        this.matNr = matNr;
        this.semester = semester;
    }

    // getter Methoden
    public String getVorname(){
        return vorname;
    }
    public String getNachname(){
        return nachname;
    }
    public int getMatNr(){
        return matNr;
    }
    public int getSemester(){
        return semester;
    }

    // Aufgabe
    public void anmelden(Modul m){
        if (m.bearbeiteteAnmeldungen(this) == true){
            System.out.println(this.getVorname()+" "+this.getNachname()+" wurde für das Modul angemeldet");
        }else{
            System.out.println(this.getVorname()+" "+this.getNachname()+" wurde nicht für das Modul angemeldet");
        }
    }
}
