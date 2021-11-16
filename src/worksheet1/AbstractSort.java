package worksheet1;

import java.util.ArrayList;
import java.util.Collections;

public abstract class AbstractSort {
	

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
}
