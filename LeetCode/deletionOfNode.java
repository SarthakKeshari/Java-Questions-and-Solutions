import java.util.*;
public class deletionOfNode {
	public static void main(String[] args) {
		
		 /* Construct the following tree
       1
     /   \
    /     \
   2       3
  /      /   \
 /      /     \
4      5       6
      / \
     /   \
    7     8
*/


			Node root=new Node(1);
			root.left=new Node(2);
			root.right=new Node(3);
			root.left.left=new Node(4);
			root.right.left=new Node(5);
			root.right.right=new Node(6);
			root.right.left.left=new Node(7);
			root.right.left.right=new Node(8);
			//Recursive
			deleteNode(root,6);
			PrintNodes(root);
			
		}
	static int findMin(Node root){
        if(root.left!=null) return findMin(root.left);
        else return root.data;
    }
    public static Node deleteNode(Node root, int key) {
        if(root==null){
            return null;
        }
        if(root.data>key){
            root.left=deleteNode(root.left,key);
        }
        else if(root.data<key){
            root.right=deleteNode(root.right,key);
        }
        else{
            if(root.left!=null && root.right!=null){
                int rightMin=findMin(root.right);
                root.data=rightMin;
                root.right=deleteNode(root.right,rightMin);
            }else if(root.left!=null){
                return root.left;
            }else if(root.right!=null){
                return root.right;
            }else{
                return null;
            }
        }
        return root;
    }
    static void PrintNodes(Node root) {
		if(root==null) return;
		PrintNodes(root.left);
		System.out.print(root.data+" ");
		PrintNodes(root.right);
	}
}
class Node {
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
