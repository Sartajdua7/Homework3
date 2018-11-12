package shapeProblem;

public class Pentagon extends Polygon{
	int x1;
	int x2;
	int x3;
	int x4;
	int x5;
	int y1;
	int y2;
	int y3;
	int y4;
	int y5;
	
	double sideOneLength = distanceFormula(x1, y1, x2, y2);
	double sideTwoLength = distanceFormula(x2, y2, x3, y3);
	double sideThreeLength = distanceFormula(x3, y3, x4, y4);
	double sideFourLength = distanceFormula(x4, y4, x5, y5);
	double sideFiveLength = distanceFormula(x5, y5, x1, y1);

	public Pentagon(int x1, int x2, int x3, int x4, int x5, int y1, int y2, int y3, int y4, int y5) {
		super(5);
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		this.x5 = x5;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
		this.y5 = y5;
	}
	
	public double perimeter() {
		return sideOneLength + sideTwoLength + sideThreeLength + sideFourLength + sideFiveLength;
	}
	
	public double area() {
		return perimeter()/numOfSides;
	}
	
}
