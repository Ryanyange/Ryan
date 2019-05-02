/*

*/
package account.Cart;
import summer.Clothes.*;
import java.util.ArrayList;

public class Cart{

	String name;
	int things;
	int total;
	
	public Cart(){}
	public Cart(String name){
		this.name = name;
	}

	public float singleAccount(int number){
		//單項物品小計
		int singlePrice = 0;
		return singlePrice;
	}
	
	public float totalSummary(int singleAccount, Clothes... clothes){
		//所有項目物品小計
		int totalPrice = 0;
		return totalPrice;
	}
}