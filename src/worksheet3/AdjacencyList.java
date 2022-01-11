package worksheet3;

import java.util.Iterator;
import java.util.LinkedList;

public class AdjacencyList implements Iterable<Integer> {
	private LinkedList<Integer> adjacencies;

	public AdjacencyList(int id) {

	}

	public int getId() {
		return 4; // TODO return actual value
	}

	public void add(int neighbour) {

	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			private Integer currentIndex = 0;
			@Override
			public boolean hasNext() {
				return currentIndex < adjacencies.size();
			}

			@Override
			public Integer next() {
				return adjacencies.get(currentIndex++);
			}
			
		};
	}

	public boolean contains(int v) {
		// TODO Auto-generated method stub
		return false;
	}
}
