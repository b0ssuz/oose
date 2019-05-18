public class Main1 {
	public static void main(String[] args) {
		Praktikant eins = new Praktikant("vorname","nachname",30,483483);
		System.out.println(eins.gehalt);
		eins.GehaltErhöhen(399);
		System.out.println(eins.gehalt);
		Angestellter a = new Angestellter("angestellter_vorname","nachname_angestellter",20,300);
		a.GehaltErhöhen(399);
		System.out.println(a.gehalt);
	}
}
