package apcs.doubleList;

/**
 * Creates a list of doubles that can have the size be changed
 * 
 * @author marein01
 *
 */
public class DoubleList {
	private double[] myList;
	private int mySize;

	/**
	 * Sets the current available size of the list and the current size of the list
	 * being used
	 */
	public DoubleList() {
		myList = new double[20];
		mySize = 0;
	}

	/**
	 * Sets the current available size of the list and the current size of the list
	 * being used
	 * 
	 * @param val is value taken in to set the size of the list
	 */
	public DoubleList(int val) {
		myList = new double[val];
		mySize = 0;
	}

	/**
	 * Current effective size
	 * 
	 * @return the current size of the list
	 */
	public int size() {
		return mySize;
	}

	/**
	 * Max available space
	 * 
	 * @return the maximum size of the list
	 */
	public int maxSize() {
		return myList.length;
	}

	/**
	 * Creates a new list of 1.5 size of the current list and assigns all the values
	 * of the items in the previous list into the new list. It then sets the address
	 * of the new list to the old one
	 */
	private void expand() {
		double[] newList = new double[((int) (size() * 1.5))];
		for (int i = 0; i < size(); i++) {
			newList[i] = this.myList[i];
		}
		myList = newList;

	}

	/**
	 * Adds an item to the end of the DoubleList Precondition: the list is not full
	 * Postcondition: item is added to the end of the list
	 * 
	 * @param newt the value to be added
	 * @throws RuntimeException if list is full
	 */
	public void add(double newt) {
		if (size() == maxSize()) {
			expand();
		} else {
			myList[mySize] = newt;
			mySize++;
		}

	}

	/**
	 * removes the last item added to the list
	 * @return the removed item
	 */
	public double remove() {
		if (mySize == 0) {
			throw new IndexOutOfBoundsException("The DoubleList is empty.");
		}
		mySize--;
		double removedItem = myList[mySize];
		myList[mySize] = 0.0;
		return removedItem;

	}

	/**
	 * Searches through the entire list to find the first position of a specified
	 * item
	 * 
	 * @param search is the double/value being searched for in the list
	 * @return the place in the list in which the value is, and if not in the list
	 *         it returns -1
	 */
	public int indexOf(double search) {
		for (int i = 0; i < mySize; i++) {
			if (myList[i] == search) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Searches through the entire list to find the last position of a specified
	 * item
	 * 
	 * @param search is the double/value being searched for in the list
	 * @return the place in the list in which the value is, and if not in the list
	 *         it returns -1
	 */
	public int lastIndexOf(double search) {
		for (int i = mySize - 1; i > 0; i--) {
			if (myList[i] == search) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Searches through the entire list to find if the specified item is in the list
	 * 
	 * @param search is the double/value being searched for in the list
	 * @return true if the item is in the list and false if not
	 */
	public boolean contains(double search) {
		for (int i = 0; i < mySize; i++) {
			if (myList[i] == search) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Gives out a value of all the values in the list combined
	 * 
	 * @return the total value of all values in the list
	 */
	public double sum() {
		double total = 0.0;
		if (size() != 0) {
			for (int i = 0; i < size(); i++) {
				total = total + myList[i];
			}
		} else {
			total = 0.0;
		}
		return total;
	}

	/**
	 * Averages out all of the different values in the list and returns one value
	 * 
	 * @return the average of all items in the list
	 */
	public double mean() {
		double total = 0.0;
		if (size() != 0)
			for (int i = 0; i < size(); i++) {
				total = total + myList[i];
			}
		else {
			throw new IndexOutOfBoundsException("The DoubleList is empty.");
		}
		total = total / mySize;
		return total;
	}

	/**
	 * Goes through the list to find the maximum value item in it
	 * 
	 * @return the maximum value in the list
	 */
	public double maximum() {
		double max = myList[0];
		if (size() != 0)
			for (int i = 0; i < size(); i++) {
				if (myList[i] > max) {
					max = myList[i];
				}
			}
		else {
			throw new IndexOutOfBoundsException("The DoubleList is empty.");
		}
		return max;
	}

	/**
	 * Goes through the list to find the minimum value item in it
	 * 
	 * @return the minimum value in the list
	 */
	public double minimum() {
		double min = myList[0];
		if (size() != 0)
			for (int i = 0; i < size(); i++) {
				if (myList[i] < min) {
					min = myList[i];
				}
			}
		else {
			throw new IndexOutOfBoundsException("The DoubleList is empty.");
		}
		return min;
	}

	/**
	 * Gets the value of the certain spot in the list
	 * 
	 * @param item the value of the place in the list
	 * @return the item in the requested place of the list
	 */
	public double get(int item) {
		if (item >= 0 && item < size()) {
			double value = myList[item];
			return value;
		} else {
			throw new IndexOutOfBoundsException("Place not found in List");
		}
	}

	/**
	 * Sets the value of a certain place in list as specified value
	 * 
	 * @param item  place in the list to be set
	 * @param value value the place is going to be set to
	 */
	public void set(int item, double value) {
		if (item >= 0 && item < size()) {
			myList[item] = value;
		} else {
			throw new IndexOutOfBoundsException("Place not found in List");
		}
	}

	/**
	 * Takes in a place and a value and sets that value to the place and moves down
	 * all other values one place. Throws exception if the list is max size or
	 * requested value is outside list
	 * 
	 * @param index [lace requested to be switched
	 * @param value value being put into requested position
	 */
	public void add(int index, double value) {
		if (size() == maxSize()) {
			expand();

		} 
		else {
			if (index > size() - 1 || index < 0) {
				throw new IndexOutOfBoundsException("Value outside of list size");
			} else {
				for (int i = mySize-1; i >= index; i--) {
					myList[i + 1] = myList[i];

				}
				myList[index] = value;
				mySize++;

			}
		}
	}

	/**
	 * Removes a value in the list and moves down all other values by one spot
	 * 
	 * @param index The place that is to be removed from the list
	 */
	public void remove(int index) {
		if (index > size() || index < 0) {
			throw new IndexOutOfBoundsException("Value outside of list size");
		} 
		else {
			for (int i = index; i <= size(); i++) {
				myList[i] = myList[i+1];

			}
			mySize--;
		}
	}

	/**
	 * The size of the list to zero and clears all previous items to the value of
	 * zero
	 */
	public void clear() {
		mySize = 0;
		for (int i = 0; i < myList.length; i++) {
			myList[i] = 0.0;
		}
	}

	/**
	 * Compares two different double lists on the different values they have and
	 * returns true if all values are the same
	 * 
	 * @param exe The double list that is being compared to the current double list
	 * @return true if all of the values in the two lists are the same
	 */
	public boolean equals(DoubleList exe) {
		if (this.mySize != exe.mySize) {
			return false;
		}
		for (int i = 0; i < this.mySize; i++) {
			if (this.myList[i] != exe.myList[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns true or false on if the list is empty or not
	 * 
	 * @return true or false for if the list is empty or not
	 */
	public boolean isEmpty() {
		if (mySize == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Takes in a array of doubles and turns them into a list that can be modified
	 * by the class
	 * 
	 * @param val the array that is being taken in to be converted into a list
	 */
	public DoubleList(double[] val) {
		mySize = 0;
		myList = new double[(int) (val.length * 1.5)];
		for (double valval : val) {
			this.add(valval);
		}

	}

	/**
	 * Creates a clone of the list that is being input into the program at a
	 * different address
	 * 
	 * @param clone the list that is going to be cloned
	 * @return the clone of the list that was input
	 */
	public DoubleList clone(DoubleList clone) {
		DoubleList copy = null;
		copy.mySize = clone.mySize;
		for (int i = 0; i < clone.mySize; i++) {
			copy.myList[i] = clone.myList[i];
		}
		return copy;
	}

	/**
	 * Creates an array that contains the same information as the list only it
	 * cannot be changed and acts as an array
	 * 
	 * @return the array that is a copy of the list
	 */
	public double[] toArray() {
		double[] mirror = new double[this.mySize];
		for (int i = 0; i < this.mySize; i++) {
			mirror[i] = this.myList[i];
		}
		return mirror;
	}

	/**
	 * Creates a string of all the different values in the list using the spots that
	 * are occupied and returns empty if there are no values
	 */
	public String toString() {
		String str = "";
		if (mySize != 0) {
			for (int i = 0; i < mySize; i++) {
				str = str + "[" + i + "]=>" + myList[i] + "; ";
			}
		} else {
			str = "Empty";
		}
		return str;
	}

}
