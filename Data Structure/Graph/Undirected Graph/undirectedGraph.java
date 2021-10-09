// Java code to demonstrate Graph representation
// using ArrayList in Java

import java.util.*;

public class undirectedGraph
{	
	int size;
	LinkedList<Integer> adjacencyList[];

	undirectedGraph(int n)
	{
		size = n;
		adjacencyList = new LinkedList[n];
		for (int i=0; i<n; ++i)
			adjacencyList[i] = new LinkedList();
	}

	void addEdge(int v, int w) 
    { 
        adjacencyList[v].add(w);
		adjacencyList[w].add(v); 
    }

	void printGraph()
	{
		
		System.out.println("\nAdjacency list representation of graph");
		for (int i = 0; i < adjacencyList.length; i++) {
			System.out.println(i+" : "+adjacencyList[i]);
		}
	}

	public static void main(String[] args)
	{	
		int numberOfVertices = 9;	
		undirectedGraph graph = new undirectedGraph(numberOfVertices);
		graph.addEdge(0, 3);
		graph.addEdge(1, 7);
		graph.addEdge(2, 5);
		graph.addEdge(3, 6);
		graph.addEdge(4, 1);
        graph.addEdge(5, 8);
        graph.addEdge(6, 0);
        graph.addEdge(7, 4);
        graph.addEdge(7, 5);
        graph.addEdge(8, 6);
        graph.addEdge(8, 2);

		graph.printGraph();
	}
}
