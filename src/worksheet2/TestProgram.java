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
		
		// Creating empty tree
		SortedBinaryTree<Node> myTree = new SortedBinaryTree<Node>();
		
		// Generating and inserting 100 nodes in myTree
		for (int i = 0; i < 100; i++) {
			Inventory NumInStock = new Inventory(randNumItems(150));
			myTree.insert(NumInStock);
		}
		
		Iterator<Node> iterator = myTree.iterator();
		
		// Printing inorder first 20 items of tree
		System.out.println("First 20 items of tree:");
		for (int i = 1; i < 20; i++) {
			System.out.print(iterator.next().getKey());
			System.out.print(", ");
		}
		System.out.println();
		
		// Printing inorder each fifth element in tree
		System.out.println("Each fifth element in tree:");
		iterator = myTree.iterator();
		for (int i = 0; i < 100; i++) {
			int key = iterator.next().getKey();
			if (i % 5 == 0) {
				System.out.print(key);
				System.out.print(", ");
				}
		}
		System.out.println();
		
		// Printing inorder last 20 items of tree
		System.out.println("Last 20 items of tree:");
		iterator = myTree.iterator();
		for (int i = 0; i < 100; i++) {
			int key = iterator.next().getKey();
			if (i > 79) {
				System.out.print(key);
				System.out.print(", ");
				}
		}
		System.out.println();
		
		//Uncomment bellow to print whole tree inorder
		/*
		System.out.println("Whole tree:");
		iterator = myTree.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next().getKey());
			System.out.print(" ");
		}
		*/
		
		//Node x = myTree.find(41);
		//System.out.println(x.getKey());
	}
           
}
