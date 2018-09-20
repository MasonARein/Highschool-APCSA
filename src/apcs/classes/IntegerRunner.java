package apcs.classes;

public class IntegerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInteger i1;
		i1 = new MyInteger (10);
		int x;
		x = i1.intValue();
		System.out.println("i1 = " + x);
		
		MyInteger i2;
		i2 = new MyInteger (10);

		String s;
		s = i2.toString();
		System.out.println ("i2 = " + s);
		
		MyInteger i3;
		i3 = new MyInteger (20);


		System.out.println ("i3 = " + i3);

	}

}
