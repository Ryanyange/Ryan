/*

*/
package wash;
import wash.*;

public interface DryWasher extends Washer{

	@Override
	public abstract void wash();
	
	public abstract void quickWash();

}