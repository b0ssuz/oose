package blatt3;

public class Main {
	public static void main(String[] args) {
		Fur f1 = new Fur(10);
		Sheep s1 = new Sheep("Shawn", f1);
		Sheep s2 = s1.deepClone();
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		s2.name = "Shawns_Clone";
		s2.shear();
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1.equals(s2));

	}
}
