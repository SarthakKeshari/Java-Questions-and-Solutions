// Java program to print DFS
// traversal of given given

import java.util.*;

// This class represents a
// undirected graph using adjacency
// list representation
class DepthFirstSearh 
{
	  int size; // No. of vertices

	  // Array of lists for
	  // Adjacency List Representation
	  LinkedList<Integer> adj[];

	  // Constructor
	  DepthFirstSearh(int size)
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

	  // Recursive function to do depth first traversal
	  void DFS(int v, boolean visited[])
	  {
		// Mark the current vertex as visited
		visited[v] = true;

        	// Print the current node
		System.out.print(v + " ");

    		// Recur for all the vertices adjacent to this vertex
		Iterator<Integer> i = adj[v].listIterator();
		
        	// loop through the vertices connected to current node
        	while (i.hasNext())
		{
            		// store the connected vertices
			int n = i.next();
			if (!visited[n])
                	// call DFS again for the connected vertices
			DFS(n, visited);
		}
	  }

	  // Support function to the recursive DFS method
	  void DFS(int v)
	  {
		    // array to mark the verteices which have been visited
		    boolean visited[] = new boolean[size];

		    // calling the DFS method
		    DFS(v, visited);
	  }

	  // Driver Code
	  public static void main(String args[])
	  {
		DepthFirstSearh graph = new DepthFirstSearh(9);

        	// adding different edges
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.addEdge(4, 0);
        	graph.addEdge(4, 1);
        	graph.addEdge(1, 3);
		
        	int v = 1;  // starting vertex
		System.out.println("Depth First Traversal starting from vertex " + v + " is");

		graph.DFS(v);
	  }
}
