public abstract class Körper{
	Position p;
	
	public Körper(){} // no argument Constructor

	public Körper(int x,int y, int z){
		this.p = new Position(x,y,z);
	}
	public void bestimme(Körper k){
		if(k instanceof Kugel){
			double volumen = ((Kugel)k).volumen();
			String name = "Kugel";
			System.out.println("Name: "+name+" Volumen: "+volumen+" Position: "+(Kugel)k.p.x /(Kugel)k.p.y/(Kugel)k.p.z);
		}
		if(k instanceof Quader){
			double volumen = ((Quader)k).volumen();
			String name = "Quader";
			System.out.println("Name: "+name+" Volumen: "+volumen+" Position: "+(Quader)k.p.x/(Quader)k.p.y/(Quader)k.p.z);
		}
		else System.out.println("Diesen Körper gibt es nicht");
		
	}
}
