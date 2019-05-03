package blatt3;

public class Sheep implements Cloneable {
	public String name;
	public Fur fur;

	public Sheep(String name, Fur fur) {
		this.name = name;
		this.fur = fur;
	}

	public String getName() {
		return name;
	}

	public Fur getFur() {
		return fur;
	}

	public void shear() {
		fur.length = 0;
	}

	public String toString() {
		return "Name: " + name + " " + fur.toString();
	}

	public Sheep clone() {
		return this;
	}

	public Sheep shallowClone() {
		Sheep sClone = new Sheep(this.getName(), this.getFur());
		return sClone;
	}

	public Sheep deepClone() {
		return new Sheep(this.name, new Fur(this.fur.length));
	}

	public boolean equal(Object o) {
		if (o instanceof Sheep) {
			Sheep s = (Sheep) o;
			return s.name == this.name && s.fur == this.fur;
		} else {
			return false;
		}
	}
}
