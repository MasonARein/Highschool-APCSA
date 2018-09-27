package apcs.fraction;

import java.util.Scanner;

public class FractionRunner {

	public static void main(String[] args) {
		Fraction f1 = new Fraction (1, 2);         // represents one-half
		System.out.print ("One Half = ");
		System.out.println (f1);                   // should output   1 / 2
		f1.setNumerator (3);                       // change numerator to 3
		f1.setDenominator (4);                     // change denominator to 4
		int num = f1.getNumerator ();              // get the numerator
		int den = f1.getDenominator ();            // get the denominator
		System.out.print ("Three Quarters = ");
		System.out.println (num + "/" + den);   
		Fraction f2 = new Fraction (2, 3);
		System.out.print ("Two Thirds = ");
		System.out.println (f2);
		Fraction sum = f1.add(f2);
		System.out.println (f1 + " + " + f2 + " = " + sum);
		f2 = new Fraction (1, 2);
		sum = f1.add(f2);
		Fraction difference = f1.subtract(f2);
		Fraction product = f1.multiply(f2);
		Fraction quotient = f1.divide(f2);

		System.out.println ("f1: " + f1);
		System.out.println ("f2: " + f2);
		System.out.println ("sum: " + sum);
		System.out.println ("difference: " + difference);
		System.out.println ("product: " + product);
		System.out.println ("quotient: " + quotient);
// should output 3 / 4
		f1 = new Fraction (1, 2);
		f2 = new Fraction (1, 2);
		System.out.println (f1 + "==" + f2 + " = " + f1.equals (f2));
		System.out.println (f2 + "==" + f1 + " = " + f2.equals (f1));

		f2 = new Fraction (1, 3);
		System.out.println (f1 + "==" + f2 + " = " + f1.equals (f2));
		System.out.println (f2 + "==" + f1 + " = " + f2.equals (f1));

		f2 = new Fraction (2, 4);
		System.out.println (f1 + "==" + f2 + " = " + f1.equals (f2));
		System.out.println (f2 + "==" + f1 + " = " + f2.equals (f1));
		
		System.out.println ("Enter Numerator Value");
		Scanner reader = new Scanner (System.in);
		int numval = reader.nextInt ();
		System.out.println ("Enter Denominator Value");
		Scanner reader1 = new Scanner (System.in);
		int denoval = reader1.nextInt ();
		System.out.println ("Enter operation(add, sub, mult, div)");
		Scanner reader2 = new Scanner (System.in);
		String operation = reader2.next ();
		if(operation.equals("add") == false) {
			if(operation.equals("sub") == false) {
				if(operation.equals("mult") == false) {
					if(operation.equals("div") == false) {
						System.out.println ("Enter operation(add, sub, mult, div)");
						reader2 = new Scanner (System.in);
						operation = reader2.next ();
					}
				}
			}
		}
		System.out.println ("Enter Numerator Value");
		Scanner reader3 = new Scanner (System.in);
		int numval2 = reader3.nextInt ();
		System.out.println ("Enter Denominator Value");
		Scanner reader4 = new Scanner (System.in);
		int denoval2 = reader4.nextInt ();
		

		f1.setNumerator (numval);                  
		f1.setDenominator (denoval); 
		f2 = new Fraction (numval2, denoval2);
		Fraction total = f2;
		
		if(operation.equals("add")) {
			total = f1.add(f2);
		}
		else if(operation.equals("sub")) {
			total = f1.subtract(f2);
		}
		else if(operation.equals("mult")) {
			total = f1.multiply(f2);
		}
		else if(operation.equals("div")) {
			total = f1.divide(f2);
		}
		System.out.println ("The anwser is: " + total);

	}

}
