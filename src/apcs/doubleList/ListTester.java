package apcs.doubleList;

public class ListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Testing Constructor");
		DoubleList aList = new DoubleList ();
		System.out.println ("size: " + aList.size());
		System.out.println ("max size: " + aList.maxSize());
		System.out.println ("Testing add and toString");
		System.out.println ("List is: " + aList);
		aList.add (12.0);
		aList.add (-1.0E305);
		System.out.println ("List is: " + aList);
		for (int i = 0; i<18; i++) aList.add ((double)i);
	
		try {
		   aList.add (100.0);  // generates an Exception
		}
		catch (Exception e) {
		   System.out.println ("Error: " + e);
		}
		System.out.println ("List is: " + aList);
		DoubleList bList = new DoubleList (35);
		for (int i = 0; i<27; i++) bList.add ((double)i);
		bList.remove();
		System.out.println ("List is: " + bList);
	}

}
