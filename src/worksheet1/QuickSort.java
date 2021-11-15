package worksheet1;

import java.util.ArrayList;

public class QuickSort {

	// A utility function to swap two elements
	static void swap(ArrayList<Node> al, int i, int j)
	{
	    Node temp = al.get(i);
	    //al.add(i) = al.get(j);
	    //al.add(j) = temp;
	}
	  
	/* This function takes last element as pivot, places
	   the pivot element at its correct position in sorted
	   array, and places all smaller (smaller than pivot)
	   to left of pivot and all greater elements to right
	   of pivot */
	static int partition(ArrayList<Node> al, int low, int high)
	{
	      
	    // pivot
	    Node pivot = al.get(high); 
	      
	    // Index of smaller element and
	    // indicates the right position
	    // of pivot found so far
	    int i = (low - 1); 
	  
	    for(int j = low; j <= high - 1; j++)
	    {
	          
	        // If current element is smaller 
	        // than the pivot
	        if (al.get(j) < pivot) 
	        {
	              
	            // Increment index of 
	            // smaller element
	            i++; 
	            swap(al, i, j);
	        }
	    }
	    swap(al, i + 1, high);
	    return (i + 1);
	}
	  
	/* The main function that implements QuickSort
	          arr[] --> Array to be sorted,
	          low --> Starting index,
	          high --> Ending index
	 */
	static void quickSort(ArrayList<Node> al, int low, int high)
	{
	    if (low < high) 
	    {
	          
	        // pi is partitioning index, arr[p]
	        // is now at right place 
	        int pi = partition(al, low, high);
	  
	        // Separately sort elements before
	        // partition and after partition
	        quickSort(al, low, pi - 1);
	        quickSort(al, pi + 1, high);
	    }
	}
	  
	// Function to print an array 
	static void printArray(int[] arr, int size)
	{
	    for(int i = 0; i < size; i++)
	        System.out.print(arr[i] + " ");
	          
	    System.out.println();
	}
	  
}
	  
	// This code is contributed by Ayush Choudhary