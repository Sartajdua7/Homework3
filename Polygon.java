package shapeProblem;

public abstract class Polygon extends Shape2D{
	
	 public int numOfSides;
	 public abstract double perimeter();
	
	 public Polygon(int numOfSides) {
		 this.numOfSides = numOfSides;
	 }
	 
	 public double distanceFormula(int x1, int y1, int x2, int y2) {
		 return (Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)));
	 }
}
