package apcs.objectList.copy;

import apcs.fraction.Fraction;

public class FracRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectList<Fraction> fracs = new ObjectList<Fraction>();
		
		for (int i=1; i<20; i++) {
			int denom = (int)(Math.random()*10+1);
			fracs.add(new Fraction(1,denom));
		}
		
		System.out.println(fracs);
	}

}
