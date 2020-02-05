package testingPackage;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int num, int denom) {
		this.numerator = num;
		this.denominator = denom;
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public Fraction multiply(Fraction anotherFraction) {
		Fraction temp = new Fraction((this.numerator * anotherFraction.numerator), (this.denominator * anotherFraction.denominator));
		return temp;
	}
}
