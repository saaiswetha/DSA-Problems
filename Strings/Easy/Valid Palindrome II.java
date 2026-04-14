// https://leetcode.com/problems/valid-palindrome-ii/
// EASY

class Solution {
    public boolean isPalindrome(String s, int start, int end){
        System.out.println(start + " "+ end);
        while(start<end){            
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {  // MAIN FUNC
        int n = s.length();
        int l = 0, r = n-1;
        while(l<r){
            char left = s.charAt(l), right = s.charAt(r);
            if(left == right){
                l++; r--;
            } else {
                return isPalindrome(s, l+1, r) || isPalindrome(s,l,r-1);
            }
        }
        return true;
    }
}

// Example 1:
// Input: s = "aba"
// Output: true
  
// Example 2:
// Input: s = "abca"
// Output: true
// Explanation: You could delete the character 'c'.
  
// Example 3:
// Input: s = "abc"
// Output: false

// Example 4:
// Input: s = "deddde"
// Output: true

// Constraints:
// 1 <= s.length <= 105
// s consists of lowercase English letters.
