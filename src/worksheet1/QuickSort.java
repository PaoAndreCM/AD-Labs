package worksheet1;

import java.util.ArrayList;
//import java.util.Collections;

public class QuickSort extends AbstractSort{
	  
	/* This function takes last element as pivot, places
	   the pivot element at its correct position in sorted
	   array, and places all smaller (smaller than pivot)
	   to left of pivot and all greater elements to right
	   of pivot */
	private int partition(ArrayList<Node> al, int low, int high){
	      
	    // pivot
	    int pivot = al.get(high).getKey(); 
	      
	    // Index of smaller element and
	    // indicates the right position
	    // of pivot found so far
	    int i = (low - 1); 
	  
	    for(int j = low; j <= high - 1; j++)
	    {
	          
	        // If current element is smaller 
	        // than the pivot
	        if (al.get(j).getKey() < pivot) {
	        	comparisons = comparisons + 1 ;      
	            // Increment index of 
	            // smaller element
	            i++; 
	            swap(al, i, j);
	            swaps = swaps +1;
	        }
	    }
	    swap(al, i + 1, high);
	    swaps = swaps +1;
	    return (i + 1);
	}
	  
	/* The main function that implements QuickSort
	          al --> ArrayList to be sorted,
	          low --> Starting index,
	          high --> Ending index
	 */
	public void quickSort(ArrayList<Node> al, int low, int high){
	    if (low < high) 
	    {
	    	comparisons = comparisons + 1 ; 
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
		
	}

	
	  
}
	  
	// This code is modified by Paola Carreño based on Ayush Choudhary's contribution on GeeksForGeeks.com