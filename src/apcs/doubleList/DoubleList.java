package apcs.doubleList;

/**
 * Creates a list of doubles that can have the size be changed
 * @author marein01
 *
 */
public class DoubleList {
	private double[] myList;
	private int mySize;
	
	/**
	 * Sets the current available size of the list and the current size of the list being used
	 */
	public DoubleList() {
		myList = new double[20];
		mySize = 0;
	}
	
	/**
	 * Current effective size
	 * @return the current size of the list
	 */
	public int size() {
		return mySize;
	}
	/**
	 * Max available space
	 * @return the maximum size of the list
	 */
	public int maxSize() {
		return myList.length;
	}
	public void add(double newt) {
		if(size() == maxSize()) {
			throw new IndexOutOfBoundsException("The DoubleList is full.");
		}
		else {
			myList[mySize] = newt;
			mySize++;
		}
		
	}
	
	public String toString() {
		String str ="";
		return str;
	}
}
