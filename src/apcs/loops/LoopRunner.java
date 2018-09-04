package apcs.loops;

public class LoopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 7;
		int c = 12;
		int d = 100;

		while(a <= 8) {
			System.out.print(a + ", ");
			a++;
		}
		
		System.out.println("");

		while(b <= 12) {
			System.out.print(b + ", ");
			b++;
		}
		System.out.println("");
		while(c <= 30) {
			System.out.print(c + ", ");
			c+=3;
		}
		System.out.println("");
		while(d >= 0) {
			System.out.print(d + ", ");
			d-=2;
		}
	}

}
