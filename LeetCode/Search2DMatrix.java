//Solution to https://leetcode.com/problems/search-a-2d-matrix/submissions/

//Approach: An element in the matrix can be accessed by matrix[i/c][i%c] where c is the number of columns.
//We check if the element matches the target during traversal. If yes it return true.
//In case where the current element in matrix is greater than target, we return false.
//This is because the matrix is sorted and if the value is greater it implies that the target element does not exist.


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      
        int c = matrix[0].length;
        int r = matrix.length;
      
        for(int i=0; i< c*r; i++) {
            if (matrix[i/c][i%c] == target) return true;
            else if (matrix[i/c][i%c] > target) return false;
        }
        return false;
  }
}
