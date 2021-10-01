class Solution {
    String [] key = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String str) {
        // if String is Empty , return Empty ArrayList
        if(str.length() == 0){
            return new ArrayList<>();
        }
        
        return letterCombinations1(str);
    }
    
    public List<String> letterCombinations1(String str) {
        if(str.length() == 0){ // Base Case
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        // let's say Input String is 23
        
        char ch = str.charAt(0); // 2
        String code = key[ch - '0']; // abc
        
        // Recursive Call
        List<String> recAns = letterCombinations1(str.substring(1)); // 3
        List<String> ans = new ArrayList<>();
        
        for(int i=0;i<code.length();i++){ // for abc
            for(String s : recAns)        // making combinations abc with def - ad,ae,af,bd,be,bf,cd,ce,cf
                ans.add(code.charAt(i) + s);
        }
        
        return ans;
    }

}
