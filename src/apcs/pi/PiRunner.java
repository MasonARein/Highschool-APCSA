package apcs.pi;

import java.util.Scanner;

public class PiRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int reps;
		int print;
		double pie = 4.0;
		int evan = 0;
		double deno = 1.0;
		int decimal = 0;
		System.out.println("How many times should the process repeat?");
		reps = reader.nextInt();
		System.out.println("Print all terms? (1-Yes 2-No)");
		print = reader.nextInt();
		if(reps < 2) {
			System.out.println("How many times should the process repeat?");
			reps = reader.nextInt();
		}
		
		System.out.println("");
		if(print == 1) {
		System.out.println("Term # \tDenominator \tTerm \t\t\tApproximation");
		}
		
		for(int x = 0; x < reps; x++) {
			deno = deno + 2;
			if(evan%2 == 0){
				pie = pie - 4/deno;
				if(print == 1) {
				System.out.println(x + "\t" + deno + "\t \t" + 4.0/deno + "\t" + pie);
				}
			}
			else {
				pie = pie + 4/deno;
				if(print == 1) {
				System.out.println(x + "\t" + deno + "\t \t" + 4.0/deno + "\t" + pie);
				}
			}
			evan++;
		}
		System.out.println("Pie approxamation " + pie);
		
		System.out.println("To how many decimal places should pi go?");
		decimal = reader.nextInt();
		if(decimal < 2) {
			System.out.println("To how many decimal places should pi go?");
			decimal = reader.nextInt();
		}
		deno = 1.0;
		evan = 0;
		for(int x = 0; x < reps; x++) {
			deno = deno + 2;
			if(evan%2 == 0){
				pie = pie - 4/deno;
			}
			else {
				pie = pie + 4/deno;
			}
			evan++;
		}
	}

}
