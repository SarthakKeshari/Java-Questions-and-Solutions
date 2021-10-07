/*Given an m x n grid of characters board and a string word, return true if word exists in the grid.
The word can be constructed from letters of sequentially adjacent cells,
 where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 */

class Solution {
    public boolean exist(char[][] board, String word) {
        
        int M=board.length, N=board[0].length; //Finding out no of rows and column in matrix
        
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(board[i][j]==word.charAt(0)) //comparing each element of matrix with first letter of word
                {
                    if(dfs(board,i,j,word,0)) //applying dfs and checking if the word is present or not
                        return true;
                }   
            }
        }
        return false;
    }
    
    public boolean dfs(char[][] board,int i,int j,String word,int pos)
    {
        if(pos==word.length()) //if position of word is equal to length of word that means word is present in array
            return true;
        
       int M=board.length, N=board[0].length; 
            if(i < 0 || i >= M || j < 0 || j >= N || board[i][j]!=word.charAt(pos) || board[i][j]=='#') //checking the necessary condition to find out whether word exists or not
            return false;
        
        char dup=board[i][j];
        board[i][j]='#';
        
        boolean ans =  dfs(board,  i + 1, j, word, pos + 1) ||   //traversing one letter right
                            dfs(board, i - 1, j, word, pos + 1) ||  ////traversing one letter left
                                dfs(board, i, j + 1, word, pos + 1) ||  //traversing one letter up
                                    dfs(board,  i, j - 1, word, pos + 1);  ////traversing one letter down
        
        board[i][j]=dup; //backtracking the string 
            return ans;
    }
}
