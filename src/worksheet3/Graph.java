package worksheet3;

import java.util.Random;

public class Graph {

	private AdjacencyMatrix neighboursMatrix;
	private AdjacencyLists neighboursLists;
	private int[][] adjMatrix;

	public Graph(int[][] adjMatrix) {
		this.adjMatrix = adjMatrix;
		neighboursMatrix = new AdjacencyMatrix(adjMatrix);
		neighboursLists = new AdjacencyLists(neighboursMatrix);
	}

	public AdjacencyList getNeighboursFor(int v) {
		return neighboursLists.getNeighboursFor(v);
	}

	public int numOfVertices() {
		return neighboursMatrix.numOfVertices();
	}

	public int numOfEdges() {
		int num = 0;
		for (int i = 0; i < adjMatrix.length; i++) {
			for (int j = 0; j < adjMatrix[i].length; j++) {
				if (adjMatrix[i][j] == 1) {
					num++;
				}
			}
		}
		return num;
	}

	public int getWeight(int u, int v) {
		return neighboursMatrix.get(u, v);
	}

/* 
 * TODO find out why path generated ins't always connected
 *      find out why path isn't always the length required
 **/  
	public AdjacencyList somePath(int u, int length) {
		// creates adjacency list which will contain the path
		AdjacencyList path = new AdjacencyList(u);
		
		// assigns u to a dummy variable v which will get updated in the loop
		int v = u;
		
		// repeat this code as many times as the length desired
		for (int i = 0; i < length; i++) {
			// generates a random number between 0 and 7 (the available vertices)
			Random rand2 = new Random();
			int vertexToBeAdded = rand2.nextInt(7);
			AdjacencyList adjList = this.getNeighboursFor(v);
			// checks that random number is in the adjacency list of v
			if (adjList.contains(vertexToBeAdded)) {
				// adds vertex to path if it is in the adjacency list of v
				path.add(vertexToBeAdded);
				v = u++;
			} else {
				// if vertex isn't in adjacency list, it doesn't get added
				// and index doesn't change
				i--;	
			}
			
			// This is another way to achieve a path:
			
			// generate adjacency list of node of interest (initially u)
			// select random number from said adjacency list
			// selected number is new node of interest
			// repeat
			
		}
		return path;
	}

}
