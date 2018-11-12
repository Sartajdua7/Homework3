package shapeProblem;

public class Triangle extends Polygon{
	
	public int x1;
	public int x2;
	public int x3;
	public int y1;
	public int y2;
	public int y3;
	
	double sideOneLength = distanceFormula(x1, y1, x2, y2);
	double sideTwoLength = distanceFormula(x2, y2, x3, y3);
	double sideThreeLength = distanceFormula(x1, y1, x3, y3);
	
	public Triangle(int x1, int x2, int x3, int y1, int y2, int y3) {
		super(3);
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
	}
	
	public double perimeter() {
		return sideOneLength + sideTwoLength + sideThreeLength;
	}
	
	public double area() {
		double s = (sideOneLength + sideTwoLength + sideThreeLength)/2;
		return Math.sqrt(s * (s- sideOneLength) * (s - sideTwoLength) * (s - sideThreeLength));
	}
}
