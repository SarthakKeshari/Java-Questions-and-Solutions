// Question:
// Write a Java program to identify the kth smallest element in the binary search tree where k =8.

import java.util.*;
import java.io.*;

// initializing node class
class Node {
	int data;
	Node left, right;
	Node(int x) // Node contructor 
	{
		data = x;
		left = right = null;
	}
}

public class BinaryTree {
	
	static int count = 0;
	// insertion of element using recursion
	public static Node insert(Node root, int data)
	{
		if (root == null)
			return new Node(data);
		if (data < root.data) // if the data is less than node data go left
			root.left = insert(root.left, data);
		
		else if (data > root.data)  // if data is greater than node data go right
			root.right = insert(root.right, data);
		
		return root;
	}
	
	public static Node kthSmallest(Node root, int k)
	{
		if (root == null)
			return null;
		Node left = kthSmallest(root.left, k); // at this line we go to leftmost node, so that  we can start counting nth smallest from thatnode (leftmost)
	
		if (left != null)
			return left; 
		count++;
		
		if (count == k) // if we find the element at k return k;
			return root;
	
		return kthSmallest(root.right, k);
	}
	
	public static void printKthSmallest(Node root, int k)
	{
		count = 0;
		Node res = kthSmallest(root, k); // get the smallest element 
		
		if (res == null)
			System.out.println("can't print as k is greater than nodes");
		else
			System.out.println(k+"-th Smallest Element is " + res.data);
	}
		
	public static void main (String[] args) {
		Scanner take = new Scanner(System.in);
		Node root = null; // initialising root node
		
        	System.out.print("enter number of elements in the list: ");
			int size = take.nextInt();
	
	        while(size-- !=0)
			root = insert(root, take.nextInt());  // calling insert method to insert the element in the tree
		System.out.print("enter k: ");
		int k = take.nextInt();
		printKthSmallest(root, k); //calling this function to find the kth smallest element
		
		
	}
}
