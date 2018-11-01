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
	 * Sets the current available size of the list and the current size of the list being used
	 * @param val is value taken in to set the size of the list
	 */
	public DoubleList(int val) {
		myList = new double[val];
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
	/**
	 * Adds an item to the end of the DoubleList
	 * Precondition: the list is not full
	 * Postcondition: item is added to the end of the list
	 * @param item the value to be added
	 * @throws RuntimeException if list is full
	*/
	public void add(double newt) {
		if(size() == maxSize()) {
			throw new IndexOutOfBoundsException("The DoubleList is full.");
		}
		else {
			myList[mySize] = newt;
			mySize++;
		}
		
	}
	/**
	 * removes the last item added to the list 
	 */
	public void remove() {
		if(mySize == 0) {
			throw new IndexOutOfBoundsException("The DoubleList is empty.");
		}
		--mySize;
		myList[mySize] = 0.0;

	}
	/**
	 * Searches through the entire list to find the first position of a specified item
	 * @param search is the double/value being searched for in the list
	 * @return the place in the list in which the value is, and if not in the list it returns -1
	 */
	public int indexOf(double search) {
		for(int i = 0; i < mySize; i++) {
			if(myList[i] == search) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * Searches through the entire list to find the last position of a specified item
	 * @param search is the double/value being searched for in the list
	 * @return the place in the list in which the value is, and if not in the list it returns -1
	 */
	public int lastIndexOf(double search) {
		for(int i = mySize-1; i > 0; i--) {
			if(myList[i] == search) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * Searches through the entire list to find if the specified item is in the list
	 * @param search is the double/value being searched for in the list
	 * @return true if the item is in the list and false if not
	 */
	public boolean contains(double search) {
		for(int i = 0; i < mySize; i++) {
			if(myList[i] == search) {
				return true;
			}
		}
		return false;
	}
	public double sum() {
		double total = 0.0;
		for()
	}
	/**
	 * Makes a list that is identical to the list given that can be used to augment a list and keep the original
	 * @param val is the list going to be copied
	 */
	public DoubleList(double[] val) {
		mySize = 0;
		myList = new double[(int) (val.length*1.5)];
		for(double valval: val) {
			this.add(valval);
		}

	}
	/**
	 * Creates a string of all the different values in the list using the spots that are occupied and returns empty if there are no values
	 */
	public String toString() {
		String str = "";
		if(mySize != 0) {
		for(int i = 0; i < mySize; i++) {
			str = str + "[" + i + "]=>" + myList[i] + "; ";
		}
		}
		else {
			str = "Empty";
		}
		return str;
	}
	
}
