
/**
 * Abstract class for Sorting Algorithms
 * 
 * @author Paola Andrea Carreno Mosquera, Chavindu Shamilka Bandara Wijayaratna, Omar Zhody Fathy Shaban
 * @version 1.0
 */

package worksheet1;

import java.util.ArrayList;
import java.util.Collections;

public abstract class AbstractSort {
	protected ArrayList<Node> al;
	protected int comparisons;
	protected int swaps;
	
	public int getComparisons() {
		return comparisons;
	}

	public int getSwaps() {
		return swaps;
	}

	public final void swap(ArrayList<Node> al, int i, int j){
		Collections.swap(al, i, j);
	}
	
	public final void printArrayList(ArrayList<Node> al) {
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i).getKey() + " ");
		}
		System.out.println();
	}
	
	public abstract void sortAlgorithm();
	
	public final void start() {
		comparisons = 0;
		swaps = 0;
		System.out.println("Before sort: ");
		printArrayList(al);
		sortAlgorithm();
		System.out.println("Sorted array: ");
		printArrayList(al);
	}
}
