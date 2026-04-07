// https://leetcode.com/problems/reverse-string/description/
// EASY

class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int l = 0, r = n-1;
        while(l<r){
            char c1 = s[l];
            s[l] = s[r];
            s[r] = c1;
            l++;
            r--;
        }
    }
}

// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
  
// Example 2:

// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]
