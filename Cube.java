package shapeProblem;

public class Cube extends RectangularPrism{
	double sideLength;
	
	public Cube(double sideLength) {
		super();
		this.sideLength = sideLength;
	}
	
	public double volume() {
		return Math.pow(sideLength, 3);
	}
	
	public double surfaceArea() {
		return 6 * Math.pow(sideLength, 2);
	}
}
