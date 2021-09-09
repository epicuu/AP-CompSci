
package test;

public class test {
	public static void main(String[] args) {
		/* Point p1 = new Point(2, 4);
		Point p2 = new Point(3, 5);
		Point p3 = new Point(3, 7);
		
		System.out.println(p1.distanceFromOrigin());
		System.out.println(p2.manhattanDistance(p1));
		System.out.println(p2.isVertical(p3));
		System.out.println(p1.slope(p2));
		System.out.println(p2.slope(p3));
		System.out.println(p1.isCollinear(p2, p3));
		p1.translate(1, 2);
		System.out.println(p1);
		
		Line line = new Line(p1, p2);
		System.out.println(line.getP1() + "\n" + line.getP2() + "\n" + line);
		System.out.println(line.getSlope());
		System.out.println(line.isCollinear(p3)); */
		
		RationalNumber rn = new RationalNumber(1, 3);
		RationalNumber rn2 = new RationalNumber(2, 5);
		System.out.println(rn.getDenominator() + " " + rn.getNumerator());
		System.out.println(rn);
		System.out.println(rn.multiplyRationalNumbers(rn2) + " " + rn.divideRationalNumbers(rn2));

	}
}
