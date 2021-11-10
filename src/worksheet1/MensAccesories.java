package worksheet1;

public class MensAccesories implements Node {
	private int key;
	
	public MensAccesories(int key) {
		this.key = key;
	}

	@Override
	public int getKey() {
		return key;
	}

}
