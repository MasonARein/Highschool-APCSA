package apcs.grades;

import java.util.Scanner;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many test grades are there?");
		int intake = reader.nextInt();
		double [] grade = new double[intake];
		for(int r =0; r < intake; r++) {
			System.out.println ("Enter a Grade as a Boolean");
			grade[r]=reader.nextDouble();
		}
		Arrays.sort(grade);
		System.out.println (Arrays.toString (grade));
		System.out.println ("The maximum score is: " + max(grade));
		System.out.println ("The minimum score is: " + min(grade));
		System.out.println ("The mean is: " + mean(grade));
		System.out.println ("The median is: " + median(grade));
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
