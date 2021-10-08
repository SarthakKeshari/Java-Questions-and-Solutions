// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
// A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
// Example 1:
// Input: digits = "23"
// Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
// Example 2:
// Input: digits = ""
// Output: []

class Solution {
    public String [] key = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String str) {
        if(str.length() == 0){
            return new ArrayList<>();
        }
        
        List<String> ans = letterCombinations1(str);
        return ans;
    }
    public List<String> letterCombinations1(String str) {
        if(str.length() == 0){
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        // String = 23
        
        char ch = str.charAt(0); // 2
        String code = key[ch - '0']; // abc
        
        
        List<String> recAns = letterCombinations1(str.substring(1)); // 3
        List<String> ans = new ArrayList<>();
        
        for(int i=0;i<code.length();i++){
            for(String s : recAns)
                ans.add(code.charAt(i) + s);
        }
        return ans;
    }
}
