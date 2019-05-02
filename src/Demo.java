/*

*/

import java.util.Scanner;

public class Demo{

	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		//Clothes[] tshirts = {new Clothes(),new Clothes(),new Clothes()};
		Clothes[] tshirts = new Clothes[3];
		int num = 0;
		int sum = 0;
		
		for(int i = 0; i < tshirts.length; i++){
			tshirts[i] = new Clothes();
			System.out.print("Please input the color of the Clothes: ");
			tshirts[i].color = scanner.next();
				
			System.out.print("Please input the price of the Clothes: ");
			tshirts[i].price = scanner.nextInt();
			
			System.out.println("The Clothes color : " + tshirts[i].color);
			System.out.println("The Clothes price : " + tshirts[i].price);		
				
			System.out.print("Please input the number of the Clothes: ");
			num = scanner.nextInt();
			
			System.out.printf("The total is: %d%n", (tshirts[i].price * num));
			System.out.printf("The discount is 15 percent: %.2f%n", (tshirts[i].price * num)*0.85);
			
			//sum = sum + (tshirt.price * num)*0.85;
			sum += (tshirts[i].price * num)*0.85;
		}
		System.out.println("The total is : " + sum);
		
		for (Clothes tshirt : tshirts){
			System.out.println(tshirt.color);
			System.out.println(tshirt.price);
		}
	}
}