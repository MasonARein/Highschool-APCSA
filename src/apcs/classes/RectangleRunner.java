package apcs.classes;

public class RectangleRunner {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle (10, 4);
		System.out.println (r1);
		int w = r1.getWidth();
		int h = r1.getHeight();
		r1.setWidth(h);
		r1.setHeight(w);
		System.out.println (r1);
		System.out.println ("The area of Rectangle is: " + r1.getArea());
		System.out.println ("The diagnol of Rectangle is: " + r1.getDiagonal());
		Rectangle r2 = new Rectangle (1, 5);
		if (r1.equals(r2))
		      System.out.println (r1+"\nis the same as \n"+r2);
		else
		      System.out.println (r1+"\nis the NOT same as \n"+r2);

		Rectangle r3 = new Rectangle (4, 10);
		if (r1.equals(r3))
		      System.out.println (r1+"\nis the same as \n"+r3);
		else
		      System.out.println (r1+"\nis the NOT same as \n"+r3);


	}

}
