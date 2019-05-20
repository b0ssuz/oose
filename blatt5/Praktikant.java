<<<<<<< HEAD
public class Praktikant extends Angestellter{
	
	final int gehalt = 400;
	
	public Praktikant(String vorname, String nachname, int alter, int gehalt) {
		super(vorname, nachname, alter, gehalt);
	}
	public Praktikant GehaltErhöhen(int betrag){
		System.out.println("Das gehalt eines Praktikanten kann nicht erhöht werden!");
		return this;
=======
import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class Praktikant extends Angestellter{

	public Praktikant(String vorname, String nachname, int alter, int gehalt) {
		super(vorname, nachname, alter, 400);
	}
	public void GehaltErhöhen(double erhöhung) throws NotImplementedException{
		throw new NotImplementedException("Das gehalt eines Praktikanten kann nicht erhöht werden!");
>>>>>>> 8f5a7e3d34b880195f8d496c64f4a4d2905535ca
	}
}
