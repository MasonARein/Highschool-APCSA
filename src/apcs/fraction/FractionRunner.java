package apcs.fraction;

public class FractionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction (1, 2);         // represents one-half
		System.out.print ("One Half = ");
		System.out.println (f1);                   // should output   1 / 2
		f1.setNum (3);                       // change numerator to 3
		f1.setDeno (4);                     // change denominator to 4
		int num = f1.getNum ();              // get the numerator
		int den = f1.getDeno ();            // get the denominator
		System.out.print ("Three Quarters = ");
		System.out.println (num + "/" + den);      // should output 3 / 4

	}

}
