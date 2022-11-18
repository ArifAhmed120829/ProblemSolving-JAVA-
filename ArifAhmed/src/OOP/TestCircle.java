package OOP;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("The Circle has radius of: "+c1.getRadius()+"And the area of: "+c1.getArea());
		Circle c2 = new Circle(2.0);
		System.out.println("The Circle has radius of: "+c2.getRadius()+"And the area of: "+c2.getArea());

	}

}
