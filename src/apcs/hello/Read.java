package apcs.hello;

import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
		int x;
		System.out.println("Enter an integer");
		x=reader.nextInt();
		System.out.println("You entered: "+x);
		reader.close();
		}
	}


