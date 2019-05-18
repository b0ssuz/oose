import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class Angestellter {
	final String vorname;
	final String nachname;
	private int alter;
	private double gehalt;

	public Angestellter(String vorname, String nachname, int alter, double gehalt){
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.gehalt = gehalt;
	}

	public void altern() {
		this.alter++;
	}
	public void gehaltErhöhen(double erhöhung){
		this.gehalt += erhöhung;
	}
	public String getVorname(){
		return vorname;
	}
	public String getNachname(){
		return nachname;
	}
	public int getAlter(){
		return alter;
	}
	public double getGehalt(){
		return gehalt;
	}
}
