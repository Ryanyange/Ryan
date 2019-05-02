/*

*/
package summer.Clothes;
import wash.*;

public abstract class Clothes implements Washer,Dry{
    
	protected String color;
	protected int price;

	public Clothes(){}
	
	public Clothes(String color){
		this.setColor(color);
	}

    public Clothes(String color, int price){
		this(color);
		this.setPrice(price);
	}
	
	public abstract void wash();
	public abstract void SunDry();
	
		
	public String toString(){
		return String.format("(%s , %d)",this.color, this.price);
	}	
		
	public void setColor(String color){
		this.color = color;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public int getPrice(){
		return this.price;
	}
}