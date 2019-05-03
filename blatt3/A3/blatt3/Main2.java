package blatt3;

public class Main2 {
	public static void main(String[] args) {
		Stereoanlage s=new Stereoanlage();
		Playable pl=new CD();
		s.play(pl);
		pl=(Playable) new Kassette();
		s.play(pl);
	}
}
