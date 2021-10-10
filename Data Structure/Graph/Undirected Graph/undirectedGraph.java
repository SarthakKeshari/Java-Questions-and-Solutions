// Java code to demonstrate Graph representation
// using ArrayList in Java

import java.util.*;

public class undirectedGraph
{	
	int size;				// stores the number of vertices in graph
	LinkedList<Integer> adjacencyList[];	// stores the connected vertices with vertex i

	
	// constructor to initialize instance variables
	undirectedGraph(int n)
	{
		size = n;
		adjacencyList = new LinkedList[n];
		for (int i=0; i<n; ++i)
			adjacencyList[i] = new LinkedList();
	}
	
	// method to add edges to the graph
	void addEdge(int v, int w) 
    	{ 
		// adding two edges as the graph is undirected
        	adjacencyList[v].add(w);	// adding edge v --> w
		adjacencyList[w].add(v); 	// adding edge w --> v
    	}		

	// method to print the graph
	void printGraph()
	{
		System.out.println("\nAdjacency list representation of graph");
		
		// printing the vertices connected with vertex i
		for (int i = 0; i < adjacencyList.length; i++)
			System.out.println(i+" : "+adjacencyList[i]);
		
	}

	// driver code
	public static void main(String[] args)
	{	
		// creating a graph of size 9
		int numberOfVertices = 9;
		
		// creating an instance of undirectedGraph
		undirectedGraph graph = new undirectedGraph(numberOfVertices);
		
		// adding different edges
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

		// calling print method to print the graph
		graph.printGraph();
	}
}
