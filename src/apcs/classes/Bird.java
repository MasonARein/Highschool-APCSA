package apcs.classes;

public class Bird {
	private int weight;
	public Bird(int w) {
		weight = w;
	}
	public String toString () {
		return "This Bird weighs: " + weight + " ounces";
	}
	public void speak () {
		System.out.println ("Honk, honk, honk");
	}

}
