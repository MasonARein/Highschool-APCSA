package apcs.loops;

import java.util.Scanner;

public class DiceStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
		
		int z;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		System.out.println("How many times is the die going to be rolled?");
		z=reader.nextInt();
		
		for(int y = 0; y < z; y++ ) {
			double x = Math.random();
			x = (int)((x*5)+1);
			System.out.println("Die Roll " + (y+1) + ": " + x);
			if (x == 1.0) {
				a++;
			}
			if (x == 2.0) {
				b++;
			}
			if (x == 3.0) {
				c++;
			}
			if (x == 4.0) {
				d++;
			}
			if (x == 5.0) {
				e++;
			}
			if (x == 6.0) {
				f++;
			}
		}
		System.out.println("1 appeared " + a + " times");
		System.out.println("2 appeared " + b + " times");
		System.out.println("3 appeared " + c + " times");
		System.out.println("4 appeared " + d + " times");
		System.out.println("5 appeared " + e + " times");
		System.out.println("6 appeared " + f + " times");
		reader.close();
		
		
	}

}
