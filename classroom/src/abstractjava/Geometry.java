package abstractjava;

public class Geometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Rectangle(12,45);
		s.area = s.calculateArea();
		s.display();
		
		//s = (Circle)s;//type conversion
		//System.out.println(s.radius);
		
		s = new Circle(12);
		s.area = s.calculateArea();
		s.display();
		
		s = new Triangle(12.0,23.0,30.0,60.0);
		s.area = s.calculateArea();
		s.display();
	}

}
