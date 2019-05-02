/*


*/
import summer.Clothes.*;

public class Demo6{

	public static void main(String[] args){
	
		Pants jean = new Pants("Blue",200);
		//Jacket pilot = new Jacket("Brown",1000);
		Leather peter = new Leather("Block",20000);
		
		System.out.println(jean.toString());
		jean.wash();
		//pilot.wash();
		peter.dryOut();
	}
}