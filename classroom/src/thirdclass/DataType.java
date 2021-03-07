package thirdclass;

public class DataType {
	
		//primitive data types
		//instance variable
		//Identifier rule (class name, variable name, method name) :  first character alphabetic letter, alphaneumeric letter _ , no space, u can use $ after your first character
		//variable declaration
		boolean flag$;//1 bit true or false
		char code='\u0634';//16 bit    '\u0000' (or 0) to '\uffff' (or 65,535 inclusive)
		
		byte b;//8 bit range -128 to 127   -2^7 to 2^7-1
		short s;//16 bit  minimum value is -32,768 and maximum value is 32,767
		int i;//32 bit    - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1)
		long l = 56800000000000l*123456789l;//64 bit    -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)
		
		float j = 9.34567892234234234234242342342342341F;//32bit single precision  decimal values up to 8 digits of precision 0.00009983
		double d=9223372.289121999876543215d;//64 bit double precision    decimal values up to 16 digits of precision 0.123456789012345
	
	    
		
	    String st = "আমার সোনার বাংলা আমি তমাকে ভালবাসি  |চিরদিন তোমার আকাশ"
	    		+ ""
	    		+ " ";
	    
	    //char[] ch = {'\u0634', '\u0633', '\u0612', ' ', '\u0634', '\u0633', '\u0612'};
	    
	    char[] ch = {'\u0978','\u0981'};
	    
	    public DataType(){
	    	System.out.printf("%7.17f",d);
	    	System.out.println(st);
	    	System.out.println(Double.MIN_VALUE);
	    	System.out.println(Double.MAX_VALUE);
	    	
	    	System.out.println(Float.MIN_VALUE);
	    	System.out.println(Float.MAX_VALUE);
	    	
	    	System.out.println("Character sequence creates String: "+ new String(ch));
	    	
	    	i = 1234;
	    	
	    	b = (byte) i;
	    	System.out.println(b);
	    	
	    	l = 12345434545l;
	    	i = (int) l;
	    	System.out.println(i);
	    }

	    
	    public static void main(String[] args){
	    	DataType dt = new DataType();
	    	CseStudnet s =  new CseStudnet();
	    	Student st = new Student();//(Student) s;
	    	BbaStudent bba = new BbaStudent();
	    	//s = (CseStudnet)st;
	    	st  = (Student) s;
	    
	    }
	    
}
