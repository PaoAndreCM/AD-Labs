package worksheet2;

import java.util.Iterator;

public class TestProgram {
	
	// This function generates a random number between 0 and max
	public static int randNumItems(int max) {
	    int rand = (int)(Math.random() * max);
        //System.out.println(rand);
        return rand;
	}

	public static void main(String[] args) {
		
		SortedBinaryTree<Node> myTree = new SortedBinaryTree<Node>();
		
		for (int i = 0; i < 100; i++) {
			Inventory NumInStock = new Inventory(randNumItems(150));
			myTree.insert(NumInStock);
		}
		
		
		System.out.println("Tree:");
//		System.out.println(myTree.iterator().next().getKey());
//		System.out.println("-------------------");
//		System.out.println();
//		//Node x = myTree.find(41);
//		System.out.println();
//		//System.out.println(x.getKey());
//		
		Iterator<Node> iterator = myTree.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getKey());
		}
	}
           
}
