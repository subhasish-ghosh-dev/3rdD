package thirdclass;

import switchstndenum.ITimeCalculator;
import switchstndenum.SwitchEx;

public class Student implements ITimeCalculator{

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("I calculate attendance");
	}
	
	public static void main(String[] args){
		ITimeCalculator it = new Student();//type casting
		ITimeCalculator it2 = new SwitchEx();
		
		it.calculate();
		it2.calculate();
		
		
	}
	
}




