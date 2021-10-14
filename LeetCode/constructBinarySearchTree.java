/*
Given an array of integers preorder, which represents the preorder traversal of a BST (i.e., binary search tree), 
construct the tree and return its root.

It is guaranteed that there is always possible to find a binary search tree with the given requirements 
for the given test cases.

A binary search tree is a binary tree where for every node, any descendant of Node.left has a value strictly 
less than Node.val, and any descendant of Node.right has a value strictly greater than Node.val.

A preorder traversal of a binary tree displays the value of the node first, then traverses Node.left, 
then traverses Node.right.
 */

class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] index = new int[]{0}; //creating an array of index of root node
        return helper(preorder, index, Integer.MIN_VALUE, Integer.MAX_VALUE); //calling the function helper
    }
    
    TreeNode helper(int[] preorder, int[] index, int minValue, int maxValue) {
        if(index[0] == preorder.length)  //if index at 0th position is equal to length of tree return null
            return null;
        
        if(preorder[index[0]] < minValue || preorder[index[0]] > maxValue)  //if preorder index of 0 is smaller than or greater than max value return null
            return null;
        
        int rootVal = preorder[index[0]]; //root value will be assign as the top most index
        index[0]++;
        
        TreeNode node = new TreeNode(rootVal); //creating a new treenode of root value
        node.left = helper(preorder, index, minValue, rootVal); //traversing left child
        node.right = helper(preorder, index, rootVal, maxValue); //traversing right child
        
        return node;
    }
}