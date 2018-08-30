package apcs.loops;

public class RandRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		double a = 0;
		System.out.println("1.");
		while(x >= 1) {
			double y = Math.random();
			System.out.println(y);
			x--;
		}
		System.out.println(" ");
		System.out.println("2.");
		while(a <= 0.9) {
			a = Math.random();
			System.out.println(a);
			x--;
		}
	}

}
