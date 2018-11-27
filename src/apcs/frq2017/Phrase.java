package apcs.frq2017;

public class Phrase {
	private String currentPhrase;
	/** Constructs a new Phrase object. */
	public Phrase(String p){
		currentPhrase = p; 
	}
	
	/**
	 * Returns the index of the nth occurrence of str in the current phrase; returns
	 * -1 if the nth occurrence does not exist. Precondition: str.length() > 0 and n
	 * > 0 Postcondition: the current phrase is not modified.
	 */
	public int findNthOccurrence(String str, int n) {
		int offset = 0;
		int count = 0;
		while (offset < currentPhrase.length()) {
			offset = currentPhrase.indexOf(str, offset);
			if (offset >= 0) {
				count++;
				if (count == n) return offset;
			}
			else {
				return -1;
			}
			offset++;
		}
		return -1;
	}

	/** Modifies the current phrase by replacing the nth occurrence of str with repl.
	* If the nth occurrence does not exist, the current phrase is unchanged.
	* Precondition: str.length() > 0 and n > 0
	*/
	public void replaceNthOccurrence(String str, int n, String repl){ 
		int indx = 0;
		indx = findNthOccurrence(str, n);
		if(indx == -1) {
			currentPhrase = currentPhrase;
		}
		else {
			currentPhrase = currentPhrase.substring(0, indx) + repl + currentPhrase.substring(indx+ str.length(), currentPhrase.length());
		}
	}
	
	/** Returns the index of the last occurrence of str in the current phrase;
	* returns -1 if str is not found.
	* Precondition: str.length() > 0
	* Postcondition: the current phrase is not modified.
	*/
	public int findLastOccurrence(String str){
		int l = 1;
		while (findNthOccurrence(str, l+1) != -1) {
			l++;
		}
		return(l);
	}
	
	/** Returns a string containing the current phrase. */
	public String toString() {
		return currentPhrase;
	}
	
}
