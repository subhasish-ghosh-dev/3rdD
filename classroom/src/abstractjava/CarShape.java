package abstractjava;

public abstract class CarShape extends Shape {

	public int dimesion;
	
	
	public CarShape(){
		super(0,0,0,0,0,0);
		
	}
	
	
	@Override
	protected double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public double calculateVolume(){
		
		
		return 0;
	}

}
