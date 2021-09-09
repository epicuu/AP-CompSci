package test;

public class Line {
	// fields
	private Point p1;
	private Point p2;
	
	// constructor methods
	// creates a line given two pointers
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	// creates a line given a set of integers
	public Line(int x1, int y1, int x2, int y2) {
		p1.setX(x1);
		p1.setY(y1);
		p2.setY(x2);
		p2.setY(y2);
	}
	
	// returns first point
	public Point getP1() {
		return p1;
	}
	
	// returns second point
	public Point getP2() {
		return p2;
	}
	
	// returns slope of two points in line
	public double getSlope() {
		return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
	}
	
	// determines if points in the line are collinear with another point
	public boolean isCollinear(Point p) {
		return p1.isCollinear(p2, p);
	}
	
	// toString method
	public String toString() {
		return "[" + p1 + ", " + p2 + "]";
	}
}