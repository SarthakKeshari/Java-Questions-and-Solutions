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
        // Edge Case - if string length is equal to zero then we have to return the empty ArrayList
        if(str.length() == 0){
            return new ArrayList<>();
        }
        
        List<String> ans = letterCombinations1(str);
        return ans;
    }
    public List<String> letterCombinations1(String str) {
        // Base Case
        // if String length is zero then we will make a new ArrayList, add empty string to it and return it.
        if(str.length() == 0){
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        // For example if String = 23
        
        char ch = str.charAt(0); // Here, we are just taking out the 1st character of the string , i.e 2.
        String code = key[ch - '0']; // Here, we are taking out the String from key Array at index 2, i.e, abc.     
        
        
        List<String> recAns = letterCombinations1(str.substring(1)); // Recursive call // sending the remaining substring to the function again
        List<String> ans = new ArrayList<>();   // Making our own Answer ArrayList
        
        for(int i=0;i<code.length();i++){   // In this, we are making the combinations and adding it to our answer arraylist.
            for(String s : recAns)
                ans.add(code.charAt(i) + s);
        }
        return ans;
    }
}
