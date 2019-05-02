/*

*/
package summer.Clothes;

public class Pants extends Clothes{
    
	public Pants(String color, int price){
		super(color,price);
	}
	
	public void wash(){
		System.out.println("Washing Machine Wash ....");
	}
	
	public void dryOut(){
		
	}
	@Override
	public String toString(){
		return ("Pants " + super.toString());
	}
}