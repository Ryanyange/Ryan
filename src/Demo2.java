/*


*/

import java.util.Scanner;
import java.util.Arrays;

public class Demo2{

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		/*
		    設定買幾件衣服
		*/
		System.out.print("請輸入購買衣服件數: ");
	    int num = scanner.nextInt();
		Clothes[] tshirt = new Clothes[num];
				
		int input = 0;
		int account = 0;
		
		while ( account < num ){
			tshirt[account] = new Clothes();
			System.out.print("請選擇您想要的衣服顏色: 1) 紅色  2) 藍色  3) 白色 4) exit: ");
			input = scanner.nextInt();
			switch (input){
				case 1:
					tshirt[account].color = "紅色";
					tshirt[account].price = 100;
					break;
					
				case 2:
					tshirt[account].color = "藍色";
					tshirt[account].price = 250;
					break;
					
				case 3:
					tshirt[account].color = "白色";
					tshirt[account].price = 450;
					break;
					
				default: 
					break;
			}
			account = account + 1;
			//萬一按到 4 要如何處理??
			if ( input == 4 ){
				break;
			}
		}
		//詢問加購意願
		System.out.print("是否要加購? Y) 加購 N) 不加購");
		String input2 = scanner.next();
		if (input2.equals("Y")){
			System.out.print("請輸入購買衣服件數: ");
			num = scanner.nextInt();
			Clothes[] tshirt2 = Arrays.copyOf(tshirt, num + tshirt.length);
				
			while ( account < (num + tshirt.length) ){
				tshirt2[account] = new Clothes();
				System.out.print("請選擇您想要的衣服顏色: 1) 紅色  2) 藍色  3) 白色 4) exit: ");
				input = scanner.nextInt();
				switch (input){
					case 1:
						tshirt2[account].color = "紅色";
						tshirt2[account].price = 100;
						break;
						
					case 2:
						tshirt2[account].color = "藍色";
						tshirt2[account].price = 250;
						break;
						
					case 3:
						tshirt2[account].color = "白色";
						tshirt2[account].price = 450;
						break;
						
					default: 
						break;
				}
				account = account + 1;
				//萬一按到 4 要如何處理??
				if ( input == 4 ){
					break;
				}
			}
		
		
		//如何列出來全部的衣服
			for (Clothes shirt : tshirt2){
				System.out.printf("Color: %s , Price: %d%n",shirt.color,shirt.price);
			}
		}
	}
}