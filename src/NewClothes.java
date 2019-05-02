import java.util.Scanner;
import java.util.*;

public class NewClothes{
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Here is the clothing store, Please enter the item you want to buy 1)coat 2)pants 3)jacket 4)Next:");
		int clothes = scanner.nextInt();
		
		int coat,pants,jacket,price;
		String item,color;
		
		if (clothes == 1){
			item = "coat";
			System.out.print("Please input the color of coat 1)Red 2)Blue 3)Whit 4)Next :");
			coat = scanner.nextInt();
			
			switch(coat){
				case 1:
					color = "Red";
					price = 150;
					break;
				case 2:
					color = "Blue";
					price = 250;
					break;
				case 3:
					color = "White";
					price = 350;
					break;
				default:
					break;
			}
		}
		else if (clothes == 2){
			item = "pants";
			System.out.print("Please input the color of pants 1)Red 2)Blue 3)Whit 4)Next :");
			pants = scanner.nextInt();
			
			switch(pants){
				case 1:
					color = "Red";
					price = 150;
					break;
				case 2:
					color = "Blue";
					price = 250;
					break;
				case 3:
					color = "White";
					price = 350;
					break;
				default:
					break;
			}
		}
		else if (clothes == 3){
			item = "jacket";
			System.out.print("Please input the color of jacket 1)Red 2)Blue 3)Whit 4)Next :");
			jacket = scanner.nextInt();
			
			switch(jacket){
				case 1:
					color = "Red";
					price = 150;
					break;
				case 2:
					color = "Blue";
					price = 250;
					break;
				case 3:
					color = "White";
					price = 350;
					break;
				default:
					break;
			}
		}
		else{
			System.out.print("Thank you for visiting");
		}
		System.out.println("Clothes : "+ item);	
	}
}