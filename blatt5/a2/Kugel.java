public class Kugel extends Körper{
	double radius;
	Position mitteplunkt = p;
	public Kugel(int x,int y,int z, double radius){
		this.radius = radius;
	}
	public void skallieren(int skalar){
		this.radius = skalar * this.radius;
	}
	public double volumen(){
		return this.radius * this.radius * this.radius * (4/3) * 3.14159265;
	}
}
