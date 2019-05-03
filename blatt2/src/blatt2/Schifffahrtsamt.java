package blatt2;

import java.util.*;

public class Schifffahrtsamt {
	public static void main(String[] args) {
	}
	Schiff[] Schiffe = new Schiff[50];
	int anzahl = 0;
	public void registriereSchiff(Schiff s) {
		this.Schiffe[anzahl++] = s;
	}
	public void meldung(String nachricht, int dringlichkeit) {
		if (dringlichkeit == 1) {
			for (int i = 0; i < anzahl; i++) {
				System.out.println((this.Schiffe[i]).empfangeNachricht(nachricht));
			}
		}
	}
	public static String getKennzeichen() {
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			sb.append((char)((rnd.nextInt(25)+65)));
		}
		return sb.toString();
	}
}
