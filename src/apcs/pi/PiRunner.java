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
		
		System.out.println("");
		
		pie = 4.0;
		evan = 0;
		deno = 1.0;
		decimal = 0;
		long loops = 0;
		double repeat = 0.0;
		System.out.println("To how many decimal places should pi go?");
		decimal = reader.nextInt();
		if(decimal < 2) {
			System.out.println("To how many decimal places should pi go?");
			decimal = reader.nextInt();
		}
		decimal = (int) Math.pow(10, decimal);
		while((int)(pie * decimal) != (int)(repeat * decimal)){
			deno = deno + 2;
			loops += 1;
			repeat = pie;
			if(evan%2 == 0){
				pie = pie - 4/deno;
			}
			else {
				pie = pie + 4/deno;
			}
			evan++;
		}
		System.out.println(repeat);
		System.out.println("Number of loops through program:" + loops);
		
		System.out.println("");
		System.out.println("Points in a circle to find pi");
		System.out.println("");
		
		int points;
		System.out.println("How many points should be used to determine pi?");
		points = reader.nextInt();
		if(points < 100) {
			System.out.println("How many points should be used to determine pi?");
			points = reader.nextInt();
		}
		double cirle = 0.0;
		for(int i =0;i < points;i++) {
			double x =(Math.random()*2)-1;
			double y =(Math.random()*2)-1;
			if((Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
				cirle += 1;
			}
		}
		double total = (cirle/points) * 4.0;
		System.out.println(total);
		
		reader.close();
	}

}
