package apcs.penny;

public class Square {
	
	private int score;
	private boolean occ;
	
	public Square(int val) {
		occ = false;
		score = val;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isOcc() {
		return occ;
	}

	public void setOcc(boolean occ) {
		this.occ = occ;
	}

	public String toString() {
		String str;
		if(occ == true) {
			str = "P";
		}
		else {
			str = "" + score;
		}
		return str;
	}
}
