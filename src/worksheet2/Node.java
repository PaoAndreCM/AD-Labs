/**
 * Class for Node
 * 
 * @author Paola Andrea Carreno Mosquera
 * @version 1.0
 */

package worksheet2;

public class Node {
	private Node parent;
	private Node left;
	private Node right;
	private int key;
	
	public Node(int key) {
		this.key = key;
		right = null;
		left = null;
	}
	public int getKey() {
		return key;
	}
	
	public Node getParent() {
		return parent;
	}
	
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	public Node getLeft() {
		return left;
	}
	
	public void setLeft(Node left) {
		this.left = left;
	}
	
	public Node getRight() {
		return right;
	}
	
	public void setRight(Node right) {
		this.right = right;
	}
}
