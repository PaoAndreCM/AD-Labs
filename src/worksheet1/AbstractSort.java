package worksheet1;

import java.util.ArrayList;
import java.util.Collections;

public abstract class AbstractSort {
	protected ArrayList<Node> al;
	protected int comparisons;
	protected int swaps;

//	public final void swap(ArrayList list, int firstInd, int secondInd) {
//		Object temp = list.get(firstInd);
//		list.set(firstInd, list.get(secondInd));
//		list.set(secondInd, temp);
//	} 
	public final void swap(ArrayList<Node> al, int i, int j){
		Collections.swap(al, i, j);
	}
	
	public final void printArrayList(ArrayList<Node> al) {
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i).getKey() + " ");
		}
		System.out.println();
		System.out.println("\nNumber of comps = " + comparisons);
		System.out.println("Number of swaps = " + swaps);
	}
	
	public abstract void sortAlgorithm();
	
	public final void start() {
		comparisons = 0;
		swaps = 0;
		sortAlgorithm();
	}
}
