package SamplePackage;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.setR(10.0);
		System.out.println("The radius is " + c.getR());
		c.area();
		
		Circle c1 = new Circle();
		c.setR(30.0);
		System.out.println("The radius is " + c.getR());
		c.area();

	}

}
