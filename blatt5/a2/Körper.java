public class Körper{
    //position
    int x;
    int y;
    int z;
    public Körper(int x, int y, int z){
      this.x = x;
      this.y = y;
      this.z = z;
    }
    public int getX(){
      return x;
    }
    public int getY(){
      return y;
    }
    public int getZ(){
      return z;
    }
    public void scale(double faktor){
      this.x *= faktor;
      this.y *= faktor;
      this.z *= faktor;
    }
}
