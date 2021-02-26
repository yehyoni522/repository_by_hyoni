package my.day15.a.INTERFACE;

public class Circle implements Figure{
	
	public double area(double x, double y) {
		return 0;
	}
	
	@Override
	public double circleArea(double r) {
		return PI * r * r;
	}
	
}
