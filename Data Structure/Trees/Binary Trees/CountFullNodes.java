//Question: Count all the full nodes(nodes whose left and right children are not null)

//initializing node class
class Node{
	int key;
	Node left,right;
	public Node(int data) {
		key=data;
		left=right=null;
	}
}

public class CountFullNodes{
	Node root;
	CountFullNodes(){
		root=null;
	}
	//recursive function to get the count of full nodes
	int getFullCount(Node node) {
		if(node==null)
			return 0;
		int count=0;
		if(node.left!=null && node.right!=null)
			count++;
		count+=(getFullCount(node.left)+getFullCount(node.right));
		return count;
	}
  public static void main(String[] args) {
  	CountFullNodes bs=new CountFullNodes();
  	bs.root=new Node(1);
  	bs.root.left = new Node(7);  
      bs.root.right = new Node(3);  
      bs.root.left.right = new Node(6);  
      bs.root.left.right.left = new Node(2);  
      bs.root.left.right.right = new Node(4);  
      bs.root.right.right = new Node(9);  
      bs.root.right.right.left = new Node(11);
      bs.root.right.right.right = new Node(10);
      System.out.println(bs.getFullCount(bs.root));
  }
}
