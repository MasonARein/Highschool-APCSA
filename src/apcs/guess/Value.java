package apcs.guess;

/**
 * 
 * Generates a random value out of 100 under the class of random.
 * @author marein01
 *
 */
public class Value {
	private int value;
	/**
	 * Generates a random integer value between 0 and 100 inclusive and can be set in runner
	 */
	public Value() {
		value = (int) (Math.random() * 101);

	}
	/**
	 * Takes in a value to convert to the random value
	 * @param value taken in to be set to random value
	 */
	public Value(int value) {
		this.value = value;
	}
	/**
	 * Gets random integer value
	 * 
	 * @return random value integer
	 */
	public int getValue() {
		return value;
	}
	/**
	 * sets the random value of value to number taken
	 * 
	 * @param value that sets the value of random number
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/**
	 * 
	 */
	public String toString() {
		String str;
		str = "" + value;
		return str;
	}
	/**
	 * compares two values and determines if they are equal
	 * @param instance value taken in to compare to other value
	 * @return true or false on if the values are equal
	 */
	public boolean equals(Value instance) {
		return this.value == instance.value;
	}
	/**
	 * compares two values and determines if the specific value is less than the other
	 * @param instance value taken in to compare to other value
	 * @return true or false on if the specific value is less than the other
	 */
	public boolean less(Value instance) {
		return this.value < instance.value;
	}
	/**
	 * compares two values and determines if the specific value is more than the other
	 * @param instance value taken in to compare to other value
	 * @return true or false on if the specific value is more than the other
	 */
	public boolean more(Value instance) {
		return this.value > instance.value;
	}
}
