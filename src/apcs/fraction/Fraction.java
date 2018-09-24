package apcs.fraction;

public class Fraction {
	private int num;
	private int deno;
	public Fraction (int n, int d) {
	     num = n;
	     deno = d;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDeno() {
		return deno;
	}

	public void setDeno(int deno) {
		this.deno = deno;
	}

	public String toString () {
		String str;
		str = num + " / " + deno;
		return str;
	}
}
