package shapeProblem;

public class Square extends Rectangle{
	double sideLength;
	
	public Square(double sideLength) {
		super();
		this.sideLength = sideLength;
	}
	
	public double perimeter() {
		return 4 * sideLength;
	}
	
	public double area() {
		return Math.pow(sideLength, 2);
	}
	
}
