package blatt3;

public class Singleton {
	private static Singleton singleton;

	private Singleton() {
		singleton = this;
	}

	public static Singleton get() {
		if (singleton == null) {
			return new Singleton();

		} else {
			return singleton;
		}

	}
}
