package shapeProblem;

public class Circle extends Shape2D{
	
	public double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return (Math.pow(radius, 2) * Math.PI);
	}
	
	public double circumference() {
		return (2 * radius * Math.PI);
	}
}
