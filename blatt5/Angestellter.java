<<<<<<< HEAD
public class Angestellter {
	final String vorname;
	final String nachname;
	final int alter;
	final int gehalt;
	
	public Angestellter(String vorname, String nachname, int alter, int gehalt){
=======
import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class Angestellter {
	final String vorname;
	final String nachname;
	private int alter;
	private double gehalt;

	public Angestellter(String vorname, String nachname, int alter, double gehalt){
>>>>>>> 8f5a7e3d34b880195f8d496c64f4a4d2905535ca
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.gehalt = gehalt;
	}
<<<<<<< HEAD
	
	public Angestellter altern(Angestellter a) {
		int neuesAlter = a.alter+1;
		Angestellter angestellterDessenAlterUmEinsErhöhtWurde = new Angestellter(a.vorname, a.nachname, neuesAlter,a.gehalt);
		return angestellterDessenAlterUmEinsErhöhtWurde;
	}
	public Angestellter GehaltErhöhen(int betrag) {
		int neuesGehalt = this.gehalt+betrag;
		Angestellter angestellterDessenGehaltErhöhtWurde = new Angestellter(this.vorname, this.nachname, this.alter,neuesGehalt);
		return angestellterDessenGehaltErhöhtWurde;
=======

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
>>>>>>> 8f5a7e3d34b880195f8d496c64f4a4d2905535ca
	}
}
