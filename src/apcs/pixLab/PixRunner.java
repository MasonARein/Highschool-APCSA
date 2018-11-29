package apcs.pixLab;

public class PixRunner {

	public static void main(String[] args) {
		// create image from file and display it
		Image i = new Image("p2p.jpg");
		i.display("Peak to Peak");
		
		// remove blue from image and display the new image
		Image i2 = i.removeBlue();
		i2.display("No Blue");
		
		// or this - it does the same thing
		i.blackWhite().display("Inverted");
	}

}
