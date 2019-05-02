/*

*/

import summer.Clothes.*;

public class Demo5{
	
	public static void main(String[] args){
		
		double sum = 0.0;
		
		Pants jean = new Pants("Blue",1000);
		sum = sum + account(jean);
			
		Jacket jets = new Jacket("Brown",300);
		sum = sum + account(jets);
		
		System.out.printf("Total: %.2f%n" , sum);
	}
		
	public static double account(Clothes p1){
		return p1.getPrice()*1.05;
	}
	/*
	public static double account(Jacket j1){
		return j1.getPrice()*1.05;
	}
	*/
}