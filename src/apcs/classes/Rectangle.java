package apcs.classes;

public class Rectangle {
	private int height;
	private int width;
	public Rectangle (int w, int h) {
	     width = w;
	     height = h;
	}
	public String toString () {
		String str;
		str ="Rectangle Object  Width=" + width + " Height=" + height;
		return str;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getArea () {
	     int area = width * height;
	     return area;
	}
	public double getDiagonal() {
		double diagonal = Math.sqrt((width*width) + (height * height));
		return diagonal;
	}
	public boolean equals (Rectangle otherRect) {
		if (this.width == otherRect.width && this.height == otherRect.height) return true;
		return false;

	}
	
}
