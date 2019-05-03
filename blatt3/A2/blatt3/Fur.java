package blatt3;

public class Fur {
	public int length;

	public Fur(int length) {
		this.length = length;
	}

	public String toString() {
		return "Felllaenge: " + length;
	}

	public static Fur getFur() {
		Fur fur = null;
		return fur;
	}
}
