package shapeProblem;

public class Tesseract extends Shape4D{
	
	double sideLength;
	
	public Tesseract(double sideLength) {
		this.sideLength = sideLength;
	}
	
	public double hyperVolume() {
		return Math.pow(sideLength, 4);
	}
	
	public double volume() {
		return 8 * Math.pow(sideLength, 3);
	}
	
	public double surfaceArea() {
		return 24 * Math.pow(sideLength, 2);
	}
}
