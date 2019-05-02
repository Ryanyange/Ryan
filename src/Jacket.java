/*

*/
package summer.Clothes;

public abstract class Jacket extends Clothes{
    
	public Jacket(String color, int price){
		super(color,price);
	}
	
	public void wash(){
		 System.out.println("Dry wash.....");
	}
	
	@Override
	public abstract void SunDry();
}