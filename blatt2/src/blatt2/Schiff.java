package blatt2;


public class Schiff {
	public Schiff(String name, double length) {
		this.name = name;
		this.length = length;
	}
	private String name;
	private String kennzeichen;
	private double length;
	
	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}
	public String empfangeNachricht(String msg) {
		return("Empfangen von: "+this.name+" Kennzeichen: "+this.kennzeichen+ " Nachricht: "+msg);
	}
}
