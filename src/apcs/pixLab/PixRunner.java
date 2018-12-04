package apcs.pixLab;

public class PixRunner {

	public static void main(String[] args) {
		// create image from file and display it
		Image i = new Image("p2p.jpg");
		i.display("Peak to Peak");
		
		// or this - it does the same thing
		i.blurImage().display("Blurred");
		i.removeRed().display("Remove Red");
		i.removeGreen().display("Remove Green");
		i.invertColor().display("Invert Color");
		i.blackWhite().display("Black & White");
		i.flipHorizontal().display("Flip Horizontal");
		i.mirrorVertical().display("Mirror Vertical");
		i.mirrorHorizontal().display("Mirror Horizontal");
		i.edgeDetection().display("Edge Detection");

	}

}
