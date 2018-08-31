package apcs.loops;

public class RandRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		double a = 0;
		int f = 10;
		int e = 0;
		int h = 10;
		int u = 10;
		int q = 10;
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
		}
		System.out.println(" ");
		System.out.println("3.");
		while(f > 0) {
			double d = Math.random();
			if(d >= 0.5) {
				e = e + 1;
			}
			System.out.println(d);
			f--;
		}
		System.out.println("There were: " + e + " numbers over 0.5");
		System.out.println(" ");
		System.out.println("4.");
		while(h >= 1) {
			double y = Math.random();
			y *= 10;
			System.out.println(y);
			h--;
		}
		System.out.println(" ");
		System.out.println("5.");
		while(u >= 1) {
			double y = Math.random();
			y = (30 * y) + 70;
			System.out.println(y);
			u--;
		}
		System.out.println(" ");
		System.out.println("6.");
		while(q >= 1) {
			double y = Math.random();
			y = (int)((5 * y) + 1);
			System.out.println(y);
			q--;
		}
	}

}
