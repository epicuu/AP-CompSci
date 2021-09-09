package test;

public class Point {
	// fields
	private double x;
	private double y;
	
	// constructor methods
	// default constructor
	public Point() {
		x = 0;
		y = 0;
	}
	
	// reads in values for a new point
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// reads in new value of x
	public void setX(int x){
		this.x = x;
	}
	
	// reads in new value of y
	public void setY(int y) {
		this.y = y;
	}
	
	// returns x
	public double getX() {
		return x;
	}
	
	// returns y
	public double getY() {
		return y;
	}
	
	// returns the distance this point has from the origin
	public double distanceFromOrigin() {
		return Math.sqrt(x * x + y * y);
	}
	
	// translates the point
	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	// finds manhattan distance between this point and another point
	public double manhattanDistance(Point other) {
		return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
	}
	
	// finds if a point is on the same vertical plane as this point
	public boolean isVertical(Point other) {
		if (x == other.x)
			return true;
		return false;
	}
	
	// finds slope of this point and another point
	public double slope(Point other) {
		// exception for the case where this formula doesn't work
		if (x == other.x)
			throw new IllegalArgumentException();
		return (other.y - y) / (other.x - x);
	}
	
	// finds if the points are collinear
	public boolean isCollinear(Point p1, Point p2) {
		return p1.slope(p2) == this.slope(p1);
	}
	
	// to string method
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}