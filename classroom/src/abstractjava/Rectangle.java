package abstractjava;

public class Rectangle extends Shape {

	public Rectangle(double w, double h){
		super(w, h, 0, 0, 0, 0);
	}
	
	@Override
	protected double calculateArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

}
