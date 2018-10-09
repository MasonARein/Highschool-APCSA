package apcs.tryCatch;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val;
		Scanner reader = new Scanner (System.in);
		System.out.println ("Enter an integer:");
		do {
		System.out.println ("That is not a valid int, try again:");
		try {
		val = reader.nextInt();
		}
		catch (Exception e) {
			String wrong = reader.nextLine();
			System.out.println (wrong + " " + e);
			val = -1;
		}
	}
		while(val == -1 && val <= 0 && val >= 100);
		System.out.println (val);

	}

}
