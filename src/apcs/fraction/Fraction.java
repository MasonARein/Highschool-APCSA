package apcs.fraction;

/**
 * Uses operations on a set of two fractions and also models fractions using numerator and denominator fractions.
 * 
 * @author marein01
 *
 */
public class Fraction {
	private int numerator;
	private int denominator;
	/**
	 * Uses two integer values that together to construct a fraction
	 * @param n is the value equal to the numerator 
	 * @param d is the value equal to the denominator 
	 */
	public Fraction (int n, int d) {
	     numerator = n;
	     denominator = d;
	}

	/**
	 * gets the value of the numerator
	 * @return the numerator
	 * 
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * sets the value of numerator
	 * @param num sets the value of numerator
	 */
	public void setNumerator(int num) {
		this.numerator = num;
	}

	/**
	 * gets the value of the denominator
	 * @return the denominator
	 * 
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * sets the value of numerator
	 * @param deno sets the value of numerator
	 */
	public void setDenominator(int deno) {
		this.denominator = deno;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString () {
		String str;
		str = numerator + "/" + denominator;
		return str;
	}
	/**
	 * Adds together two fraction values into one
	 * @param input other fraction item
	 * 
	 * @return the return value is the fraction of the two fractions being added together
	 * 
	 */
	Fraction add (Fraction input) {
		int topa = this.numerator *input.denominator;
		int topb = this.denominator * input.numerator;
		int top = topa + topb;
		Fraction total = new Fraction (top, (this.denominator * input.denominator));  
		return total;
		
	}
	/**
	 * Subtracts two different fraction values into one
	 * @param input other fraction item
	 * @return the return value is the fraction of the two fractions being subtracted together
	 * 
	 */
	Fraction subtract (Fraction input) {
		int topa = this.numerator *input.denominator;
		int topb = this.denominator * input.numerator;
		int top = topa - topb;
		Fraction total = new Fraction (top, (this.denominator * input.denominator));  
		return total;
		
	}
	/**
	 * Multiplies together two fraction values into one
	 * @param input other fraction item
	 * 
	 * @return the return value is the fraction of the two fractions being multiplied together
	 * 
	 */
	Fraction multiply (Fraction input) {
		int topa = this.numerator *input.numerator;
		int topb = this.denominator * input.denominator;
		Fraction total = new Fraction (topa, topb);
		return total;
		
	}
	/**
	 * Divides two different fraction values into one
	 * @param input other fraction item
	 * 
	 * @return the return value is the fraction of the two fractions being divided together
	 * 
	 */
	Fraction divide (Fraction input) {
		int topa = this.numerator *input.denominator;
		int topb = this.denominator * input.numerator;
		Fraction total = new Fraction (topa, topb);  
		return total;
		
	}
	/**
	 * Compares two different fraction values to see if they are equal
	 * @param input other fraction item
	 * @return true or false on if fraction is equal to other fraction
	 */
	public boolean equals (Fraction input) {
		int crossone = (int)this.numerator * input.denominator;
		int crosstwo = (int)this.denominator * input.numerator;
		if(crossone == crosstwo) {
			return true;
		}
		return false;
	}

}
