package assignment_1;

import java.util.Scanner;

public class ShowRoom {
	
	private double totalCost;
	private double payDevt;
	private double discount;
	
	public ShowRoom(){
		
	}
	
	protected void input(){
		System.out.println("Please Enter total purchase cost\n");
		Scanner sc = new Scanner(System.in);
		totalCost = sc.nextDouble();
		
		sc.close();
	}
	
	
	protected void calculate(){
		if(totalCost<2000){
			discount = totalCost*0.05;			
		}
		else if(totalCost>=2001 && totalCost<=5000){
			discount = totalCost*0.25;			
		}
		if(totalCost>=5001 && totalCost<=10000){
			discount = totalCost*0.35;			
		}
		if(totalCost>10000){
			discount = totalCost*0.5;			
		}
	}
	
	public void display(){
		payDevt = totalCost - discount;
		System.out.println("PAYMENT DUE: "+payDevt);
	}
	
	

}
