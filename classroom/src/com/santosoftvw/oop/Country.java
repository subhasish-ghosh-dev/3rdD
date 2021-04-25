package com.santosoftvw.oop;

public enum Country {

	BANGLADESH{
		public void display(){
			System.out.println("BD");
		}		
	},
	CHINA{
		void display(){
			System.out.println("CN");
		}
	},
	JAPAN{
		void display(){
			System.out.println("JP");
		}
	},
	MALAYASIA{
		void display(){
			System.out.println("MY");
		}
	},
	INDIA{
		void display(){
			System.out.println("IN");
		}
	},
	INDONESIA{
		void display(){
			System.out.println("INS");
		}
	};
	
	abstract void display();
	
}



