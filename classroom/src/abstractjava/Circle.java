package abstractjava;

public class Circle extends Shape {
	
	public Circle(double r){
		super(0,0,r,0,0,0);
	}

	@Override
	protected double calculateArea() {
		// TODO Auto-generated method stub
		return pi*radius*radius;
	}

}
