package apcs.loops;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i<25; i++) {
			System.out.print( i + " " );
			if (i%2 == 0) {
				System.out.println(" Even");
			}
			else {
				System.out.println(" Odd");
			}
		}
	}

}
