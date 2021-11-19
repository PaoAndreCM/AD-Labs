/**
 * Class for Quick Sort Algorithm
 * 
 * @author Paola Andrea Carreno Mosquera
 * @version 1.0
 */

package worksheet1;

import java.util.ArrayList;

public class QuickSort extends AbstractSort{
	//if medianMode isn't provided when calling constructor, pivot is last element's key 
	private int medianMode;
	private int medianIndex;
	  
	public QuickSort(ArrayList<Node> arrList) {
		al = arrList;
	}
	
	public QuickSort(ArrayList<Node> arrList, int medianMode) {
		al = arrList;
		this.medianMode = medianMode;
	}
	
	private int findMedian() {
		int medianIndex = al.size() / 2;
		this.medianIndex = medianIndex;
		int median = al.get(medianIndex).getKey();
		System.out.println("This is median = " + median);
		return median;
	}

	private int partition(ArrayList<Node> al, int low, int high){
	      
	    // pivot
		int pivot;
		
		if (medianMode == 0) {
			pivot = al.get(high).getKey();
			
			// Index of smaller element and indicates the right position of pivot found so far
		    int i = (low - 1); 
		  
		    for(int j = low; j <= high - 1; j++) { 
		    	//increment the number of comparisons
		    	// If current element is smaller than the pivot
	        	comparisons = comparisons + 1 ;
	        	printArrayList(al);
		        if (al.get(j).getKey() < pivot) {      
		            // Increment index of the smaller element
		            i++; 
		            swap(al, i, j);
		            if (i != j) {
		            	swaps = swaps +1;
		            	printArrayList(al);
		            } 
		            else {
		            	System.out.println("No Swap");
		            }
		        }
		        System.out.println("value of j = " + j);
		        System.out.println("value of i = " + i);
	        	System.out.println("comparisons = " + comparisons);
	        	System.out.println("================== ");
		    }
		    swap(al, i + 1, high);
		    if ((i + 1) != high) {
		    	swaps = swaps +1;
		    	printArrayList(al);
		    }
		    else {
	        	System.out.println("No Swap");
	        }
		    return (i + 1);
		} else {
			pivot = findMedian();
			
			// Index of smaller element and indicates the right position of pivot found so far
		    int i = (low - 1); 
		  
		    for(int j = low; j <= high - 1; j++) { 
		    	//increment the number of comparisons
		    	// If current element is smaller than the pivot
	        	comparisons = comparisons + 1 ;
	        	printArrayList(al);
		        if (al.get(j).getKey() < pivot) {      
		            // Increment index of the smaller element
		            i++; 
		            swap(al, i, j);
		            if (i != j) {
		            	swaps = swaps +1;
		            	printArrayList(al);
		            } 
		            else {
		            	System.out.println("No Swap");
		            }
		        }
		        System.out.println("value of j = " + j);
		        System.out.println("value of i = " + i);
	        	System.out.println("comparisons = " + comparisons);
	        	System.out.println("================== ");
		    }
		    swap(al, i + 1, medianIndex);
		    if ((i + 1) != high) {
		    	swaps = swaps +1;
		    	printArrayList(al);
		    }
		    else {
	        	System.out.println("No Swap");
	        }
		    return (i + 1);
		}
	     
	      
	    
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