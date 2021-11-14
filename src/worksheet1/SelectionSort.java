package worksheet1;

import java.util.ArrayList;

public class SelectionSort {
	ArrayList<Node> a=new ArrayList<Node>();
	
	public void SelectionSort(ArrayList<Node> a) {
		int n=a.size();
		for(int i=0;i<n;i++) {
			int minIndex=i;
			int minValue=a.get(i).getKey();
			for(int j=i+1;j<n;j++) {
				if (a.get(j).getKey()<minValue) {
					minIndex=j;
					minValue=a.get(j).getKey();
					System.out.println("minvalue"+minValue);
					System.out.println("minIndex"+minIndex);
				}
				
			}
			swap(a.get(i),a.get(minIndex));
		}
	}
	
	public void swap(Node node,Node node2) {
		Node temp =node;
		node=node2;
		node=temp; 
	}
	
	
}
