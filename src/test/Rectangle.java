package test;

public class Rectangle {
	// fields
	int x;
	int y;
	int width;
	int height;
	
	// constructor methods
	// read in all fields
	public Rectangle (int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	// returns x value
	public int getX() {
		return x;
	}
	
	// returns y value
	public int getY() {
		return y;
	}
	
	// returns width
	public int getWidth() {
		return width;
	}
	
	// returns height
	public int getHeight() {
		return height;
	}
}
