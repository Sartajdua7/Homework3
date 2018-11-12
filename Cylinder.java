package shapeProblem;

public class Cylinder extends Shape3D{
	double base;
	double radius;
	double height;
	
	public Cylinder(double base, double radius, double height) {
		this.base = base;
		this.radius = radius;
		this.height = height;
	}
	
	public double surfaceArea() {
		return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
	}
	
	public double volume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
	
}
