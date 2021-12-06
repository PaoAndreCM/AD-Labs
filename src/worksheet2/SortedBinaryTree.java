package worksheet2;

import java.util.Iterator;

public class SortedBinaryTree<E> {
	private Node root;

	public SortedBinaryTree() {
		
	}

	public Node getRoot() {
		return root;
	}

	public void insert(Node k) {
		root = addRecursive(root, k.getKey());
	}

	public Iterator<Node> iterator() {
		//TODO
		return null; //TODO return correct data
	}
	
	public Node succ(Node k) {
		//TODO
		return null; //TODO return correct data
	}
	
	public Node find(int k) {
		//TODO
		return null; //TODO return correct data
	}
	
	public Node min(Node k) {
		//TODO
		return null; //TODO return correct data
	}
	
	private Node addRecursive(Node current, int k) {
		//insert node when we've achieved a leaf node
		if (current == null) {
			return new Node(k);
		}
		
		// if k is smaller than the current k, go to the left child
		if (k < current.getKey()) {
			current.setLeft(addRecursive(current.getLeft(), k));
		// if k is greater than the current k, go to the right child
		} else if (k > current.getKey()) {
			current.setRight(addRecursive(current.getRight(), k));
		} else {
			// when k already exists in the tree
			return current;
		}
		
		return current;
	}
}
