package worksheet3;

import java.util.ArrayList;

public class AdjacencyLists {

	private ArrayList<AdjacencyList> neighbourList;

	public AdjacencyLists(AdjacencyMatrix neighboursMatrix) {
		neighbourList = new ArrayList<AdjacencyList>();
		for (int i = 0; i < neighboursMatrix.numOfVertices(); i++) {
			AdjacencyList x = new AdjacencyList(i);
			for (int k = 0; k < neighboursMatrix.numOfVertices(); k++) {
				if (neighboursMatrix.get(i, k) == 1) {
					x.add(k);
				}
			}
			neighbourList.add(x);
		}
	}

	public AdjacencyList getNeighboursFor(int v) {
		return neighbourList.get(v);
	}

}
