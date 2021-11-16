package worksheet1;

import java.util.ArrayList;
import java.util.Collections;

public abstract class AbstractSort {
	ArrayList<Node> al=new ArrayList<Node>();

//	public final void swap(ArrayList list, int firstInd, int secondInd) {
//		Object temp = list.get(firstInd);
//		list.set(firstInd, list.get(secondInd));
//		list.set(secondInd, temp);
//	} 
	public final void swap(ArrayList<Node> al, int i, int j){
		Collections.swap(al, i, j);
	}
	public abstract void sortAlgorithm();
	public void start() {
		sortAlgorithm();
	}
	public void printArrayList(ArrayList<Node> al) {
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i).getKey() + " ");
		}
		System.out.println();
	}
}
