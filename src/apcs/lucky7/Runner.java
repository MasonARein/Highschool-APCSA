package apcs.lucky7;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		int z;
		int y = 0;
		int w = 0;
		int v = 0;
		System.out.println("How much money do you have?");
		z=reader.nextInt();
		
		for (;z > 0;) {
			++y;
			z--;
			System.out.println("");
			double x = Math.random();
			x = (int)((x*10)+2);
			System.out.println("Dice Roll: " + y);
			System.out.println("Result: " + x);
			if (x == 7) {
				z = z + 5;
			}
			if (z > w) {
				w = z;
				v = y;
			}
			System.out.println("Current Amount of Money: " + z);
		}
		System.out.println("");
		System.out.println("Number of Rolls:" + y);
		System.out.println("The max amount of money was " + w + " at roll number " + v);

		
	}

}
