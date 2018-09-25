package apcs.fraction;

public class Fraction {
	private int numerator;
	private int denominator;
	public Fraction (int n, int d) {
	     numerator = n;
	     denominator = d;
	}

	public int getNum() {
		return numerator;
	}

	public void setNum(int num) {
		this.numerator = num;
	}

	public int getDeno() {
		return denominator;
	}

	public void setDeno(int deno) {
		this.denominator = deno;
	}

	@Override
	public String toString () {
		String str;
		str = numerator + " / " + denominator;
		return str;
	}
	Fraction add (Fraction other) {
		int y = this.numerator *other.denominator;
		int x = this.denominator * other.numerator;
		int z = x + y;
		other = z /(this.denominator * other.denominator);
		return other;
		
	}
}
