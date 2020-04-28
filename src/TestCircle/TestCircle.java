package TestCircle;

class Circle{
	private static double r;
	final static double PI=3.142;
	
	public Circle(double R) {
		r=R;
	}
	
	public static double perimeter() {
		return 2*r*PI;
	}
	
	public static double area() {
		return r*r*PI;
	}
	
}
public class TestCircle {
	public static void main(String args[]) {
		Circle test=new Circle(5);
		System.out.println("Perimeter=" + test.perimeter());
		System.out.println("Area=" + test.area());
	}
}
