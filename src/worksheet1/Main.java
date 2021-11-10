package worksheet1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		start();
		ArrayList<Node> DataSet = new ArrayList<Node>();
		MensAccesories sunglasses = new MensAccesories(9);
		DataSet.add(sunglasses);
		
		System.out.println(DataSet.get(0).getKey());

	}

	private static void start() {
		
	}

}
