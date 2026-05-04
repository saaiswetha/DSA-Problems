// EASY
// https://leetcode.com/problems/reverse-only-letters/description/

// Given a string s, reverse the string according to the following rules:

// All the characters that are not English letters remain in the same position.
// All the English letters (lowercase or uppercase) should be reversed.
// Return s after reversing it.

class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l = 0, r = sb.length()-1;
        while(l<r){
             if(!(((int)s.charAt(l) >=97 && (int)s.charAt(l)<=122) || ((int)s.charAt(l) >=65 && (int)s.charAt(l)<=90))) {
                 l++;
             } else if(!(((int)s.charAt(r) >=97 && (int)s.charAt(r)<=122) || ((int)s.charAt(r) >=65 && (int)s.charAt(r)<=90))){
                r--;
             } else {
                char c = sb.charAt(l);
                sb.setCharAt(l, sb.charAt(r));
                sb.setCharAt(r, c);
                l++;
                r--;
             }
        }
        return sb.toString();
    }
}

// Example 1:
// Input: s = "ab-cd"
// Output: "dc-ba"
  
// Example 2:
// Input: s = "a-bC-dEf-ghIj"
// Output: "j-Ih-gfE-dCba"
  
// Example 3:
// Input: s = "Test1ng-Leet=code-Q!"
// Output: "Qedo1ct-eeLg=ntse-T!"
 
// Constraints:

// 1 <= s.length <= 100
// s consists of characters with ASCII values in the range [33, 122].
// s does not contain '\"' or '\\'.
