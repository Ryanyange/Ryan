/*

*/

import summer.Clothes.*;
import java.util.*;

public class Demo7{

	public static void main(String[] args){
	
		ArrayList myclothes = new ArrayList();
		buyClothes(myclothes);
		System.out.println("Menu List....");
		menuList(myclothes);	
	}
	//選擇你要買的衣服
	static void buyClothes(ArrayList myclothes){
		Scanner input = new Scanner(System.in);
		System.out.print("Please input the clothes: 1) jecket 2) pants: ");
		int number = input.nextInt();
		
		switch(number){
			case 1:
				Leather a1 = new Leather("Brown",1000);
				myclothes.add(a1);
				a1.wash();
				a1 = null;
				break;
			case 2:
				Pants b1 = new Pants("Blue",500);
				myclothes.add(b1);
				b1.wash();
				b1 = null;
				break;
		}
	}
	//列出你買的內容以及價錢
    static void menuList(ArrayList myclothes){
		for (int i = 0; i < myclothes.size(); i++){
			System.out.println(myclothes.get(i).toString());
			
		}
	}	
}