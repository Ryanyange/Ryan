/*
1.列出商品
2.讓客戶選擇商品
3.讓客戶輸入數量
4.小計客戶的商品價格
5.可讓客戶重複選擇商品
6.總結價錢-列出台幣\美金\日元價格
*/

import summer.Clothes.*;
import finanal.Rate.*;
import java.util.Scanner;

public class Demo4{

	public static void main(String[] args){
		{ 
			System.out.println("Honey Shop");
			System.out.println("=================================");
		}
		
		Scanner scanner = new Scanner(System.in);
		int order = 0;
		int choise = 0;
		int num = 0;
		int total = 0;
		int account = 0;
		
		Clothes[] tshirt = {
			new Clothes("Red",100),
			new Clothes("Blue",180),
			new Clothes("White",250),
			new Pants("Back",300)
		};
		
		for (Clothes shirt : tshirt){
			order++;
			System.out.printf("%d Color: %s , Price: %d%n",order,shirt.getColor(), shirt.getPrice());
		}
		
		while(true){
			//選擇商品
			System.out.print("Please input your choice: 1 , 2 , 3 (or -1:Exit) : ");
			choise = scanner.nextInt();
			
			if ( choise == (-1)){
				break;
			}
			
			//選擇數量
			System.out.print("Please input the number of: ");
			num = scanner.nextInt();
			
			//商品總價
			total = tshirt[choise-1].getPrice() * num ;
			System.out.printf("商品小計: %d%n" ,total);
			account += total;
		}
		System.out.println("============================================");
		System.out.printf("總共: %d 元！%n", account);
		
	}

}