package worksheet2;

import java.util.Iterator;

public class SortedBinaryTree<E> {
	private Node root;

	public SortedBinaryTree() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}
	
	public void insert(Node k) {
		if (root == null) {
			root = k;
		} else {
			insertAfter(root, k, null);
		}
	}

	private void insertAfter(Node root, Node k, Node pre) {
		if (root == null) {
			root = k;
			k.setLeft(null);
			k.setRight(null);
			k.setParent(pre);
			//depending on k > or < than pre 
			if (k.getKey() < pre.getKey()) {
				pre.setLeft(k);
			} else {
				pre.setRight(k);
			}
		} else if (k.getKey() < root.getKey()) {
			insertAfter(root.getLeft(),k,root);
			
		} else {
			insertAfter(root.getRight(),k,root);
		}
	
}

	public Iterator<Node> iterator() {
		return new Iterator<Node>() {
			private Node temp = min(root);
			
			@Override
			public boolean hasNext() {
				return temp != null;
			}
			
			@Override
			public Node next() {
				Node current = temp;
				temp = succ(temp);
				//System.out.println(current.getKey());
				return current;
				
			}
		};
	}
	
	public Node succ(Node k) {
		if (k.getRight() != null) {
			return min(k.getRight());
		} else {
			Node p = k.getParent();
			while (p != null && p.getKey() <= k.getKey()) {
				p = p.getParent();
			}
			return p;
		}
	}
	
	public Node find(int k) {
		if (root == null) {
			return null;
		}
		return findRecursive(root, k);
	}
	
	public Node min(Node k) {
		while (k.getLeft() != null) {
			k = k.getLeft();
		}
		return k;
	}
	
	private Node findRecursive(Node root, int k) {
		// if the value to be found (k) is equal to the node we're in, return that node
		if (root.getKey() == k) {
			return root;
			
		// travel through the tree the tree
		} else {
			//if the current value to be found is larger than the value to be found, go to the right
			if (root.getKey() > k) {
				return findRecursive(root.getLeft(), k);
			} else {
			//if the current value to be found is smaller than the value to be found, go to the left
				return findRecursive(root.getRight(), k);
			}
		}
	}
}
