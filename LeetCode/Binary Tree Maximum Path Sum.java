// link- https://leetcode.com/problems/binary-tree-maximum-path-sum/

// Approach:
// Since a binary tree can have max 2 children so the path with max sum can either include both the children or one 
// depending upon the max value that can be generated.
// The same logic has been implemented in the following code which stores the final answer in the variable max 


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = -1001;
    
    private int solve(TreeNode root) {
        if(root == null) return 0;
        
        int ans_left = 0, ans_right = 0;
        if(root.left != null) ans_left = Math.max(solve(root.left), 0);
        if(root.right != null) ans_right = Math.max(solve(root.right), 0);
        
        int temp = root.val + Math.max(ans_left, ans_right);
        max = Math.max(temp, max);
        max = Math.max(root.val + ans_left + ans_right, max);
        return temp;
        
    }
    
    public int maxPathSum(TreeNode root) {
        max = -1001;
        solve(root);
        return max;
    }
}
