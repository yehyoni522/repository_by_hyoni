package my.day15.a.INTERFACE;

public class Triangle implements Figure {
					// implements는 구현, abstract는 상속.
	
	@Override
	public double area(double x, double y) {
		return x * y * 0.5;
	}

	@Override
	public double circleArea(double r) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
