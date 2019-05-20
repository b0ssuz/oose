public class Kugel extends Körper{
<<<<<<< HEAD
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
=======
  //radius
  double r;
  public Kugel(int x, int y, int z, int r){
    this.r = r;
  }
  public double getVolumen(){
    return r*r*r*3.14159265*(3/4);
  }
>>>>>>> 8f5a7e3d34b880195f8d496c64f4a4d2905535ca
}
