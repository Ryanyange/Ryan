/*
´«¶×
*/
package finanal.Rate;

public class Exchange{

	static float dollars = 30.22f;
	static float yen = 0.315f;
	
	public static float exchangeDollars(int price){
		return (price / Exchange.dollars);
	}

}