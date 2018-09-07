package apcs.pi;

import java.util.Scanner;

public class PiRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int reps;
		double pie = 4.0;
		int evan = 0;
		double deno = 1.0;
		System.out.println("How many times should the process repeat?");
		reps = reader.nextInt();
		
		for(int x = 0; x < reps; x++) {
			deno = deno + 2;
			if(evan%2 == 0){
				pie = pie - 4/deno;
				System.out.println(pie);

			}
			else {
				pie = pie + 4/deno;
				System.out.println( pie);
			}
			evan++;
		}
		System.out.println("Pie approxamation " + pie);
	}

}
