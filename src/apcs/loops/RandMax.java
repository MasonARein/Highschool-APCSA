package apcs.loops;

public class RandMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double z = -1;
		for(int x = 0; x < 10; x++) {
			double y = Math.random();
			y = y - 1;
			System.out.println( y );
			if(z < y) {
				z = y;
			}
		}
		System.out.println("The largest value was " + z );

	}

}
