package apcs.guess;

public class Value {
	private int value;
	
	public Value(){
		value = (int)(Math.random() * 100);
		
	}
	public Value(int value){
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String toString(){
		String str;
		str = "" + value;
		return str;
	}
	boolean equals(Value instance) {
		return this.value == instance.value;
	}
}
