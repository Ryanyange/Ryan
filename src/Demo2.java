/*


*/

import java.util.Scanner;
import java.util.Arrays;

public class Demo2{

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		/*
		    �]�w�R�X���A
		*/
		System.out.print("�п�J�ʶR��A���: ");
	    int num = scanner.nextInt();
		Clothes[] tshirt = new Clothes[num];
				
		int input = 0;
		int account = 0;
		
		while ( account < num ){
			tshirt[account] = new Clothes();
			System.out.print("�п�ܱz�Q�n����A�C��: 1) ����  2) �Ŧ�  3) �զ� 4) exit: ");
			input = scanner.nextInt();
			switch (input){
				case 1:
					tshirt[account].color = "����";
					tshirt[account].price = 100;
					break;
					
				case 2:
					tshirt[account].color = "�Ŧ�";
					tshirt[account].price = 250;
					break;
					
				case 3:
					tshirt[account].color = "�զ�";
					tshirt[account].price = 450;
					break;
					
				default: 
					break;
			}
			account = account + 1;
			//�U�@���� 4 �n�p��B�z??
			if ( input == 4 ){
				break;
			}
		}
		//�߰ݥ[�ʷN�@
		System.out.print("�O�_�n�[��? Y) �[�� N) ���[��");
		String input2 = scanner.next();
		if (input2.equals("Y")){
			System.out.print("�п�J�ʶR��A���: ");
			num = scanner.nextInt();
			Clothes[] tshirt2 = Arrays.copyOf(tshirt, num + tshirt.length);
				
			while ( account < (num + tshirt.length) ){
				tshirt2[account] = new Clothes();
				System.out.print("�п�ܱz�Q�n����A�C��: 1) ����  2) �Ŧ�  3) �զ� 4) exit: ");
				input = scanner.nextInt();
				switch (input){
					case 1:
						tshirt2[account].color = "����";
						tshirt2[account].price = 100;
						break;
						
					case 2:
						tshirt2[account].color = "�Ŧ�";
						tshirt2[account].price = 250;
						break;
						
					case 3:
						tshirt2[account].color = "�զ�";
						tshirt2[account].price = 450;
						break;
						
					default: 
						break;
				}
				account = account + 1;
				//�U�@���� 4 �n�p��B�z??
				if ( input == 4 ){
					break;
				}
			}
		
		
		//�p��C�X�ӥ�������A
			for (Clothes shirt : tshirt2){
				System.out.printf("Color: %s , Price: %d%n",shirt.color,shirt.price);
			}
		}
	}
}