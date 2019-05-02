/*

*/
//package summer.Clothes;
import summer.Clothes.*;
import finanal.Rate.*;

public class Demo3{

	public static void main(String[] args){
		{ System.out.println("Hello World Shop"); }
		Clothes[] tshirt = {
			new Clothes("Red",100),
			new Clothes("Blue",180),
			new Clothes("White",250)
		};
		
		for (Clothes shirt : tshirt){
			System.out.printf("Color: %s , Price: %d%n",shirt.getColor(), shirt.getPrice());
		}
		
		
		tshirt[1].setColor("Green");
		tshirt[1].setPrice(400);
		System.out.printf("The second Clothes color : %s  The price of dollars: %.2f%n"
		          ,tshirt[1].getColor(),Exchange.exchangeDollars(tshirt[1].getPrice()));
	}

}