
package summer.Clothes;

public class Leather extends Jacket{

	public Leather(String color, int price){
		super(color,price);
	}

	public void SunDry(){
		System.out.println("Sun Dry ...");
	}
	
	@Override
	public String toString(){
		return ("Pants " + super.toString());
	}
	
	@Override
	public void wash(){
		System.out.println("Do noe wash in Washer ...");
	}
}