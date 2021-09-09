package test;

public class RationalNumber {
	// fields
	private int num;
	private int denom;
	
	// constructor method
	public RationalNumber(int num, int denom) {
		this.num = num;
		this.denom = denom;
	}
	
	// returns denominator value of the rational number
	public int getDenominator() {
		return denom;
	}
	
	// returns numerator value of the rational number
	public int getNumerator() {
		return num;
	}
	
	// returns a formatted string of a rational number from a numerator and denominator
	private String returnFormat(int num, int denom) {
		if (denom == 1)
			return num + "";
		if (denom < 0)
			return "-" + num + "/" + Math.abs(denom);
		return num + "/" + denom;
	}
	
	// adds this rational number and another rational number
	/* public String addRationalNumbers(RationalNumber rn) {
		int resultNum = num * rn.getDenominator() + rn.getNumerator();
		int resultDenom = rn.getDenominator();
		return this.returnFormat(resultNum, resultDenom);
	} */
	
	// subtracts this rational number by another rational number
	/* public String subtractRationalNumbers(RationalNumber rn) {
		int resultNum = num * rn.getDenominator() - rn.getNumerator();
		int resultDenom = rn.getDenominator();
		return this.returnFormat(resultNum, resultDenom); 
	} */
	
	// multiplies this rational number with another rational number
	public String multiplyRationalNumbers(RationalNumber rn) {
		int resultNum = num * rn.getNumerator();
		int resultDenom = denom * rn.getDenominator();
		return this.returnFormat(resultNum, resultDenom);
	}
	
	// divides this rational number by another rational number
	public String divideRationalNumbers(RationalNumber rn) {
		int resultNum = num * rn.getDenominator();
		int resultDenom = denom * rn.getNumerator();
		return this.returnFormat(resultNum, resultDenom);
	}
	
	// to string method (ex. 3/5, -5/7, 6)
	public String toString() {
		return this.returnFormat(num, denom);
	}
}
