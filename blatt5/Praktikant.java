import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class Praktikant extends Angestellter{

	public Praktikant(String vorname, String nachname, int alter, int gehalt) {
		super(vorname, nachname, alter, 400);
	}
	public void GehaltErhöhen(double erhöhung) throws NotImplementedException{
		throw new NotImplementedException("Das gehalt eines Praktikanten kann nicht erhöht werden!");
	}
}
