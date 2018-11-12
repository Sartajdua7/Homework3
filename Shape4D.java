package shapeProblem;

public abstract class Shape4D extends Shape{
	
	public Shape4D() {
		super(4);
	}
	
	public abstract double hyperVolume();
	public abstract double volume();
	public abstract double surfaceArea();
	
}
