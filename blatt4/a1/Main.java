public class Main{
	public static void main(String args[]){
		Auto auto1 = new Lastwagen();
		System.out.println(auto1.reifen);
		System.out.println(((Lastwagen) auto1).reifen);
		System.out.println(auto1.getReifen());
		System.out.println(((Lastwagen) auto1).getReifen());
	}
}
