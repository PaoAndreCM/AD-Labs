package worksheet1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		MensAccesories sunglasses = new MensAccesories(9);
		MensAccesories ties = new MensAccesories(26);
		MensAccesories cufflinks = new MensAccesories(16);
		MensAccesories wallets = new MensAccesories(34);
		MensAccesories belts = new MensAccesories(31);
		MensAccesories hats = new MensAccesories(5);
		MensAccesories gloves = new MensAccesories(10);
		MensAccesories scarves = new MensAccesories(18);
		MensAccesories handkerchiefs = new MensAccesories(46);
		MensAccesories watches = new MensAccesories(12);
		
		ArrayList<Node> DataSet = new ArrayList<Node>();   //Should this be an arrayList of Nodes or of MensAccessories?
		
		DataSet.add(sunglasses);
		DataSet.add(ties);
		DataSet.add(cufflinks);
		DataSet.add(wallets);
		DataSet.add(belts);
		DataSet.add(hats);
		DataSet.add(gloves);
		DataSet.add(scarves);
		DataSet.add(handkerchiefs);
		DataSet.add(watches);
		QuickSort qSort=new QuickSort();
		SelectionSort sSort = new SelectionSort(DataSet);

		
		
//		qSort.printArray(DataSet, 10);
//	    qSort.quickSort(DataSet, 0,9);
//	    System.out.println("Sorted array: ");
//	    qSort.printArray(DataSet, 10);
		sSort.sortAlgorithm();
//		for(int i = 0; i < DataSet.size(); i++)
//	        System.out.print(DataSet.get(i).getKey() + " ");
//	          
//	    System.out.println();
	}

	private static void start() {
		
	}

}
