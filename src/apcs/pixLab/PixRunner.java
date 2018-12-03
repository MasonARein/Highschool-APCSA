package apcs.pixLab;

public class PixRunner {

	public static void main(String[] args) {
		// create image from file and display it
		Image i = new Image("p2p.jpg");
		i.display("Peak to Peak");
		
		// or this - it does the same thing
		i.mirrorHorizontal().display("Inverted");
	}

}
