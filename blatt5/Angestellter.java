public class Angestellter {
	final String vorname;
	final String nachname;
	final int alter;
	final int gehalt;
	
	public Angestellter(String vorname, String nachname, int alter, int gehalt){
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.gehalt = gehalt;
	}
	
	public Angestellter altern(Angestellter a) {
		int neuesAlter = a.alter+1;
		Angestellter angestellterDessenAlterUmEinsErhöhtWurde = new Angestellter(a.vorname, a.nachname, neuesAlter,a.gehalt);
		return angestellterDessenAlterUmEinsErhöhtWurde;
	}
	public Angestellter GehaltErhöhen(int betrag) {
		int neuesGehalt = this.gehalt+betrag;
		Angestellter angestellterDessenGehaltErhöhtWurde = new Angestellter(this.vorname, this.nachname, this.alter,neuesGehalt);
		return angestellterDessenGehaltErhöhtWurde;
	}
}
