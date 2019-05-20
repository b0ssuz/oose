<<<<<<< HEAD
public class Main1 {
	public static void main(String[] args) {
		Praktikant eins = new Praktikant("vorname","nachname",30,483483);
		System.out.println(eins.gehalt);
		eins.GehaltErhöhen(399);
		System.out.println(eins.gehalt);
		Angestellter a = new Angestellter("angestellter_vorname","nachname_angestellter",20,300);
		a.GehaltErhöhen(399);
		System.out.println(a.gehalt);
=======
import jdk.jshell.spi.ExecutionControl.NotImplementedException;


public class Main1 {
	public static void main(String[] args) {
		Angestellter a1 = new Angestellter("dings","bums",34,444.44);
		System.out.println(a1.getAlter());
		System.out.println(a1.getGehalt());
		a1.altern();
		a1.gehaltErhöhen(299);
		System.out.println(a1.getAlter());
		System.out.println(a1.getGehalt());

		Praktikant p1 = new Praktikant("prakti","kant",16,400);
		System.out.println(p1.getAlter());
		System.out.println(p1.getGehalt());
		p1.altern();
		try{
			p1.gehaltErhöhen(299);
		}catch (NotImplementedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(p1.getAlter());
		System.out.println(p1.getGehalt());
>>>>>>> 8f5a7e3d34b880195f8d496c64f4a4d2905535ca
	}
}
