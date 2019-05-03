package blatt2;

public class Werft {
	public static void main(String[] args) {
	}
	public void produziereSchiff(String name, double length, Schifffahrtsamt amt) {
		Schiff newSchiff = new Schiff(name,length);
		amt.registriereSchiff(newSchiff);
		newSchiff.setKennzeichen(Schifffahrtsamt.getKennzeichen());
	}
}
