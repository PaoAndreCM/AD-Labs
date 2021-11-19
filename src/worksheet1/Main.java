/**
 * Class for Test program
 * 
 * @author Paola Andrea Carreno Mosquera, Shamilka 
 * @version 1.0
 */

package worksheet1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		MensAccessories sunglasses = new MensAccessories(9);
		MensAccessories ties = new MensAccessories(26);
		MensAccessories cufflinks = new MensAccessories(16);
		MensAccessories wallets = new MensAccessories(34);
		MensAccessories belts = new MensAccessories(31);
		MensAccessories hats = new MensAccessories(5);
		MensAccessories gloves = new MensAccessories(10);
		MensAccessories scarves = new MensAccessories(18);
		MensAccessories handkerchiefs = new MensAccessories(46);
		MensAccessories watches = new MensAccessories(12);
		
		ArrayList<Node> DataSet = new ArrayList<Node>();
		
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
		QuickSort qSort=new QuickSort(DataSet);
		//SelectionSort sSort = new SelectionSort(DataSet);

		
		qSort.start();
		int swaps = qSort.getSwaps();
		int comps = qSort.getComparisons();
		System.out.println("Swaps = " + swaps);
		System.out.println("Comparisons = " + comps);	
	}
}
