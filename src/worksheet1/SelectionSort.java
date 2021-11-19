/**
 * Class for Selection Sort Algorithm
 * 
 * @author Chavindu Shamilka Bandara Wijayaratna
 * @version 1.0
 */
package worksheet1;

import java.util.ArrayList;

public class SelectionSort extends AbstractSort{
	
	public SelectionSort(ArrayList<Node> a) {
		al=a;
	}
	
	@Override
	public void sortAlgorithm() {
		System.out.println(" SS Before Sort: ");
		printArrayList(al);
		int n=al.size();
//		System.out.println("this is n: " + n);
		for(int i=0;i<n;i++) {
			int minIndex=i;
			int minValue=al.get(i).getKey();
			for(int j=i+1;j<n;j++) {
				if (al.get(j).getKey()<minValue) {
					minIndex=j;
					minValue=al.get(j).getKey();
//					System.out.println("minvalue"+minValue);
//					System.out.println("minIndex"+minIndex);
				}
				
			}
			swap(al,i,minIndex);
		}
		System.out.println(" SS After Sort: ");
		printArrayList(al);
		
	}
	




	
	
}
