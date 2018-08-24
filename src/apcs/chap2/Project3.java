package apcs.chap2;

import java.util.Scanner;

public class Project3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in);
		int x;
		double y;
		System.out.println("Enter an kilometer to be converted into Nautical Miles:");
		x=reader.nextInt();
		y=x*0.539957;
		System.out.println(x + " kilometers is: " + y + " Nautical Miles");
		reader.close();
	}

}
