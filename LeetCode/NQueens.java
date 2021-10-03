// link https://leetcode.com/problems/n-queens/

// Approach : We use a recursive backtracking approach to solve 
// this problem

// To get the intuition behind the solution Watch this video
// https://youtu.be/Ph95IHmRp5M

import java.util.List;
import java.util.ArrayList;
class NQueens {
    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> l = new ArrayList<List<String>>();
        int a[] = new int[n];
        
        findNQueens(l,n,0,a);
        return l;
        
    }
    
    public void findNQueens(List<List<String>> l, int n, int k, int a[])
    {
        // if k == n then it means we have successfully placed all
        // the N Queens so we add it to the resultant list
        if(k == n)
        {
            List<String> board = new ArrayList<String>();
            for(int row = 0; row < n; row++)
            {
                StringBuilder sb = new StringBuilder(n);   
                for(int col = 0; col < n; col++)
                {
                    if(col == a[row])
                    {
                        sb.append("Q");
                    }
                    else
                    {
                        sb.append(".");
                    }
                }
                board.add(sb.toString());
                
            }
            l.add(board);
        }
        
        // The for loop traverses the entire matrix placing each 
        // queen at a position and checking if it is valid
        for(int i = k; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                
                if(isValid(i,j,a))
                {
                    //System.out.println(i + " " + j);
                    a[i] = j;
                    findNQueens(l,n,i+1,a);
                }
            }
            return;
        }
    }
    
    //This function checks whether placing Queen at a particular 
    // position affects previously placed Queens
    public boolean isValid(int i, int j, int a[])
    {
        for(int k = 0; k < i; k++)
        {
            int diff = j - a[k];
            if(a[k] == j || i - k == diff || i - k == -diff)
            {
                return false;
            }
        }
        return true;
    }
}