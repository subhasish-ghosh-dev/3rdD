package stringclass;

public /*final*/ class ImmutableEx {

	/*final*/ Integer c = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableEx obj = new ImmutableEx();
		obj.c = 12;
		
		ImmutableEx obj2 = obj;
		
		obj.c = 13;
		
		obj2.c = 14;
		
		System.out.println(obj.c);

		if(obj == obj2){
			System.out.println("SAME");
		}
		
		
		String myString1 = "Hello World";
		String myString2 = "HellO World";
		//String myString2 = new String("Hello World\n"+"Welcome to Java.");
		/*String myString3 = """
				Hello 
				World
				Welcome to Java.
				""";*/
		
		if(myString1 == myString2){
			System.out.println("Location SAME");
		}
		
		if(myString1.equals(myString2)){
			System.out.println("SAME");
		}
		else{
			System.out.println("NOT SAME");
		}
		
				
		String exStr = "When concatenating Strings you have to watch out for possible performance problems. Concatenating two Strings in Java will be translated by the Java compiler to something like this:";
		String result = "";
		
		String[] arr = exStr.split("\\s");
		//int i=0; i<arr.length(); i++
		for(String s : arr){
			result +=s;//THis should not be done this way
		}
		
		StringBuilder strB = new StringBuilder();
		for(String s : arr){
			strB.append(s);
		}
		
		result = strB.toString();
		
		
	}

	
	class InnerClass extends ImmutableEx {
		
	}
}
