public class Praktikant extends Angestellter{
	
	final int gehalt = 400;
	
	public Praktikant(String vorname, String nachname, int alter, int gehalt) {
		super(vorname, nachname, alter, gehalt);
	}
	public Praktikant GehaltErhöhen(int betrag){
		System.out.println("Das gehalt eines Praktikanten kann nicht erhöht werden!");
		return this;
	}
}
