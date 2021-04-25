package abstractjava;

import abstractjava.Shape;

public class Triangle extends Shape {

	public Triangle(double a,double b, double c, double angle){
		super(0,0,0,a,b,c,angle);
	}
	
	@Override
	protected double calculateArea() {
		// TODO Auto-generated method stub		
		return 0.5*a*c*Math.sin(Math.toRadians(angle));
		//System.out.println("FROM TRIANGLE S: "+s);
		
		//return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	
	

}
