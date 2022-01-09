package worksheet3;

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
		for(int i=0;i<adjMatrix.length;i++) {
			for(int j=0; j<adjMatrix[i].length; j++) {
				if(adjMatrix[i][j] == 1) {
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
		return null;
	}

}
