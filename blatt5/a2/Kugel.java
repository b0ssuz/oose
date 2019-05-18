public class Kugel extends Körper{
  //radius
  double r;
  public Kugel(int x, int y, int z, int r){
    this.r = r;
  }
  public double getVolumen(){
    return r*r*r*3.14159265*(3/4);
  }
}
