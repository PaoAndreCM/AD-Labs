/**
 * Class for main 
 * 
 * @author Paola Andrea Carreno Mosquera
 * @version 1.0
 */
package worksheet2;

import java.util.Iterator;

public class TestProgram {
	
	// This function generates a random number between 0 and max
	public static int randNumItems(int max) {
	    int rand = (int)(Math.random() * max);
        //System.out.println(rand);
        return rand;
	}
	
	//This function prints a tree inorder
	public static void printTree(SortedBinaryTree<Node> tree) {
		Iterator<Node> iterator = tree.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next().getKey());
			System.out.print(" ");
		}
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
		//printTree(myTree);
		
		//One store of our brand is closing down. The inventory of that store, inventory2, will be added to the inventory of
		//another store in the same city, inventory 1:
		
		//iterate through each node of one tree
		//insert said node in other tree

		//First tree to be merged
		System.out.println();
		System.out.println("-----------------");
		System.out.println("Trees to be merged");
		SortedBinaryTree<Node> inventory1 = new SortedBinaryTree<Node>();
		
		// Generating and inserting 10 nodes in first tree
		for (int i = 0; i < 10; i++) {
			Inventory NumInStock = new Inventory(randNumItems(150));
			inventory1.insert(NumInStock);
		}
		System.out.println("Tree A: ");
		printTree(inventory1);
		//Second tree to be merged 1
		SortedBinaryTree<Node> inventory2 = new SortedBinaryTree<Node>();
				
		// Generating and inserting 10 nodes in second tree
		for (int i = 0; i < 10; i++) {
			Inventory NumInStock = new Inventory(randNumItems(150));
			inventory2.insert(NumInStock);
		}
		System.out.println();
		System.out.println("Tree B: ");
		printTree(inventory2);
		
		iterator = inventory2.iterator();
		
		//iterating through tree inventory2 and inserting each of its nodes in tree inventory1
		while (iterator.hasNext()) {
			Node node = new Node(iterator.next().getKey());
			inventory1.insert(node);
		}
		
		System.out.println();
		System.out.println("-----------------");
		System.out.println("Merged tree: ");
		iterator = inventory1.iterator();
		printTree(inventory1);
		
		//Node x = myTree.find(41);
		//System.out.println(x.getKey());
	}
           
}
