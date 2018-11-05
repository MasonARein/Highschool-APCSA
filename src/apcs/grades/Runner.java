package apcs.grades;

import java.util.Scanner;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		boolean repeat = true;
		while(repeat == true) {
		try {
		System.out.println("How many test grades are there?");
		int intake = reader.nextInt();
		double [] grade = new double[intake];
		for(int r =0; r < intake; r++) {
			double bet = 0;
			System.out.println ("Enter a Grade as a Double");
			bet=reader.nextDouble();
			if(bet >= 0.0 && bet <= 100.0) {
			grade[r] = bet;
			}
			else {
				System.out.println ("Between 0-100 Please");
				r--;
			}
			System.out.println ("Enter a Grade as a double(78.0)");
			grade[r]=reader.nextDouble();
		}
		Arrays.sort(grade);
		System.out.println (Arrays.toString (grade));
		System.out.println ("The maximum score is: " + max(grade));
		System.out.println ("The minimum score is: " + min(grade));
		System.out.println ("The mean is: " + mean(grade));
		System.out.println ("The median is: " + median(grade));
		System.out.println ("");
		
		}
		catch (Exception e) {
			reader.nextLine();
			System.out.println("Error: " + e);
		}
		System.out.println ("More Grades? (true or false)");
		repeat = reader.nextBoolean();
		}
	}
	public static double min (double[] arr) {
		double small = 100.0;
		for(int a = 0; a < arr.length;a++ ) {
			 if(small > arr[a]) {
				 small = arr[a];
			 }
		}
		return small;
	}
	public static double max (double[] arr) {
		double large = 0.0;
		for(int a = 0; a < arr.length;a++ ) {
			 if(large < arr[a]) {
				 large = arr[a];
			 }
		}
		return large;
	}
	public static double mean (double[] arr) {
		double total = 0.0;
		for(int a = 0; a < arr.length;a++ ) {
			total = total + arr[a];
		}
		total = total/arr.length;
		return total;
	}
	public static double median (double[] arr) {
		if(arr.length % 2 == 0) {
			double one = arr[arr.length/2];
			double two = arr[arr.length/2 -1 ];
			double avg = (one + two)/2;
			return avg;
		}
		else{
			return arr[(int)(arr.length/2 + 1) ];
		}	
	}
	
}
