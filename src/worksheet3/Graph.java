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

	public AdjacencyList somePath(int u, int length) {
		// creates adjacency list which will contain the path
		AdjacencyList path = new AdjacencyList(u);

		for (int i = 0; i < length; i++) {
			// add u to path
			path.add(u);
			
			// find adjacency list of u
			AdjacencyList adjList = this.getNeighboursFor(u);
			
			// choose one number from adjList randomly:
			// generate one random number from 0 to adj size
			Random randIndex = new Random();
			int randomIndex = randIndex.nextInt(adjList.size());
			//System.out.println("This is the random generated index " + randomIndex);
			
			// get the number in that index
			int vertexToBeAdded = adjList.get(randomIndex);
			//System.out.println("This is the number that will be added to the path " + vertexToBeAdded);

			// update u
			u = vertexToBeAdded;
			
		}
		
		// Print path
		System.out.print("Path: ");
		for (int v = 0; v < path.size(); v++) {
			System.out.print(path.get(v) +  " ");
		}
		System.out.println();

//		// repeat this code as many times as the length desired
//		for (int i = 0; i < length; i++) {
//			// generates a random number between 0 and 7 (the available vertices)
//			Random rand2 = new Random();
//			int vertexToBeAdded = rand2.nextInt(7);
//			AdjacencyList adjList = this.getNeighboursFor(u);
//			// checks that random number is in the adjacency list of v
//			if (adjList.contains(vertexToBeAdded)) {
//				// adds vertex to path if it is in the adjacency list of v
//				path.add(vertexToBeAdded);
//				// TODO it doesn't need to move to the next v but rather 
//				//      to the next number in adjacency list
//				u = vertexToBeAdded;
//			} else {
//				// if vertex isn't in adjacency list, it doesn't get added
//				// and index doesn't change
//				i--;	
//			}

		return path;

	}

}
