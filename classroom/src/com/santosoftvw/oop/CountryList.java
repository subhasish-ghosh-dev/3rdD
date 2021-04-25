package com.santosoftvw.oop;

public class CountryList {
	
		public CountryList(){
			
			for(Country c: Country.values()){
				c.display();
			}
			
		}
		
		public static void main(String args[]){
			CountryList o = new CountryList();
		}
	

}
