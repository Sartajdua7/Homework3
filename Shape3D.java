package shapeProblem;

public abstract class Shape3D extends Shape{
	
	public Shape3D() {
		super(3);
	}
	
	public abstract double volume();
	public abstract double surfaceArea();
}
