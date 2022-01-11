/*
 * B-REE3-VSP HAW Hamburg
 * 
 * Created on : 10-12-2020
 * Author     : Bj�rn Gottfried
 *
 *-----------------------------------------------------------------------------
 * Revision History (Release 1.0.0.0)
 *-----------------------------------------------------------------------------
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE
 * OLD/NEW     DATE                RFC NO
 *-----------------------------------------------------------------------------
 * --/1.0  | B. Gottfried  | Initial Create.
 *         | 10-12-20      |
 *---------|---------------|---------------------------------------------------
 *         | author        | 
 *         | dd-mm-yy      | 
 *---------|---------------|---------------------------------------------------
 */

package worksheet3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class GraphPainter extends Canvas {

	private static final long serialVersionUID = 1L;
	private Dimension screenSize;

	private Graph aGraph;
	private AdjacencyList aPath;

	public GraphPainter(Graph g) {
		this.aGraph = g;
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame frame = new JFrame("A Graph");
		setSize(screenSize);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);
	}

	public void setAPath(AdjacencyList l) {
		aPath = l;
	}

	/********************************************************************************
	 * Painting the Graph on the screen
	 ********************************************************************************/

	public void paint(Graphics g) {
		int[][] positionsOfVertices = layoutOfGraph();

		drawVertices(g, positionsOfVertices);
		drawEdges(g, positionsOfVertices);
	}

	private void drawVertices(Graphics g, int[][] positions) {
		g.setColor(Color.black);
		for (int v = 0; v < aGraph.numOfVertices(); v++) {
			g.drawOval(positions[v][0], positions[v][1], 50, 50);
			g.drawString("" + v, positions[v][0] + 20, positions[v][1] + 30);
		}
	}

	private void drawEdges(Graphics g, int[][] positions) {
		g.setColor(Color.blue);
		for (int u = 0; u < aGraph.numOfVertices(); u++) {
			for (int v = u + 1; v < aGraph.numOfVertices(); v++) {
				if (aGraph.getWeight(u, v) != 0) {
					if (aPath != null && aPath.contains(v)) {
						g.setColor(Color.red);
					} else {
						g.setColor(Color.blue);
					}
					g.drawLine(positions[u][0] + 25, positions[u][1] + 25, positions[v][0] + 25, positions[v][1] + 25);
				}
			}
		}
	}

	private int[][] layoutOfGraph() {
		int xMin = screenSize.width / 2;
		return new int[][] { { xMin + 0, 100 }, { xMin + 200, 200 }, { xMin + 400, 400 }, { xMin + 200, 600 },
				{ xMin - 0, 700 }, { xMin - 200, 600 }, { xMin - 400, 400 }, { xMin - 200, 200 } };
	}

	/********************************************************************************
	 * Testprogram
	 ********************************************************************************/
	
	public static void main(String[] args) {
		final int H = 0;
		int[][] adjMatrix = {
				{H, 0, 0, 1, 1, 0, 0, 0}, // vertice 0 has two neighbours 3 and 4
				{0, H, 1, 0, 0, 0, 1, 0}, 
				{0, 0, H, 0, 0, 0, 0, 1}, 
				{0, 0, 0, H, 1, 0, 0, 1},
				{0, 0, 0, 0, H, 1, 0, 1},
				{0, 0, 0, 0, 0, H, 1, 1},
				{0, 0, 0, 0, 0, 0, H, 1},
				{1, 0, 0, 0, 0, 0, 0, H}};

		Graph g = new Graph(adjMatrix);
		
		GraphPainter painter = new GraphPainter(g);

		AdjacencyList aPath = g.somePath(0, 3);
		painter.setAPath(aPath);
		
		// Print all the vertices and their neighbours
		for (int v = 0; v < g.numOfVertices(); v++) {
			System.out.print("Neighbors from corner "+v+":");
			AdjacencyList adjList = g.getNeighboursFor(v);
			for (Integer neighbour: adjList) {
				System.out.print(" " + neighbour.toString());
			}
			System.out.println();
		}
		System.out.println("Number of Edges: "+g.numOfEdges());
		
		System.out.println("adj list of 3:");
		AdjacencyList adjList = g.getNeighboursFor(3);
		for (Integer neighbour: adjList) {
			System.out.print(" " + neighbour.toString());
		}
	}
}