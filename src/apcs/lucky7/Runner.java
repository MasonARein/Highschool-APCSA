package apcs.lucky7;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		int z;
		int y = 0;
		System.out.println("How much money do you have?");
		z=reader.nextInt();
		
		for (;z > 0;) {
			--z;
			System.out.println("");
			double x = Math.random();
			x = (int)((x*10)+2);
			System.out.println("Dice Roll: " + x);
			if (x == 7) {
				z = z + 5;
			}
			System.out.println("Current Amount of Money: " + z);
			y++;
		}
		System.out.println("");
		System.out.println("Number of Rolls:" + y);
		
	}

}
