public class Quader extends Körper{
	Position seiten;
	Position ecke = p;
	public Quader(int x, int y, int z, int a, int b, int c){
		this.seiten = new Position(a,b,c);
	}
	public void skallieren(int skalar){
		this.seiten.x = skalar * this.seiten.x;
		this.seiten.y = skalar * this.seiten.y;
		this.seiten.z = skalar * this.seiten.z;
	}
	public double volumen(){
		return this.seiten.x * this.seiten.y * this.seiten.z;
	}
}
