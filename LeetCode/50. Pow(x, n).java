//  https://leetcode.com/problems/powx-n/

class Solution { 
    
    public double myPow(double x, int n) {
        return n > 0 ? pow(x,n) : 1/pow(x,n);
    }
    
    static double pow(double x, int n) {
        double val = 0;
        if(n == 0){
            return 1;
        }
        else if(n % 2 == 0){
            val = pow(x, n/2);
            return val*val;
        }
        else{
            val = pow(x, n/2);
            return val*val*x;
        }
    }
}
