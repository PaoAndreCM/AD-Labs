package worksheet3;

import java.util.Iterator;
import java.util.LinkedList;

public class AdjacencyList implements Iterable<Integer>{

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
		if(v==1) {
			return true;
		} else {
			return false;
		}
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
                int current = adjacencies.get(index);
                index++;
                return current;
            }
        };
    }
	
	
}
