package stringclass;

public class StringMatch {
	
	public int stringMatch(String a, String b) {		  
		  int count = 0;	
		  
		  char[] ch = new char[a.length()];
		  
		  for(int i=0; i<a.length(); i++){
			  ch[i] = a.charAt(i);
		  }
		  
		  char ch1 = a.charAt(2); 
		  
		  for(char cc: ch){
			  System.out.print(cc);
		  }
		  System.out.println();
		  
		  if(a.length()<2 || b.length()<2){
		    return count;
		  }
		  else if(a.length()==2 && b.length()==2){
		    if(a.equals(b)){
		      count++;
		    }
		    return count;
		  }
		  else if(a.length()==b.length()){
			  for(int i=0; i< a.length(); i++){
			      if((i<=a.length()-2 || i<=b.length()-2) && a.substring(i,i+2).equals(b.substring(i,i+2))){
			        count++;
			      }			      
			  }
		  }
		  else{
		    for(int i=0; i< ((a.length()<b.length())? a.length()-1:b.length()-1); i++){
		      if((a.length()>2&&b.length()>2)&&(i<a.length()-2 || i<b.length()-2) && a.substring(i,i+2).equals(b.substring(i,i+2))){
		        count++;
		      }
		      else if((a.length()>2&&b.length()==2) &&(i<a.length()-2 || i<b.length()-2) && a.substring(i,i+2).equals(b.substring(i))){
		    	  count++;
		      }
		      else if((a.length()==2&&b.length()>2) &&(i<a.length()-2 || i<b.length()-2) && a.substring(i).equals(b.substring(i,i+2))){
		    	  count++;
		      }		      
		    }
		  }		    
		  return count;
	}
		  
		  
		  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMatch s = new StringMatch();
		System.out.println(s.stringMatch("xxcaazz", "xxbaaz"));
		System.out.println(s.stringMatch("abc", "abc"));
		System.out.println(s.stringMatch("abc", "axc"));
		System.out.println(s.stringMatch("hello", "he"));
		System.out.println(s.stringMatch("he", "hello"));
		System.out.println(s.stringMatch("aaxxaaxx", "iaxxai"));
	}

}
