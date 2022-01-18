package worksheet3;

import java.util.Iterator;
import java.util.LinkedList;

public class AdjacencyList implements Iterable<Integer> {

	private LinkedList<Integer> adjacencies;
	private int id;

	public AdjacencyList(int id) {
		this.id = id;
		adjacencies = new LinkedList<Integer>();
	}

	public int getId() {
		return id;
	}

	public void add(int neighbour) {
		adjacencies.add(neighbour);
	}

	public boolean contains(int v) {
		// iterate and check whether v is contained in
		// the adjacency list
		Iterator<Integer> it = this.iterator();
		while (it.hasNext()) {
			if (it.next() == v) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			private int index = 0;

			public boolean hasNext() {
				return index < adjacencies.size();
			}

			@Override
			public Integer next() {
				return adjacencies.get(index++);
			}
		};
	}

	public int size() {
		return adjacencies.size();
	}
	
	public int get(int i) {
		return adjacencies.get(i);
		
	}

}
