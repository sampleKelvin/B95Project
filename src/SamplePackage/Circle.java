package SamplePackage;

public class Circle {
	private double r;
	
	public Circle() {
		r = 0.0;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public void area() {
		double area = 3.1419 * r * r;
		System.out.println("The total area is " + area);
	}
	
	
}
