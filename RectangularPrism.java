package shapeProblem;

public class RectangularPrism extends Shape3D{
	double sideOneLength;
	double sideTwoLength;
	double sideThreeLength;
	public RectangularPrism(double sideOneLength, double sideTwoLength, double sideThreeLength) {
		super();
		this.sideOneLength = sideOneLength;
		this.sideTwoLength = sideTwoLength;
		this.sideThreeLength = sideThreeLength;
	}
	
	public RectangularPrism() {
		super();
	}
	
	public double volume() {
		return sideOneLength * sideTwoLength * sideThreeLength;
	}
	
	public double surfaceArea() {
		return 2 * ((sideOneLength * sideTwoLength) + (sideTwoLength * sideThreeLength) + (sideOneLength * sideThreeLength)); 
	}
}
