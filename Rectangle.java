package shapeProblem;

public class Rectangle extends Quadrilateral{
	double base;
	double height;
	
	public Rectangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	public Rectangle() {
		super();
	}
	public double perimeter() {
		return 2 * (base + height);
	}
	public double area() {
		return base * height;
	}
}
