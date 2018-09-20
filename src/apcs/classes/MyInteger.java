package apcs.classes;

public class MyInteger {
	private int value;
	public MyInteger (int v){
		value = v;
	}
	public int intValue() {
		return value;
	}
	public String toString () {
		return ""+value;
	}
	public boolean equals (MyInteger o) {
		if(value ==o.intValue()) return true;
		return false;
	}
}
