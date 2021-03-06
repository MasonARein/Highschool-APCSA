package apcs.objectList;

public class MrHRunner {
	public static void main (String args[]) {
		System.out.println ("Testing Default Constructor");
		ObjectList aList;
		aList = new ObjectList ();
		
		System.out.print ("size (0): ");
		try {System.out.println (aList.size());}
		catch (Exception e) {System.out.println ("Error: " + e);}

		System.out.print ("max size (20): ");
		try {System.out.println (aList.maxSize());}
		catch (Exception e) {System.out.println ("Error: " + e);}

		
		System.out.println ("\n\nTesting add and toString");
		System.out.print ("List is (Empty List): ");
		try {System.out.println (aList);}
		catch (Exception e) {System.out.println ("Error: " + e);}

		try {
			aList.add (12.0);
			aList.add (-1.0E305);
			System.out.println ("List is ([0]=>12.0; [1]=>-1.0E305;): " + aList);
			for (int i = 0; i<18; i++) aList.add ((Object)i);
			System.out.println ("List is (full list through index 19): " + aList);
		}
		catch (Exception e) {System.out.println ("Error: " + e);}

		System.out.println("Attempt to add to full list - should not throw an exception");
		try {aList.add (100.0);}
		catch (Exception e) {System.out.println ("Error: " + e);}

		// capacity should now be 30

		System.out.print ("max size (30): ");
		try {System.out.println (aList.maxSize());}
		catch (Exception e) {System.out.println ("Error: " + e);}

		// test overloaded constructor
		
		System.out.println ("\n\nTesting pre-sized constructor");
		try {aList = new ObjectList (3);}
		catch (Exception e) {System.out.println ("Error: " + e);}
		System.out.print ("size (0): ");
		try {System.out.println(aList.size());}
		catch (Exception e) {System.out.println ("Error: " + e);}
		System.out.print ("max size (3): ");
		try{System.out.println(aList.maxSize());}
		catch (Exception e) {System.out.println ("Error: " + e);}
		System.out.print ("List (Empty List): ");
		try{System.out.println(aList);}
		catch (Exception e) {System.out.println ("Error: " + e);}

		// test overloaded constructor
		
		System.out.println ("\n\nTesting array constructor");
		try {aList = new ObjectList (new Object[] {1.0, 2.0, 3.0});}
		catch (Exception e) {System.out.println ("Error: " + e);}
		System.out.print ("size (3): ");
		try {System.out.println(aList.size());}
		catch (Exception e) {System.out.println ("Error: " + e);}
		System.out.print ("max size (4): ");
		try{System.out.println(aList.maxSize());}
		catch (Exception e) {System.out.println ("Error: " + e);}
		System.out.print ("List ([0]=>1.0; [1]=>2.0; [2]=>3.0): ");
		try{System.out.println(aList);}
		catch (Exception e) {System.out.println ("Error: " + e);}

		// test remove
		
		System.out.print ("\n\nTesting remove\nList is:");
		try{
			aList = new ObjectList (new Object[] {1.0, 2.0, 3.0});
			System.out.println(aList);
		}
		catch (Exception e) {System.out.println ("Error: " + e);}
		for (int i=0; i<3; i++) {
			System.out.print ("Removed: ");
			try{
				System.out.println(aList.remove());
				System.out.println ("List is now: " + aList);
			}
			catch (Exception e) {System.out.println ("Error: " + e);}
		}
		try{ 
			System.out.println ("Attempt to remove from an empty list:");
			System.out.println(aList.remove());
		}
		catch (Exception e) {System.out.println ("Error: " + e);}

		// test indexOf
		System.out.println ("\n\nTesting indexOf");
		try {
			aList = new ObjectList (new Object[] {3.0, 2.0, 3.0});
		
			System.out.println ("List: " + aList);
			System.out.println ("Locating 3.0 (0):" + aList.indexOf (3.0));
			System.out.println ("Locating 0.0 (-1):" + aList.indexOf (0.0));
		}
		catch (Exception e) {System.out.println ("Error: " + e);}

// test lastIndexOf

		System.out.println ("\n\nTesting lastIndexOf");
		try {
			aList = new ObjectList (new Object[] {3.0, 2.0, 3.0});
		
			System.out.println ("List: " + aList);
			System.out.println ("Locating 3.0 (2):" + aList.lastIndexOf (3.0));
			System.out.println ("Locating 0.0 (-1):" + aList.lastIndexOf (0.0));
		}
		catch (Exception e) {System.out.println ("Error: " + e);}

// test contains

		System.out.println ("\n\nTesting contains");
		try {
			aList = new ObjectList (new Object[] {3.0, 2.0, 3.0});
		
			System.out.println ("List: " + aList);
			System.out.println ("Checking for 3.0 (true):" + aList.contains (3.0));
			System.out.println ("Checking for 0.0 (false):" + aList.contains (0.0));
		}
		catch (Exception e) {System.out.println ("Error: " + e);}

		// test sum, mean, min, max
		
//		System.out.println ("\n\nTesting sum, mean, min, max");
//		try {
//			aList = new ObjectList ();
//		
//			System.out.println ("List: " + aList);
//			System.out.println ("Sum (0.0): " + aList.sum());
//		}
//		catch (Exception e) {System.out.println ("Error: " + e);}
//
//		System.out.println ("Attempt to get mean, min, and max of an empty list:");
//		System.out.print ("Mean (Error): ");
//		try {System.out.println(aList.mean());}
//		catch (Exception e) {e.printStackTrace();}
//		
//		System.out.print ("Min (Error): ");
//		try {System.out.println(aList.minimum());}
//		catch (Exception e) {e.printStackTrace();}
//		
//		System.out.print ("Max (Error): ");
//		try {System.out.println(aList.maximum());}
//		catch (Exception e) {e.printStackTrace();}
//
//		System.out.println ("Attempt to get sum, mean, min, and max of a valid list:");
//		try {
//			aList = new ObjectList (new Object[] {1.0, 2.0, 3.0});
//			System.out.println ("List: " + aList);
//			System.out.println ("Sum (6.0): " + aList.sum());
//			System.out.println ("Mean (2.0): " + aList.mean());
//			System.out.println ("Min (1.0): " + aList.minimum());
//			System.out.println ("Max (3.0): " + aList.maximum());
//		}
//		catch (Exception e) {e.printStackTrace();
//		}
		// test get/set
		
		System.out.println ("\n\nTesting get/set");
		try {
			aList = new ObjectList (new Object[] {1.0, 2.0, 3.0});
			System.out.println ("List is: " + aList);
		}
		catch (Exception e) {e.printStackTrace();}
		
		for (int i=-1; i<4; i++) {
			System.out.print ("Getting item " + i + ": ");
			try {System.out.println(aList.get(i));} 
			catch (Exception e) {e.printStackTrace();}
			try {
				System.out.print ("Setting item " + i + " to " + (3.0 - i) + ": ");
				aList.set(i, 3.0-i);
				System.out.println(aList);
			} 
			catch (Exception e) {e.printStackTrace();}
		}
		// test indexed add/remove
		
		System.out.println ("\n\nTesting indexed add/remove");
		try {
			aList = new ObjectList (new Object[] {5.0, 6.0, 7.0});
			System.out.println ("List ([0]=>5.0; [1]=>6.0; [2]=>7.0;): " + aList);
		}
		catch (Exception e) {e.printStackTrace();}
		System.out.println ("Adding to negative index (error):");
		try {aList.add(-1, 4.0);} 
		catch (Exception e) {e.printStackTrace();}

		System.out.println ("Adding to out of range index (error):");
		try {aList.add(4, 4.0);} 
		catch (Exception e) {e.printStackTrace();}

		System.out.println ("Adding to index 1 (valid)");
		try {
			aList.add(1, 4.0);
			System.out.println ("List ([0]=>5.0; [1]=>4.0; [2]=>6.0; [3]=>7.0;): " + aList);		
		} 
		catch (Exception e) {e.printStackTrace();}
		
		
		System.out.println ("Adding to out of bounds index (error)");
		try {aList.add(99, 4.0);} 
		catch (Exception e) {e.printStackTrace();}

		System.out.println ("Removing a negative index (error)");
		try {aList.remove(-1);} 
		catch (Exception e) {e.printStackTrace();}
	
		System.out.println ("Removing an out of bounds index (error)");
		try {aList.remove(99);} 
		catch (Exception e) {e.printStackTrace();}

		System.out.println ("Removing item 1 (valid):");
		try {
			aList.remove(1);
			System.out.println ("List ([0]=>5.0; [1]=>6.0; [2]=>7.0;): " + aList);
		} 
		catch (Exception e) {e.printStackTrace();}

		System.out.println ("Removing an out of range index (error):");
		try {aList.remove(4);} 
		catch (Exception e) {e.printStackTrace();}

		// test clear/isEmpty
		
		System.out.println ("\n\nTesting clear/isEmpty");
		try{
			aList = new ObjectList (new Object[] {5.0, 6.0, 7.0});
			System.out.println ("List : " + aList + " isEmpty (false): " + aList.isEmpty());
			aList.clear();
			System.out.println ("List (Empty List): " + aList + " isEmpty (true): " + aList.isEmpty());
		}
		catch (Exception e) {e.printStackTrace();}
		
		// test equals
		
		System.out.println ("\n\nTesting equals");
		
		try {
			aList = new ObjectList (new Object[] {1.0, 2.0, 3.0});
			ObjectList bList = new ObjectList (new Object[] {-99.0, 2.0, 3.0});
			
			System.out.println ("aList: " + aList);
			System.out.println ("bList: " + bList);
			System.out.println ("aList equals bList (false): " + aList.equals(bList));
			System.out.println ("bList equals aList (false): " + bList.equals(aList));
			
			bList.set(0,  1.0);
			System.out.println ("\naList: " + aList);
			System.out.println ("bList: " + bList);
			System.out.println ("aList equals bList (true): " + aList.equals(bList));
			System.out.println ("bList equals aList (true): " + bList.equals(aList));
	
			bList.add(4.0);
			System.out.println ("\naList: " + aList);
			System.out.println ("bList: " + bList);
			System.out.println ("aList equals bList (false): " + aList.equals(bList));
			System.out.println ("bList equals aList (false): " + bList.equals(aList));
		}
		catch (Exception e) {e.printStackTrace();}
	}


}
