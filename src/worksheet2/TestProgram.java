package worksheet2;

public class TestProgram {
	
	// This function generates a random number between 0 and max
	public static int randNumItems(int max) {
	    int rand = (int)(Math.random() * max);
        System.out.println(rand);
        return rand;
	}

	public static void main(String[] args) {
		
		SortedBinaryTree<Node> MyTree = new SortedBinaryTree<Node>();
		
		for (int i = 0; i < 100; i++) {
			Inventory NumInStock = new Inventory(randNumItems(50));
			
		}
	}
           
}
