package blatt3;

public class Singleton2 {
	private static Singleton2 singleton2;

	public Singleton2() {
		if (singleton2 == null) {
			singleton2 = this;
		}
	}

	public Singleton2 get() {
		return singleton2;
	}

}
