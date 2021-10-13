// Java program to print BFS
// traversal of given given

import java.util.*;

// This class represents a
// undirected graph using adjacency
// list representation
public class BreadthFirstSearh 
{
	int size; // No. of vertices

	// Array of lists for
	// Adjacency List Representation
	LinkedList<Integer> adj[];

	// Constructor
	BreadthFirstSearh(int size)
	{
		this.size = size;
		adj = new LinkedList[size];
		for (int i = 0; i < size; ++i)
			adj[i] = new LinkedList();
	}

	// Function to add an edge into the graph (undirected)
	void addEdge(int v, int w)
	{
		adj[v].add(w); // add edge v --> w
        adj[w].add(v); // add edge w --> v
	}

	void BFS(int v)
    	{
        	// Mark all the vertices as not visited(By default
        	// set as false)
        	boolean visited[] = new boolean[size];
 
        	// Create a queue for BFS
        	LinkedList<Integer> queue = new LinkedList<Integer>();
 
        	// Mark the current node as visited
        	visited[v]=true;
	
        	// add the current node in the queue
        	queue.add(v);
 
        	// loop till queue becomes empty
        	while (queue.size() != 0)
        	{
        	    // remove the vertex from the front of queue
            	    v = queue.poll();

           	    // print the vertex
          	    System.out.print(v+" ");
 
	            // Check all adjacent vertices of the removed vertex v
	            // If a adjacent has not been visited, then mark it
	            // visited and add it to the queue
	            Iterator<Integer> i = adj[v].listIterator();
	            while (i.hasNext())
	            {
        	        int n = i.next();
                	if (!visited[n])
                	{
                	    visited[n] = true;
                	    queue.add(n);
                	}
            	    }
        	}
    	}
	// Driver Code
	public static void main(String args[])
	{
		BreadthFirstSearh graph = new BreadthFirstSearh(5);

        	// adding different edges
        	graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.addEdge(4, 0);
        	graph.addEdge(4, 1);
        	graph.addEdge(1, 3);
		
        	int v = 1;  // starting vertex 
		System.out.println("Breadth First Traversal starting from vertex " + v + " is");

		graph.BFS(v);
	}
}
