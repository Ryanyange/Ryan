/*


*/

import summer.Clothes.*;
import wash.*;
import Human.*;

public class Demo8{

	public static void main(String[] args){
	
		doWash(new Pants("Blue",1000));
	    doQuickWash(new Human("Peter"));
	}
	static void doWash(Washer washers){
		washers.wash();
	}
	static void doQuickWash(DryWasher washers){
		washers.quickWash();
	}
}
