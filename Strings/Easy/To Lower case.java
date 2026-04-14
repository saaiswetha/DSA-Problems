// https://leetcode.com/problems/to-lower-case/description/
// EASY

// Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder(s);
        int n = ans.length();

        for(int i=0; i<n; i++){
            char currChar = ans.charAt(i);
            if(currChar >= 65 && currChar<=90){
                currChar += 32;
                ans.setCharAt(i, currChar);
            }
        }
        return ans.toString();
    }
}

// Example 1:

// Input: s = "Hello"
// Output: "hello"
// Example 2:

// Input: s = "here"
// Output: "here"
// Example 3:

// Input: s = "LOVELY"
// Output: "lovely" 

// Constraints:

// 1 <= s.length <= 100
// s consists of printable ASCII characters.
