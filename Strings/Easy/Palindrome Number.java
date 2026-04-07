// https://leetcode.com/problems/palindrome-number/
// EASY
// Soln uses int to string conversion
// but use math to build the reversed number as this soln takes more time and space

class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int n = s.length();
        // int l = 0, r = n - 1;

        if(x<0)
            return false;

        for(int l=0, r=n-1; l<r; l++, r--){
            if(s.charAt(l) != s.charAt(r))
                return false;
        }
        return true;
    }
} 

// Example 1:
// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
  
// Example 2:
// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
  
// Example 3:
// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
