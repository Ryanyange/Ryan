/*
1.�C�X�ӫ~
2.���Ȥ��ܰӫ~
3.���Ȥ��J�ƶq
4.�p�p�Ȥ᪺�ӫ~����
5.�i���Ȥ᭫�ƿ�ܰӫ~
6.�`������-�C�X�x��\����\�餸����
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
			//��ܰӫ~
			System.out.print("Please input your choice: 1 , 2 , 3 (or -1:Exit) : ");
			choise = scanner.nextInt();
			
			if ( choise == (-1)){
				break;
			}
			
			//��ܼƶq
			System.out.print("Please input the number of: ");
			num = scanner.nextInt();
			
			//�ӫ~�`��
			total = tshirt[choise-1].getPrice() * num ;
			System.out.printf("�ӫ~�p�p: %d%n" ,total);
			account += total;
		}
		System.out.println("============================================");
		System.out.printf("�`�@: %d ���I%n", account);
		
	}

}