package abstractjava;

public abstract class Shape {
	
	protected double area; 
	protected double width;
	protected double height;
	protected double radius;
	public static final double pi = 3.14;
	protected double a;
	protected double c;
	protected double angle;
	protected double b;
	protected double s;
	
	protected Shape( 
			 double width,
			 double height,
			 double radius,	
			 double a,
			 double b,
			 double c,
			 double angle){
				this.width = width;
				this.height = height;
				this.radius = radius;
				this.a = a;
				this.c = c;
				this.b = b;
				this.angle = angle;
				this.s = this.claculatePerimeterOfTriangle();
				System.out.println("TRIANGLE: "+this.s);
	}
			
	 protected Shape( 
					 double width,
					 double height,
					 double radius,	
					 double a,
					 double c,
					 double angle){
				this.width = width;
				this.height = height;
				this.radius = radius;
				this.a = a;
				this.c = c;
				this.angle = angle;
		}
	
	protected abstract double calculateArea();
	
	protected double calculateVolume(){
		
		return area;
		
	}
	
	public void display(){
		System.out.println("Area: "+this.calculateArea());
	}
	
	private double claculatePerimeterOfTriangle(){
		return (a+b+c)/2;
	}
	

}
