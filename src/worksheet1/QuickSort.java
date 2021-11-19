/**
 * Class for Quick Sort Algorithm
 * 
 * @author Paola Andrea Carreno Mosquera
 * @version 1.0
 */

package worksheet1;

import java.util.ArrayList;

public class QuickSort extends AbstractSort{
	  
	public QuickSort(ArrayList<Node> ArrList) {
		al = ArrList;
	}

	private int partition(ArrayList<Node> al, int low, int high){
	      
	    // pivot
	    int pivot = al.get(high).getKey(); 
	      
	    // Index of smaller element and indicates the right position of pivot found so far
	    int i = (low - 1); 
	  
	    for(int j = low; j <= high - 1; j++) { 
	    	//increment the number of comparisons
	    	// If current element is smaller than the pivot
        	comparisons = comparisons + 1 ;
	        if (al.get(j).getKey() < pivot) {      
	            // Increment index of the smaller element
	            i++; 
	            swap(al, i, j);
	            if (i != j) {
	            	swaps = swaps +1;
	            }
	        }
	    }
	    swap(al, i + 1, high);
	    if ((i + 1) != high) {
	    	swaps = swaps +1;
	    }
	    return (i + 1);
	}
	  
	/* The main function that implements QuickSort
	          al --> ArrayList to be sorted,
	          low --> Starting index,
	          high --> Ending index
	 */
	public void quickSort(ArrayList<Node> al, int low, int high){
		
	    if (low < high) { 
	        // pi is partitioning index, al
	        // is now at right place 
	        int pi = partition(al, low, high);
	  
	        // Separately sort elements before
	        // partition and after partition
	        quickSort(al, low, pi - 1);
	        quickSort(al, pi + 1, high);
	    }
	}

	@Override
	public void sortAlgorithm() {
		quickSort(al, 0, al.size() - 1);
	}	  
}