/**
 * Class that implements Node for objects of type Men's accessories
 * 
 * @author Paola Andrea Carreno Mosquera
 * @version 1.0
 */

package worksheet1;

public class MensAccessories implements Node {
	private int key;
	
	public MensAccessories(int key) {
		this.key = key;
	}

	@Override
	public int getKey() {
		return key;
	}

}
